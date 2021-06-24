package Arquitectura.com.Financiera.dominio;

import java.time.LocalDate;

public class Cuota{

    private int cuotaId;
    private int numero;
    private double saldo;
    private double amortizacion;
    private double interes;
    private double monto;
    private String estado;
    private LocalDate fecha;
    private Prestamo prestamo;
    
    public static final String ESTADO_PENDIENTE = "PENDIENTE";
    public static final String ESTADO_PAGADO = "PAGADO";

    public Cuota() {
    }
    
    public Cuota(double saldo) {
        this.saldo = saldo;
    }

    public int getCuotaId() {
        return cuotaId;
    }

    public void setCuotaId(int cuotaId) {
        this.cuotaId = cuotaId;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
    public boolean estaPagado(){
        return estado.equalsIgnoreCase(ESTADO_PAGADO);
    }
    
    //Reglas de negocio
    
//    public double calcularAmortizacion() {
//        return prestamo.calcularCuotaFijaMensual() - calcularInteres();
//    }
//
//    public double calcularInteres() {
//        return saldo * prestamo.calcularTasaEfectivaMensual();
//    }
//    
//    public double calcularSaldo() {
//        double saldo = this.saldo - calcularAmortizacion();
//        if(saldo > 0)
//            return saldo;
//        else 
//            return 0;
//    }
    
    public double calcularAmortizacion() {
            amortizacion = prestamo.calcularCuotaFijaMensual() - calcularInteres();
        return amortizacion;
    }

    public double calcularInteres() {
        interes = saldo * prestamo.calcularTasaEfectivaMensual();
        return interes;
    }
    
    public double calcularSaldo() {
        saldo -= calcularAmortizacion();
        if(saldo > 0)
            return saldo;
        else 
            return saldo = 0;
    }
}
