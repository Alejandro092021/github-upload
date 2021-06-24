
package Arquitectura.com.Financiera.aplicacion;


import Arquitectura.com.Financiera.persistencia.GestorJDBC;
import Arquitectura.com.Financiera.persistencia.GestorJDBCPostgre;
import Arquitectura.com.Financiera.persistencia.PrestamoDAOPostgre;
import Arquitectura.com.Financiera.persistencia.UsuarioDAO;


public class IniciarSesionServicio {
    GestorJDBC gestorJDBC;
    UsuarioDAO usuarioDAO;

    public IniciarSesionServicio() {
        gestorJDBC = new GestorJDBCPostgre();
        usuarioDAO = new UsuarioDAO(gestorJDBC);
    }

    public int iniciarSesion(String nombre, String password) throws Exception {
        gestorJDBC.abrirConexion();
        int respuesta = usuarioDAO.verificarUsuario(nombre, password);
        gestorJDBC.cerrarConexion();
        return respuesta;
    }
    
}
