
package Arquitectura.com.Financiera.persistencia;


import java.sql.DriverManager;

public class GestorJDBCPostgre extends GestorJDBC{

    @Override
    public void abrirConexion() throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/postgres";
        conexion = DriverManager.getConnection(url, "postgres", "123456");
    }
}
