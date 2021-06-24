
package Arquitectura.com.Financiera.persistencia;

import Arquitectura.com.Financiera.dominio.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    GestorJDBC gestorJGDBC;

    public UsuarioDAO(GestorJDBC gestorJDBC) {
        this.gestorJGDBC = gestorJDBC;
    }

    public int verificarUsuario(String nombre, String password) throws SQLException {
        int respuesta = 0;
        String sentenciaSQL_Usuario = "select  usuarioNombre, usuarioPassword  from usuario " +
                 "where UsuarioNombre = '" + nombre +"' and UsuarioPassword ='" + password + "'";
        ResultSet resultado_Usuario = gestorJGDBC.ejecutarConsulta(sentenciaSQL_Usuario);
        if(resultado_Usuario.next()){
            respuesta = 1;
        }
        return respuesta;
    }
}
