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
public class CuotaTest {
    
    public CuotaTest() {
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
     * Test of getCuotaId method, of class Cuota.
     */
    @Test
    public void testGetCuotaId() {
        System.out.println("getCuotaId");
        Cuota instance = new Cuota();
        int expResult = 0;
        int result = instance.getCuotaId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuotaId method, of class Cuota.
     */
    @Test
    public void testSetCuotaId() {
        System.out.println("setCuotaId");
        int cuotaId = 0;
        Cuota instance = new Cuota();
        instance.setCuotaId(cuotaId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Cuota.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cuota instance = new Cuota();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Cuota.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Cuota instance = new Cuota();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Cuota.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuota instance = new Cuota();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setSaldo method, of class Cuota.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        Cuota instance = new Cuota();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmortizacion method, of class Cuota.
     */
    @Test
    public void testGetAmortizacion() {
        System.out.println("getAmortizacion");
        Cuota instance = new Cuota();
        double expResult = 0.0;
        double result = instance.getAmortizacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmortizacion method, of class Cuota.
     */
    @Test
    public void testSetAmortizacion() {
        System.out.println("setAmortizacion");
        double amortizacion = 0.0;
        Cuota instance = new Cuota();
        instance.setAmortizacion(amortizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInteres method, of class Cuota.
     */
    @Test
    public void testGetInteres() {
        System.out.println("getInteres");
        Cuota instance = new Cuota();
        double expResult = 0.0;
        double result = instance.getInteres();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInteres method, of class Cuota.
     */
    @Test
    public void testSetInteres() {
        System.out.println("setInteres");
        double interes = 0.0;
        Cuota instance = new Cuota();
        instance.setInteres(interes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Cuota.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Cuota instance = new Cuota();
        double expResult = 0.0;
        double result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Cuota.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        double monto = 0.0;
        Cuota instance = new Cuota();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Cuota.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Cuota instance = new Cuota();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Cuota.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Cuota instance = new Cuota();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Cuota.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Cuota instance = new Cuota();
        LocalDate expResult = null;
        LocalDate result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Cuota.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        LocalDate fecha = null;
        Cuota instance = new Cuota();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestamo method, of class Cuota.
     */
    @Test
    public void testGetPrestamo() {
        System.out.println("getPrestamo");
        Cuota instance = new Cuota();
        Prestamo expResult = null;
        Prestamo result = instance.getPrestamo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrestamo method, of class Cuota.
     */
    @Test
    public void testSetPrestamo() {
        System.out.println("setPrestamo");
        Prestamo prestamo = null;
        Cuota instance = new Cuota();
        instance.setPrestamo(prestamo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaPagado method, of class Cuota.
     */
    @Test
    public void testEstaPagado() {
        System.out.println("estaPagado");
        Cuota instance = new Cuota();
        boolean expResult = false;
        boolean result = instance.estaPagado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularAmortizacion method, of class Cuota.
     */
    @Test
    public void testCalcularAmortizacion() {
        System.out.println("calcularAmortizacion");
        Cuota instance = new Cuota();
        double expResult = 0.0;
        double result = instance.calcularAmortizacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularInteres method, of class Cuota.
     */
    @Test
    public void testCalcularInteres() {
        System.out.println("calcularInteres");
        Cuota instance = new Cuota();
        double expResult = 0.0;
        double result = instance.calcularInteres();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSaldo method, of class Cuota.
     */
    @Test
    public void testCalcularSaldo() {
        System.out.println("calcularSaldo");
        Cuota instance = new Cuota();
        double expResult = 0.0;
        double result = instance.calcularSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
