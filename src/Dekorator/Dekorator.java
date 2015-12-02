/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

import java.awt.Point;

/**
 *
 * @author Danuta
 */
public class Dekorator extends Uzytkownik {
    
    private Uzytkownik instance;
    
    public Dekorator(Uzytkownik uzytkownik){
        
        instance = uzytkownik;
        
    }
    
    public void ruch(){
        
        instance.ruch();
        
    }
    
    public Point getPoint(){
        
        return instance.getPoint();
        
    }
    
    public void setPoint(Point p){
        
        instance.setPoint(p);
    }
}
