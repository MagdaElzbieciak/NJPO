/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profilowanie;

import java.util.Map;

/**
 *
 * @author Danuta
 */
public class MemLeak {
    
    public final String key;
    
    public MemLeak(String key){
        this.key = key;
    }
    
    public static void main(String args[]){
        try{
            Map map = System.getProperties();
            
            for(int i = 0 ; i < 100 ; i++){
                map.put(new MemLeak("key"), "value");
            }
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
  
    
}
