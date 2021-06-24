package Arquitectura.com.Financiera.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Prestamo {

    private int prestamoId;
    private double montoPrestado;
    private double tea;
    private int periodoDePago;
    private String estado;
    private LocalDate fecha;
    private Cliente cliente;
    private List<Cuota> listaCuotas;
    
    public static final String ESTADO_PENDIENTE = "PENDIENTE";
    public static final String ESTADO_PAGADO = "PAGADO";

    public Prestamo() {
        listaCuotas = new ArrayList<>();
    }

    public Prestamo(int prestamoId, double montoPrestado, double tea, int periodoDePago, String estado, LocalDate fecha, Cliente cliente) {
        this.prestamoId = prestamoId;
        this.montoPrestado = montoPrestado;
        this.tea = tea;
        this.periodoDePago = periodoDePago;
        this.estado = estado;
        this.fecha = fecha;
        this.cliente = cliente;
        listaCuotas = new ArrayList<>();
    }
    
    public Prestamo(double montoPrestado, double tea, int periodoDePago , Cliente cliente) {
        this.montoPrestado = montoPrestado;
        this.tea = tea;
        this.periodoDePago = periodoDePago;
        this.cliente = cliente;
        fecha = LocalDate.now();
        estado = ESTADO_PENDIENTE;
        listaCuotas = new ArrayList<>();
    }
    
    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public double getMontoPrestado() {
        return montoPrestado;
    }

    public void setMontoPrestado(double montoPrestado) {
        this.montoPrestado = montoPrestado;
    }

    public double getTEA() {
        return tea;
    }

    public void setTEA(double tea) {
        this.tea = tea;
    }

    public int getPeriodosDePago() {
        return periodoDePago;
    }

    public void setPeriodosDePago(int periodoDePago) {
        this.periodoDePago = periodoDePago;
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
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public List<Cuota> getListaCuotas() {
        return listaCuotas;
    }

    public void setListaCuotas(List<Cuota> listaCuotas) {
        this.listaCuotas = listaCuotas;
    }
    
    public void agregarCuota(Cuota cuota){
        listaCuotas.add(cuota);
    }
    
    public Cuota obtenerPrimeraCuotaPendiente(){
        Cuota cuota= null;
        if(listaCuotas.size() > 0){
            for(int i = 0; i < listaCuotas.size(); i++){
            cuota = listaCuotas.get(i);
            if(cuota.getEstado().equalsIgnoreCase(Cuota.ESTADO_PENDIENTE))
                return cuota;
            else
                cuota = null;
            }
        }
        return cuota;
    }
    
//    public int obtenerPosicionPrimeraCuotaPendiente(){
//        int posicion = 0;
//        if(listaCuotas.size() > 0){
//            for(posicion = 0; posicion < listaCuotas.size(); posicion++){
//            Cuota cuota = listaCuotas.get(posicion);
//            if(cuota.getEstado().equalsIgnoreCase(Cuota.ESTADO_PENDIENTE))
//                return posicion;
//            }
//        }
//        return posicion;
//    }
    
    public int obtenerPosicionPrimeraCuotaPendiente(){
        int posicion = 0;
        if(listaCuotas.size() > 0){
            for(Cuota cuota : listaCuotas){
            if(cuota.getEstado().equalsIgnoreCase(Cuota.ESTADO_PENDIENTE))
                return posicion;
            posicion++;
            }
        }
        return posicion;
    }
    
    //Reglas de negocio
    
    public boolean esMontoValido() {
        return montoPrestado>=1000 && montoPrestado<=30000;
    }
    
    public boolean esTEAValida() {
        return tea>=0.10 && tea<=0.20;
    }

    public boolean esPeriodoValido() {
        return periodoDePago>=3 && periodoDePago<=24;
    }
    
    public double calcularTasaEfectivaMensual() {
        return Math.pow(1+tea, 0.08333333)-1;
    }
    
    public double calcularCuotaFijaMensual() {
        return (montoPrestado/(1-(Math.pow(1+calcularTasaEfectivaMensual(), -periodoDePago))))*calcularTasaEfectivaMensual();
    }
    
//    public void generarListaCuotas(){
//        double saldo = montoPrestado, cuotaFijaMensual = calcularCuotaFijaMensual();
//        for (int i = 1; i <= periodoDePago; i++) {
//            LocalDate fechaCuota = fecha.plusMonths(i);
//            Cuota cuota = new Cuota(saldo);
//            cuota.setPrestamo(this);
//            cuota.setNumero(i);
//            cuota.setInteres(cuota.calcularInteres());
//            cuota.setAmortizacion(cuota.calcularAmortizacion());
//            cuota.setSaldo(cuota.calcularSaldo());
//            cuota.setMonto(cuotaFijaMensual);
//            cuota.setEstado(Cuota.ESTADO_PENDIENTE);
//            cuota.setFecha(fechaCuota);
//            saldo = cuota.getSaldo();
//            agregarCuota(cuota);
//        }
//    }
    
        public void generarListaCuotas(){
        double saldo = montoPrestado, cuotaFijaMensual = calcularCuotaFijaMensual();
        for (int i = 1; i <= periodoDePago; i++) {
            LocalDate fechaCuota = fecha.plusMonths(i);
            Cuota cuota = new Cuota(saldo);
            cuota.setPrestamo(this);
            cuota.setNumero(i);
            cuota.calcularInteres();
            cuota.calcularAmortizacion();
            cuota.calcularSaldo();
            cuota.setMonto(cuotaFijaMensual);
            cuota.setEstado(Cuota.ESTADO_PENDIENTE);
            cuota.setFecha(fechaCuota);
            agregarCuota(cuota);
            saldo = cuota.getSaldo();
        }
    }
         
    public boolean estaPagado() {
        for(Cuota cuota: listaCuotas){
            if(cuota.getEstado().equalsIgnoreCase(Cuota.ESTADO_PENDIENTE))
                return false;
        }
        return true;
    }
    
//        public boolean estaPagado02() {
//        for(Cuota cuota: listaCuotas){
//            if(!cuota.estaPagado())
//                return false;
//        }
//        return true;
//    }
}
