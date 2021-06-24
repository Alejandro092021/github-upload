
package Arquitectura.com.Financiera.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class GestorJDBC {
    
    protected Connection conexion;
    
    public abstract void abrirConexion()throws Exception;
    
    public void cerrarConexion()throws SQLException{
        conexion.close();
    }
    
    public void iniciarTransaccion()throws SQLException{
        conexion.setAutoCommit(false);
    }
    
    public void terminarTranssaccion()throws SQLException{
        conexion.commit();
        conexion.setAutoCommit(true);
        conexion.close();
    }
    
    public void cancelarTransaccion()throws SQLException{
        conexion.rollback();
        conexion.setAutoCommit(true);
        conexion.close();
    }
    
    public PreparedStatement prepararSentencia(String sql)throws SQLException{
        return conexion.prepareStatement(sql);
    }
    
    public ResultSet ejecutarConsulta(String sql)throws SQLException{
        Statement sentecncia;
        ResultSet resultado;
        sentecncia = conexion.createStatement();
        resultado = sentecncia.executeQuery(sql);
        return resultado;
    }
}
