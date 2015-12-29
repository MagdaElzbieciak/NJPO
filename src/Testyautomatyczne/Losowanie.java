/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testyautomatyczne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Danuta
 */
public class Losowanie {
    
    static List<Integer> list = new ArrayList<Integer>();
    
    public static void losuj(){
        
        Random r  = new Random(); 
        
        for(int i = 0 ; i < 10000000; i++){
            
            list.add(r.nextInt());
        }
        Collections.sort(list);
    }
}
