/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testyautomatyczne;

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
public class RownaniekwadratoweTest {
    
    public RownaniekwadratoweTest() {
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
     * Test of oblicz method, of class Rownaniekwadratowe.
     */
    @Test
    public void testOblicz() {
        System.out.println("oblicz");
        int a = 0;
        int b = 0;
        int c = 0;
        
        double[] result = Rownaniekwadratowe.oblicz(a, b, c);
        assertNull(result);
        
        b = 5;
        c = 10;
        
        result = Rownaniekwadratowe.oblicz(a, b, c);
        double[] exp = {-2.0};
        assertArrayEquals(exp, result, 0.0);
       
        a = 1;
        b = 2;
        c = 1;
        
        result = Rownaniekwadratowe.oblicz(a, b, c);
        exp[0] = -1.0;
        assertArrayEquals(exp, result, 0.0);
        
        a = 1;
        b = -3;
        c = 2;
        
        result = Rownaniekwadratowe.oblicz(a, b, c);
        double[] tab = new double[2];
        tab[0] = 1.0;
        tab[1] = 2.0;
        assertArrayEquals(tab, result, 0.0);
    }
    
}
