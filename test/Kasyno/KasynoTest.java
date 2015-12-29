/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasyno;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danuta
 */
public class KasynoTest {
    
    public KasynoTest() {
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
     * Test of getInstance method, of class Kasyno.
     */
 
  
    /**
     * Test of getStanKonta method, of class Kasyno.
     */
    @Test
    public void testGetStanKonta() {
        System.out.println("getStanKonta");
        Kasyno instance = Kasyno.getInstance();
        int expResult = 1000;
        instance.setStanKonta(expResult);
        int result = instance.getStanKonta();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setStanKonta method, of class Kasyno.
     */
    @Test
    public void testSetStanKonta() {
        System.out.println("setStanKonta");
        int stan_konta = 500;
        Kasyno instance = Kasyno.getInstance();
        instance.setStanKonta(stan_konta);
        assertEquals(stan_konta,instance.getStanKonta());
       
    }

    /**
     * Test of WygranaWBlackJacka method, of class Kasyno.
     */
    @Test
    public void testWygranaWBlackJacka() {
        System.out.println("WygranaWBlackJacka");
        Kasyno instance = Kasyno.getInstance();
        instance.setStanKonta(500);
        instance.WygranaWBlackJacka();
        assertEquals(490, instance.getStanKonta());
        
    }

    /**
     * Test of PrzegranaWBlackJacka method, of class Kasyno.
     */
    @Test
    public void testPrzegranaWBlackJacka() {
        System.out.println("PrzegranaWBlackJacka");
        Kasyno instance = Kasyno.getInstance();
        instance.setStanKonta(500);
        instance.PrzegranaWBlackJacka();
        assertEquals(510, instance.getStanKonta());
    }

    /**
     * Test of WygranaWJednorekiegoBandyte method, of class Kasyno.
     */
    @Test
    public void testWygranaWJednorekiegoBandyte() {
        System.out.println("WygranaWJednorekiegoBandyte");
        Kasyno instance = Kasyno.getInstance();
        instance.setStanKonta(500);
        instance.WygranaWJednorekiegoBandyte();
        assertEquals(490, instance.getStanKonta());
    }

    /**
     * Test of PrzegranaWJednorekiegoBandyte method, of class Kasyno.
     */
    @Test
    public void testPrzegranaWJednorekiegoBandyte() {
        System.out.println("PrzegranaWJednorekiegoBandyte");
        Kasyno instance = Kasyno.getInstance();
        instance.setStanKonta(500);
        instance.PrzegranaWJednorekiegoBandyte();
        assertEquals(510, instance.getStanKonta());
    }
    
}
