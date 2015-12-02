/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem5;

/**
 *
 * @author Danuta
 */
public class Sem5 {

    /**
     * @param args the command line arguments
     */
public static void draw(char[][] tab){
   
        
        
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j]); 
            }
            System.out.println();
        }

    
}
    public static void main(String[] args) {
        // TODO code application logic here
       
        int n = 6;
        char[][] tab = new char[n][n];
        
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                if(i==j || i == tab.length-j-1)
                tab[i][j] = 'x'; 
                else
                tab[i][j] = ' ';
            }
        }
        draw(tab);
    
    }
    
}
