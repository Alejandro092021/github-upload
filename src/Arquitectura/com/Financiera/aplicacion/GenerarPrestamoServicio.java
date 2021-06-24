package Arquitectura.com.Financiera.aplicacion;

import Arquitectura.com.Financiera.dominio.Cliente;
import Arquitectura.com.Financiera.dominio.Cuota;
import Arquitectura.com.Financiera.dominio.Prestamo;
import Arquitectura.com.Financiera.persistencia.ClienteDAOPostgre;
import Arquitectura.com.Financiera.persistencia.GestorJDBC;
import Arquitectura.com.Financiera.persistencia.GestorJDBCPostgre;
import Arquitectura.com.Financiera.persistencia.PrestamoDAOPostgre;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class GenerarPrestamoServicio {

    GestorJDBC gestorJDBC;
    ClienteDAOPostgre clienteDAO;
    PrestamoDAOPostgre prestamoDAO;

    public GenerarPrestamoServicio() {
        gestorJDBC = new GestorJDBCPostgre();
        clienteDAO = new ClienteDAOPostgre(gestorJDBC);
        prestamoDAO = new PrestamoDAOPostgre(gestorJDBC);
    }

    public Cliente buscarCliente(String dni) throws Exception {
        gestorJDBC.abrirConexion();
        Cliente cliente = clienteDAO.buscarCliente(dni);
        gestorJDBC.cerrarConexion();
        return cliente;
    }

    public List<Cuota> generarCronograma(Prestamo prestamo) throws Exception {
        List<Cuota> lista;
        if (!prestamo.esMontoValido()) {
            JOptionPane.showMessageDialog(null, "Monto no valido");
            throw new Exception();
        }
        if (!prestamo.esTEAValida()) {
            JOptionPane.showMessageDialog(null, "La tasa efectiva anual no es valida");
            throw new Exception();
        }
        if (!prestamo.esPeriodoValido()) {
            JOptionPane.showMessageDialog(null, "El periodo del prestamo no es valido");
            throw new Exception();
        }
        prestamo.generarListaCuotas();
        lista = prestamo.getListaCuotas();
        return lista;
    }

    public void guardarPrestamo(Prestamo prestamo) throws Exception {
        gestorJDBC.abrirConexion();
        try {
            gestorJDBC.iniciarTransaccion();
            prestamoDAO.ingresarPrestamo(prestamo);
            gestorJDBC.terminarTranssaccion();
        } catch (SQLException e) {
            gestorJDBC.cancelarTransaccion();
        }
    }
}
