/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

import java.awt.Point;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danuta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static boolean kolizja(Uzytkownik u1, Uzytkownik u2, Uzytkownik u3){
        
        Point p1 = u1.getPoint();
        Point p2 = u2.getPoint();
        Point p3 = u3.getPoint();
        
        if(p1.x == p2.x && p1.y == p2.y)
            return true;
        if(p1.x == p3.x && p1.y == p3.y)
            return true;
        if(p2.x == p3.x && p2.y == p3.y)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        char[][] tab  = new char[Uzytkownik.rozmiarx][Uzytkownik.rozmiary];
        for(int i = 0; i<Uzytkownik.rozmiarx; Arrays.fill(tab[i++], '='));
        
        Uzytkownik pieszy = new Pieszy();
        Uzytkownik kierowca = new Kierowca(new Pieszy());
        Uzytkownik rowerzysta = new Rowerzysta(new Pieszy());
        
        while(!kolizja(pieszy, kierowca, rowerzysta)){
            
            pieszy.ruch();
            kierowca.ruch();
            rowerzysta.ruch();
            
            Point p1 = pieszy.getPoint();
            Point p2 = kierowca.getPoint();
            Point p3 = rowerzysta.getPoint();
        
            tab[p1.x][p1.y] = 'P';
            tab[p2.x][p2.y] = 'K';
            tab[p3.x][p3.y] = 'R';
            
            for(int i = 0, max = Uzytkownik.rozmiarx*Uzytkownik.rozmiary ; i <max; i++){
                
                System.out.print(tab[i%Uzytkownik.rozmiarx][i/Uzytkownik.rozmiarx]);
                if(i%Uzytkownik.rozmiarx == Uzytkownik.rozmiarx-1)
                    System.out.println();
            }
                
            System.out.println();
            
            tab[p1.x][p1.y] = '=';
            tab[p2.x][p2.y] = '=';
            tab[p3.x][p3.y] = '=';
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    /*byte[] b = new byte[512];
        Arrays.fill(b, (byte)'\n');
        try{
            InputStream in = new LiczLiczbeWierszy(new FileInputStream(new File("a.txt")));
            System.out.println(in.read(b,5,51));
        }catch(Exception e){

        }
        
        byte[] b = new byte[512];
            try{
                InputStream in = new LiczLiczbeSlow(new FileInputStream(new File("a.txt")));
                System.out.println(in.read(b));
            }catch(Exception e){

            }
        */
    
}
