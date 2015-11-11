/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasyno;

/**
 *
 * @author Danuta
 */
public class GraczWBlackjacka {
    
    private int stan_konta;
    
    public GraczWBlackjacka(){
        
    }
    
    public void Wygraj(){
        
        Kasyno.getInstance().WygranaWBlackJacka();
        stan_konta = stan_konta + 10;
    }
    
     public void Przegraj(){
        
        Kasyno.getInstance().PrzegranaWBlackJacka();
        stan_konta = stan_konta - 10;
     }
    public int GetStanKonta(){
        
        return stan_konta;
    }
    
    public void SetStanKonta(int stan_konta){
        
        this.stan_konta = stan_konta;
    }
}
