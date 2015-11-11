/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

import static Dekorator.Uzytkownik.rozmiarx;
import static Dekorator.Uzytkownik.rozmiary;
import java.awt.Point;

/**
 *
 * @author Danuta
 */
public class Kierowca extends Dekorator {

    public Kierowca(Uzytkownik uzytkownik) {
        super(uzytkownik);
    }
    
    public void ruch(){
        Point p1 = super.getPoint();
        super.ruch();
        Point p2 = super.getPoint();
        
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        
        if(dx == 2 && dy == 0){ //prawo
            p2.move(p2.x+2, p2.y);
            if(!(p2.x<rozmiarx))
                p2.move(p2.x-8, p2.y);
            super.setPoint(p2);
        }
        else if(dx == -2 && dy == 0){ //lewo
            p2.move(p2.x-2, p2.y);
            if(!(p2.x>=0))
                p2.move(p2.x+8, p2.y);
            super.setPoint(p2);
        }
        else if(dx == 0 && dy == 2){ //dół
            p2.move(p2.x, p2.y+2);
            if(!(p2.y<rozmiary))
                p2.move(p2.x, p2.y-8);
            super.setPoint(p2);
        }
        else{ //góra
            p2.move(p2.x, p2.y-2);
            if(!(p2.y>=0))
                p2.move(p2.x, p2.y+8);
            super.setPoint(p2);
        }
      
    }
}
