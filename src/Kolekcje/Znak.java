/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolekcje;


public class Znak implements Comparable {
    
    private char znak;
    private int ilosc = 1; 
    
    public Znak(char znak){
        
        this.znak = znak;
    }

    public void licz(){
        
            ilosc++;   
    }
            
    /**
     * @return the znka
     */
    public char getZnak() {
        
        return znak;
        
    }

    /**
     * @return the ilosc
     */
    public int getIlosc() {
        
        return ilosc;
        
    }

    @Override
    public int compareTo(Object o) {
        
        if(o instanceof Znak) 
            return ((Znak)o).ilosc - ilosc;
        else
            return 0;
    }
    
    
    
    
    
    
    
}
