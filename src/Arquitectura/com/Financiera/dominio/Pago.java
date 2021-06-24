package Arquitectura.com.Financiera.dominio;

import java.time.LocalDate;

public class Pago {
   
    private int pagoId;
    private LocalDate fecha;
    private double monto;
    private Cuota cuota;

    public Pago() {
        this.fecha = LocalDate.now();
    }
    
    public Pago(int pagoId, double monto, Cuota cuota) {
        this.pagoId = pagoId;
        this.fecha = LocalDate.now();
        this.monto = monto;
        this.cuota = cuota;
    }
    
    public Pago(int pagoId, LocalDate fecha, double monto, Cuota cuota) {
        this.pagoId = pagoId;
        this.fecha = fecha;
        this.monto = monto;
        this.cuota = cuota;
    }

    public int getPagoId() {
        return pagoId;
    }

    public void setPagoId(int pagoId) {
        this.pagoId = pagoId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }
    
    public boolean esMontoValido(double montoRecibido){
        return  montoRecibido>0 &&  montoRecibido >= calcularTotalAPagar();
    }
    
    public double calcularVuelto(double montoRecibido){
        double vuelto = 0;
        if(esMontoValido(montoRecibido))
            vuelto = montoRecibido - calcularTotalAPagar();
        return vuelto;
    }
    
    public double calcularTotalAPagar(){
        return cuota.getMonto()+calcularMora();
    }
    
    public double calcularMora() {
        double mora = 0;
        if(cuota.getEstado().equalsIgnoreCase(Cuota.ESTADO_PENDIENTE)){
        int diasVencidos = calcularDiasVencidos();
        if (diasVencidos > 10) {
            mora = (diasVencidos - 10) * 0.2;
            }
        }
        return mora;
    }
    
//    public  boolean esFechaValida(){
//        return fecha.isAfter(cuota.getFecha());
//    }
    
    public  boolean esFechaValida(){
        return fecha.isAfter(cuota.getFecha()) || fecha.equals(cuota.getFecha());
    }
    
    private int calcularDiasVencidos() {
        LocalDate fechaDePago = cuota.getFecha();
        int diasVencidos = 0;
        if (esFechaValida()) {
            while (fecha.equals(fechaDePago) != true) {
                fechaDePago = fechaDePago.plusDays(1);
                diasVencidos++;
            }
        }
        return diasVencidos;
    }
}