package Arquitectura.com.Financiera.persistencia;

import Arquitectura.com.Financiera.dominio.Cliente;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ClienteDAOPostgre {
        GestorJDBC gestorJDBC;
    
    
	public ClienteDAOPostgre(GestorJDBC gestorJDBC){
             this.gestorJDBC=gestorJDBC;
	}
         
        public Cliente buscarCliente (String dni)throws SQLException{
            Cliente cliente = null;
            ResultSet resultado_Cliente , resultado_Prestamo;
            String sentenciaSQL_Cliente, sentenciaSQL_Prestamo;
            sentenciaSQL_Cliente = "select clientecodigo, nombres, apellidos, dni from cliente where dni = '"+dni+"'"; 
            resultado_Cliente = gestorJDBC.ejecutarConsulta(sentenciaSQL_Cliente);
            if(resultado_Cliente.next()){
                cliente = new Cliente();
                cliente.setCodigo(resultado_Cliente.getInt("clientecodigo"));
                cliente.setNombre(resultado_Cliente.getString("nombres"));
                cliente.setApellidos(resultado_Cliente.getString("apellidos"));
                cliente.setDni(resultado_Cliente.getString("dni"));
            }
            resultado_Cliente.close();
            if(cliente != null){
                sentenciaSQL_Prestamo = "select estado from prestamo where clientecodigo = '" +
                    cliente.getCodigo() +
                    "' and estado = 'PENDIENTE'";
                resultado_Prestamo = gestorJDBC.ejecutarConsulta(sentenciaSQL_Prestamo);
                if(resultado_Prestamo.next()){
                cliente.setPrestamoPendiente(true);
                }
                resultado_Prestamo.close();
            }
            return cliente;
        }
}