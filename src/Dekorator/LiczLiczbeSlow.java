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
public class LiczLiczbeSlow extends FilterInputStream {
    
    public LiczLiczbeSlow(InputStream in){
           
        super(in);
    }
    
    public int read(byte[] b) throws IOException{
        int ctrl = super.read(b);
        if(ctrl == -1) return 0;
        int word = 1 ;
        for(int i = 0; i < b.length; i++){
            if(b[i] == ' ' || b[i] == '\n' || b[i] == '\t'){
            word++;
        }
        }
        return word;
    }
    
}
