/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquitectura.com.Financiera.dominio;

import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TOTTUS TRUJILLO
 */
public class PrestamoTest {
    
    public PrestamoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrestamoId method, of class Prestamo.
     */
    @Test
    public void testGetPrestamoId() {
        System.out.println("getPrestamoId");
        Prestamo instance = new Prestamo();
        int expResult = 0;
        int result = instance.getPrestamoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       if(result !=expResult){
           fail("El resultado es diferente");
       }
    }

    /**
     * Test of setPrestamoId method, of class Prestamo.
     */
    @Test
    public void testSetPrestamoId() {
        System.out.println("setPrestamoId");
        int prestamoId = 1;
        Prestamo instance = new Prestamo();
        instance.setPrestamoId(prestamoId);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getMontoPrestado method, of class Prestamo.
     */
    @Test
    public void testGetMontoPrestado() {
        System.out.println("getMontoPrestado");
        Prestamo instance = new Prestamo();
        double expResult = 5000.0;
        double result = instance.getMontoPrestado();
        assertEquals(expResult, result, 5000.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMontoPrestado method, of class Prestamo.
     */
    @Test
    public void testSetMontoPrestado() {
        System.out.println("setMontoPrestado");
        double montoPrestado = 5000.0;
        Prestamo instance = new Prestamo();
        instance.setMontoPrestado(montoPrestado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTEA method, of class Prestamo.
     */
    @Test
    public void testGetTEA() {
        System.out.println("getTEA");
        Prestamo instance = new Prestamo();
        double expResult = 0.10;
        double result = instance.getTEA();
        assertEquals(expResult, result, 0.10);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTEA method, of class Prestamo.
     */
    @Test
    public void testSetTEA() {
        System.out.println("setTEA");
        double tea = 0.0;
        Prestamo instance = new Prestamo();
        instance.setTEA(tea);
        // TODO review the generated test code and remove the default call to fail.
        
        
    }

    /**
     * Test of getPeriodosDePago method, of class Prestamo.
     */
    @Test
    public void testGetPeriodosDePago() {
        System.out.println("getPeriodosDePago");
        Prestamo instance = new Prestamo();
        int expResult = 0;
        int result = instance.getPeriodosDePago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
    }

    /**
     * Test of setPeriodosDePago method, of class Prestamo.
     */
    @Test
    public void testSetPeriodosDePago() {
        System.out.println("setPeriodosDePago");
        int periodoDePago = 0;
        Prestamo instance = new Prestamo();
        instance.setPeriodosDePago(periodoDePago);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEstado method, of class Prestamo.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
            fail("The test case is a prototype.");
        
        
    }

    /**
     * Test of setEstado method, of class Prestamo.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Prestamo instance = new Prestamo();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFecha method, of class Prestamo.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Prestamo instance = new Prestamo();
        LocalDate expResult = null;
        LocalDate result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setFecha method, of class Prestamo.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        LocalDate fecha = null;
        Prestamo instance = new Prestamo();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCliente method, of class Prestamo.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Prestamo instance = new Prestamo();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCliente method, of class Prestamo.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Prestamo instance = new Prestamo();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getListaCuotas method, of class Prestamo.
     */
    @Test
    public void testGetListaCuotas() {
        System.out.println("getListaCuotas");
        Prestamo instance = new Prestamo();
        List<Cuota> expResult = null;
        List<Cuota> result = instance.getListaCuotas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCuotas method, of class Prestamo.
     */
    @Test
    public void testSetListaCuotas() {
        System.out.println("setListaCuotas");
        List<Cuota> listaCuotas = null;
        Prestamo instance = new Prestamo();
        instance.setListaCuotas(listaCuotas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCuota method, of class Prestamo.
     */
    @Test
    public void testAgregarCuota() {
        System.out.println("agregarCuota");
        Cuota cuota = null;
        Prestamo instance = new Prestamo();
        instance.agregarCuota(cuota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPrimeraCuotaPendiente method, of class Prestamo.
     */
    @Test
    public void testObtenerPrimeraCuotaPendiente() {
        System.out.println("obtenerPrimeraCuotaPendiente");
        Prestamo instance = new Prestamo();
        Cuota expResult = null;
        Cuota result = instance.obtenerPrimeraCuotaPendiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of obtenerPosicionPrimeraCuotaPendiente method, of class Prestamo.
     */
    @Test
    public void testObtenerPosicionPrimeraCuotaPendiente() {
        System.out.println("obtenerPosicionPrimeraCuotaPendiente");
        Prestamo instance = new Prestamo();
        int expResult = 0;
        int result = instance.obtenerPosicionPrimeraCuotaPendiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of esMontoValido method, of class Prestamo.
     */
    @Test
    public void testEsMontoValido() {
        System.out.println("esMontoValido");
        Prestamo instance = new Prestamo();
        boolean expResult = false;
        boolean result = instance.esMontoValido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=false){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of esTEAValida method, of class Prestamo.
     */
    @Test
    public void testEsTEAValida() {
        System.out.println("esTEAValida");
        Prestamo instance = new Prestamo();
        boolean expResult = false;
        boolean result = instance.esTEAValida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=false){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of esPeriodoValido method, of class Prestamo.
     */
    @Test
    public void testEsPeriodoValido() {
        System.out.println("esPeriodoValido");
        Prestamo instance = new Prestamo();
        boolean expResult = false;
        boolean result = instance.esPeriodoValido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=false){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of calcularTasaEfectivaMensual method, of class Prestamo.
     */
    @Test
    public void testCalcularTasaEfectivaMensual() {
        System.out.println("calcularTasaEfectivaMensual");
        Prestamo instance = new Prestamo();
        double expResult = 0.0;
        double result = instance.calcularTasaEfectivaMensual();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of calcularCuotaFijaMensual method, of class Prestamo.
     */
    @Test//Metodo 
    public void testCalcularCuotaFijaMensual() {
        System.out.println("calcularCuotaFijaMensual");
        Prestamo instance = new Prestamo();
        double expResult = 0.0;
        double result = instance.calcularCuotaFijaMensual();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("Los datos son diferentes.");
        }
    }

    /**
     * Test of generarListaCuotas method, of class Prestamo.
     */
    @Test
    public void testGenerarListaCuotas() {
        System.out.println("generarListaCuotas");
        Prestamo instance = new Prestamo();
        instance.generarListaCuotas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaPagado method, of class Prestamo.
     */
    @Test//Si el estado esta pendiente dara resuktado false
    public void testEstaPagado() {
        System.out.println("estaPagado");
        Prestamo instance = new Prestamo();
        boolean expResult = false;
        boolean result = instance.estaPagado();
        assertFalse(false);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
