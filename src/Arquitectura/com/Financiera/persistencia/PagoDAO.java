package Arquitectura.com.Financiera.persistencia;

import Arquitectura.com.Financiera.dominio.Pago;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagoDAO {

    GestorJDBC gestorJGDBC;

    public PagoDAO(GestorJDBC gestorJDBC) {
        this.gestorJGDBC = gestorJDBC;
    }

    public void ingresar(Pago pago) throws SQLException {
        String sentenciaSQL_Pago = "insert into pago(fecha, monto, cuotaid) values (?,?,?)";
        PreparedStatement sentencia = gestorJGDBC.prepararSentencia(sentenciaSQL_Pago);
        int registros_afectados;
        try {
            sentencia.setDate(1, Date.valueOf(pago.getFecha()));
            sentencia.setDouble(2, pago.getMonto());
            sentencia.setInt(3, pago.getCuota().getCuotaId());
            registros_afectados = sentencia.executeUpdate();

            if (registros_afectados == 1) {
                String sentenciaSQL_Cuota = "update cuota set estado = 'PAGADO' where cuotaid = " + pago.getCuota().getCuotaId();
                PreparedStatement sentenciaCuota = gestorJGDBC.prepararSentencia(sentenciaSQL_Cuota);
                sentenciaCuota.executeUpdate();
            }
        } catch (SQLException e) {
        }
    }
}
