/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasyno;


public class Kasyno {
    
    private static Kasyno instance;
    private int stan_konta = 1000;
    
    private Kasyno(){
        
    }
 
public static Kasyno getInstance(){
     if(instance == null){
         instance = new Kasyno();
     }
     return instance;
 }  

public int getStanKonta(){
     
    return stan_konta;
}

public void setStanKonta(int stan_konta){
    
    this.stan_konta = stan_konta;
}

public void WygranaWBlackJacka(){
    
    stan_konta = stan_konta - 10;
}

public void PrzegranaWBlackJacka(){
    
    stan_konta = stan_konta + 10;
}

public void WygranaWJednorekiegoBandyte(){
    
    stan_konta = stan_konta - 10;
}

public void PrzegranaWJednorekiegoBandyte(){
    
    stan_konta = stan_konta + 10;
}

}
