/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

import java.awt.Point;
import java.util.Random;

/**
 *
 * @author Danuta
 */
public abstract class Uzytkownik {
    
    public static final int rozmiarx = 10; 
    public static final int rozmiary = 10; 
    public static Random r = new Random(); 
    private Point point;
    
     public Uzytkownik(){
        
        point = new Point(r.nextInt(rozmiarx),r.nextInt(rozmiary)); 
        
    }
    public void ruch(){
        
    }
    
    public Point getPoint(){
       
        return new Point(point);
        
    }
    
    public void setPoint(Point p){
        
        point = p;
        
    }
    
}
