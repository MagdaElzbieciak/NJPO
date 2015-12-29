/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testyautomatyczne;

/**
 *
 * @author Danuta
 */
public class Rownaniekwadratowe {
    
   public static double[] oblicz(int a, int b, int c){
       
       if(a == 0  ){
        
           if(b == 0 ){
               return null;
           }
           double[] tab = new double[1];
           tab[0] = -(double)c/b;
           return tab;
       }
       
       double delta  = b*b - 4*a*c;
       
       if(delta > 0){
           double[] tab = new double[2];
           tab[0] = (-b-Math.sqrt(delta))/(2*a);
           tab[1] = (-b+Math.sqrt(delta))/(2*a);
           return tab;
       }
       else if(delta ==0){
           double[] tab = new double[1];
           tab[0] = -b/(2*a);
           return tab;
       }
       else 
           return null;
       
   }
    
}
