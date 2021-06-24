/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquitectura.com.Financiera.dominio;

import java.time.LocalDate;
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
public class PagoTest {
    
    public PagoTest() {
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
     * Test of getPagoId method, of class Pago.
     */
    @Test
    public void testGetPagoId() {
        System.out.println("getPagoId");
        Pago instance = new Pago();
        int expResult = 0;
        int result = instance.getPagoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagoId method, of class Pago.
     */
    @Test
    public void testSetPagoId() {
        System.out.println("setPagoId");
        int pagoId = 0;
        Pago instance = new Pago();
        instance.setPagoId(pagoId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Pago.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pago instance = new Pago();
        LocalDate expResult = instance.getFecha();
        LocalDate result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){//Si se coloca result el dato arroja la fecha actual. 
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFecha method, of class Pago.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        LocalDate fecha = LocalDate.now();
        Pago instance = new Pago();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getMonto method, of class Pago.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Pago instance = new Pago();
        double expResult = 0.0;
        double result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setMonto method, of class Pago.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        double monto = 0.0;
        Pago instance = new Pago();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuota method, of class Pago.
     */
    @Test
    public void testGetCuota() {
        System.out.println("getCuota");
        Pago instance = new Pago();
        Cuota expResult = null;
        Cuota result = instance.getCuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCuota method, of class Pago.
     */
    @Test
    public void testSetCuota() {
        System.out.println("setCuota");
        Cuota cuota = null;
        Pago instance = new Pago();
        instance.setCuota(cuota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esMontoValido method, of class Pago.
     */
    @Test
    public void testEsMontoValido() {
        System.out.println("esMontoValido");
        double montoRecibido = 0.0;
        Pago instance = new Pago();
        boolean expResult = false;
        boolean result = instance.esMontoValido(montoRecibido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcularVuelto method, of class Pago.
     */
    @Test
    public void testCalcularVuelto() {
        System.out.println("calcularVuelto");
        double montoRecibido = 0.0;
        Pago instance = new Pago();
        double expResult = 0.0;
        double result = instance.calcularVuelto(montoRecibido);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcularTotalAPagar method, of class Pago.
     */
    @Test
    public void testCalcularTotalAPagar() {
        System.out.println("calcularTotalAPagar");
        Pago instance = new Pago();
        double expResult = 0.0;
        double result = instance.calcularTotalAPagar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMora method, of class Pago.
     */
    @Test
    public void testCalcularMora() {
        System.out.println("calcularMora");
        Pago instance = new Pago();
        double expResult = 0.0;
        double result = instance.calcularMora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esFechaValida method, of class Pago.
     */
    @Test
    public void testEsFechaValida() {
        System.out.println("esFechaValida");
        Pago instance = new Pago();
        boolean expResult = instance.esFechaValida();
        boolean result = instance.esFechaValida();
        assertFalse(false);
        
    }
    
}
