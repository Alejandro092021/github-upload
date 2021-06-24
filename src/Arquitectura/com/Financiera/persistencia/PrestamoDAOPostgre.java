package Arquitectura.com.Financiera.persistencia;


import Arquitectura.com.Financiera.dominio.Cuota;
import Arquitectura.com.Financiera.dominio.Prestamo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class PrestamoDAOPostgre {

    GestorJDBC gestorJDBC;

    public PrestamoDAOPostgre(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }

    public void ingresarPrestamo(Prestamo prestamo) throws SQLException {
        String sentenciaSQL_Prestamo = "insert into prestamo (prestamoid,monto,tea,periodo,clientecodigo,estado,fecha) values (?,?,?,?,?,?,?)";
        int prestamoid = generarPrestamoId();
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL_Prestamo);
            sentencia.setInt(1, prestamoid);
            sentencia.setDouble(2, prestamo.getMontoPrestado());
            sentencia.setDouble(3, prestamo.getTEA());
            sentencia.setInt(4, prestamo.getPeriodosDePago());
            sentencia.setInt(5, prestamo.getCliente().getCodigo());
            sentencia.setString(6, prestamo.getEstado());
            sentencia.setDate(7, Date.valueOf(prestamo.getFecha()));
            sentencia.executeUpdate();
            for (Cuota cuota : prestamo.getListaCuotas()) {
                String sentenciaSQL_Cuota = "insert into cuota(prestamoid,fecha,saldo,amortizacion,interes,monto,numero,estado) values (?,?,?,?,?,?,?,?)";
                PreparedStatement sentencia2 = gestorJDBC.prepararSentencia(sentenciaSQL_Cuota);
                sentencia2.setInt(1, prestamoid);
                sentencia2.setDate(2, Date.valueOf(cuota.getFecha()));
                sentencia2.setDouble(3, cuota.getSaldo());
                sentencia2.setDouble(4, cuota.getAmortizacion());
                sentencia2.setDouble(5, cuota.getInteres());
                sentencia2.setDouble(6, cuota.getMonto());
                sentencia2.setInt(7, cuota.getNumero());
                sentencia2.setString(8, cuota.getEstado());
                sentencia2.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "El Prestamo Se Registro Con Exito");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Prestamo buscarPrestamo(String dniCliente) throws SQLException {
        Prestamo prestamo = null;
        String sentenciaSQL_Prestamo = "select p.prestamoid, p.fecha, p.monto, p.tea, p.periodo, p.estado " +
                "from prestamo as p join cliente as c on p.clientecodigo = c.clientecodigo where c.dni = '" + dniCliente
                +"' and p.estado = 'PENDIENTE'";
        
        ResultSet resultado_Prestamo;
        ResultSet resultado_Cuota;
        resultado_Prestamo = gestorJDBC.ejecutarConsulta(sentenciaSQL_Prestamo);
        if (resultado_Prestamo.next()) {
            prestamo = new Prestamo();
            prestamo.setPrestamoId(resultado_Prestamo.getInt("prestamoid"));
            prestamo.setMontoPrestado(resultado_Prestamo.getDouble("monto"));
            prestamo.setTEA(resultado_Prestamo.getDouble("tea"));
            prestamo.setPeriodosDePago(resultado_Prestamo.getInt("periodo"));
            prestamo.setEstado(resultado_Prestamo.getString("estado"));
            prestamo.setFecha(LocalDate.parse(String.valueOf(resultado_Prestamo.getDate("fecha"))));
            resultado_Prestamo.close();
            
            String sentenciaSQL_Cuota = "select cuotaid, prestamoid,fecha,saldo,amortizacion,interes,monto,numero,estado from cuota where prestamoid = " 
                    + prestamo.getPrestamoId() + " order by numero";
            resultado_Cuota = gestorJDBC.ejecutarConsulta(sentenciaSQL_Cuota);
            while(resultado_Cuota.next()){
                Cuota cuota = new Cuota();
                cuota.setCuotaId(resultado_Cuota.getInt("cuotaid"));
                cuota.setNumero(resultado_Cuota.getInt("numero"));
                cuota.setSaldo(resultado_Cuota.getDouble("saldo"));
                cuota.setAmortizacion(resultado_Cuota.getDouble("amortizacion"));
                cuota.setInteres(resultado_Cuota.getDouble("interes"));
                cuota.setMonto(resultado_Cuota.getDouble("monto"));
                cuota.setEstado(resultado_Cuota.getString("estado"));
                cuota.setFecha(LocalDate.parse(String.valueOf(resultado_Cuota.getDate("fecha"))));
                cuota.setPrestamo(prestamo);
                prestamo.agregarCuota(cuota);
            }
            resultado_Cuota.close();
        }
        return prestamo;
    }
    
    private int generarPrestamoId() throws SQLException {
        int prestamoId = 0;
        String sentenciaSQL = "select fduGenerarPrestamoId() As PrestamoId";
        ResultSet resultado;
        resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
        if (resultado.next()) {
            prestamoId = resultado.getInt("PrestamoId");
        }
        return prestamoId;
    }
    
//    public void cambiarEstadoAPagado(Prestamo prestamo) throws SQLException{
//        String sentenciaSQL_Prestamo = "update prestamo set estado = 'PAGADO' where prestamoid = ?";
//        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL_Prestamo);
//        sentencia.setInt(1, prestamo.getPrestamoId());
//        sentencia.executeUpdate();
//    }
    
    public void cambiarEstado(Prestamo prestamo) throws SQLException{
        String sentenciaSQL_Prestamo = "update prestamo set estado = ? where prestamoid = ?";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL_Prestamo);
        sentencia.setString(1, prestamo.getEstado());
        sentencia.setInt(2, prestamo.getPrestamoId());
        sentencia.executeUpdate();
    }
}      
