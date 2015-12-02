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
public class Pieszy extends Uzytkownik{
    
    public Pieszy(){
        
        super();
    }
    
    @Override
    public void ruch(){
        
        boolean ctrl = r.nextBoolean(); 
        if(ctrl){ //poziom
            if(r.nextBoolean()){ //prawo
                Point p = getPoint();
                p.move(p.x+2, p.y);
                if( !(p.x<rozmiarx) )
                    p.move(p.x-4, p.y);
                 setPoint(p);
            }
            else{ //lewo
                Point p = getPoint();
                p.move(p.x-2, p.y);
                if( !(p.x>=0) )
                    p.move(p.x+4, p.y);
                 setPoint(p);
            }
        }
        else{ //pion
            if(r.nextBoolean()){ //dół
                Point p = getPoint();
                p.move(p.x, p.y+2);
                if( !(p.y<rozmiary) )
                    p.move(p.x, p.y-4);
                 setPoint(p);
            }
            else{ //góra
                Point p = getPoint();
                p.move(p.x, p.y-2);
                if( !(p.y>=0) )
                    p.move(p.x, p.y+4);
                 setPoint(p);
            }
        }
   
    }
    
}
