/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BazaDanych;


import java.io.Serializable;

/**
 *
 * @author Danuta
 */
public class OsobaBaza implements Comparable{
    
    private String imie;
    private String nazwisko;
    private String adres;
    private String numer_telefonu;
    
    public OsobaBaza(String imie, String nazwisko, String adres, String numer_telefonu){
        
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.numer_telefonu = numer_telefonu;
        
    }

    
    public String getImie() {
        return imie;
    }

    
    public String getNazwisko() {
        return nazwisko;
    }

   
    public String getAdres() {
        return adres;
    }

    
    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    @Override
    public int compareTo(Object o) {
        
        int  i = this.imie.toUpperCase().compareTo(((OsobaBaza)o).imie.toUpperCase());
        return (i == 0)?this.nazwisko.toUpperCase().compareTo(((OsobaBaza)o).nazwisko.toUpperCase()):i;
    }
    
}
