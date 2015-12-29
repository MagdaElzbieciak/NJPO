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
public class LosowanieTest {
    
    static long time ;
    
    public LosowanieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        time = System.nanoTime();
        
    }
    
    @After
    public void tearDown() {
        
        time = System.nanoTime() - time;
        System.out.println(time/1000 + " us");
    }

    /**
     * Test of losuj method, of class Losowanie.
     */
    @Test
    public void testLosuj() {
        System.out.println("losuj");
        Losowanie.losuj();
        
    }
    
}
