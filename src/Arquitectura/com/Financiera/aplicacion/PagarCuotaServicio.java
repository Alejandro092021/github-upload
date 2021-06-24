package Arquitectura.com.Financiera.aplicacion;

import Arquitectura.com.Financiera.dominio.Pago;
import Arquitectura.com.Financiera.dominio.Prestamo;
import Arquitectura.com.Financiera.persistencia.GestorJDBC;
import Arquitectura.com.Financiera.persistencia.GestorJDBCPostgre;
import Arquitectura.com.Financiera.persistencia.PagoDAO;
import Arquitectura.com.Financiera.persistencia.PrestamoDAOPostgre;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PagarCuotaServicio {

    GestorJDBC gestorJDBC;
    PrestamoDAOPostgre prestamoDAOPostgre;
    PagoDAO pagoDAO;

    public PagarCuotaServicio() {
        gestorJDBC = new GestorJDBCPostgre();
        prestamoDAOPostgre = new PrestamoDAOPostgre(gestorJDBC);
        pagoDAO = new PagoDAO(gestorJDBC);
    }

    public Prestamo buscarPrestamo(String clienteDni) throws Exception {
        gestorJDBC.abrirConexion();
        Prestamo prestamo = prestamoDAOPostgre.buscarPrestamo(clienteDni);
        gestorJDBC.cerrarConexion();
        return prestamo;
    }

    public void pagarCuota(Pago pago, double montoRecibido, String clienteDni) throws Exception {
        if (!pago.esMontoValido(montoRecibido)) {
            JOptionPane.showMessageDialog(null, "El monto no es valido");
            throw new Exception();
        }
        if (!pago.esFechaValida()) {
            JOptionPane.showMessageDialog(null, "La fecha no es valida");
            throw new Exception();
        }
        gestorJDBC.abrirConexion();
        try {
            gestorJDBC.iniciarTransaccion();
            pagoDAO.ingresar(pago);
            Prestamo prestamo = prestamoDAOPostgre.buscarPrestamo(clienteDni);
            if (prestamo.estaPagado()) {
                prestamo.setEstado(Prestamo.ESTADO_PAGADO);
                prestamoDAOPostgre.cambiarEstado(prestamo);
            }
            gestorJDBC.terminarTranssaccion();
        } catch (SQLException e) {
            gestorJDBC.cancelarTransaccion();
        }
    }
}
