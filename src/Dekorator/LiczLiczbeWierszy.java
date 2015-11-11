/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Danuta
 */
public class LiczLiczbeWierszy extends FilterInputStream {
    
    public LiczLiczbeWierszy(InputStream in){
        super(in);
        
    }
     public int read(byte[] b) throws IOException{
         int ctrl = super.read(b);
         if(ctrl == -1) return 0 ;
         int enter = 1;
         for(int i = 0;i < ctrl;i++){
             if(b[i] == '\n')
                 enter++;
         }
         return enter;
     }
     
    public int read(byte[] b, int off, int len) throws IOException{
         int ctrl = super.read(b,off,len);
         if(ctrl == -1) return 0 ;
         int enter = 1;
         for(int i = off;i < ctrl+off;i++){
             if(b[i] == '\n')
                 enter++;
         }
         return enter;
     }
}
