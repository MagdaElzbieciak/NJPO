/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BazaDanych;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Danuta
 */
public class KsiazkaBaza extends JFrame implements ActionListener{
        
    JButton  button;
    JTextArea text;
    JTextField [] tab = new JTextField[5];
    List<OsobaBaza> list = new ArrayList<OsobaBaza>();
        
    public KsiazkaBaza(){
    
        super("Ksiazka Adresowa");
        setBounds(50,50,430,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        button = new JButton("Dodaj");
        button.setBounds(15,15,90,30);
        button.addActionListener(this);
        button.setActionCommand("dodaj");
        add(button);
        
        button = new JButton("Usun");
        button.setBounds(115,15,90,30);
        button.addActionListener(this);
        button.setActionCommand("usun");
        add(button);
        
        button = new JButton("Wyswietl");
        button.setBounds(215,15,90,30);
        button.addActionListener(this);
        button.setActionCommand("wyswietl");
        add(button);
        
        button = new JButton("Sortuj");
        button.setBounds(315,15,90,30);
        button.addActionListener(this);
        button.setActionCommand("sortuj");
        add(button);
        
        tab[0] = new JTextField();
        tab[0].setBounds(15, 55, 120, 40);
        tab[0].setBorder(BorderFactory.createTitledBorder("imie"));
        add(tab[0]);
        
        tab[1] = new JTextField();
        tab[1].setBounds(145, 55, 120, 40);
        tab[1].setBorder(BorderFactory.createTitledBorder("nazwisko"));
        add(tab[1]);
        
        tab[2] = new JTextField();
        tab[2].setBounds(275, 55, 120, 40);
        tab[2].setBorder(BorderFactory.createTitledBorder("telefon"));
        add(tab[2]);
        
        tab[3] = new JTextField();
        tab[3].setBounds(15, 105, 380, 40);
        tab[3].setBorder(BorderFactory.createTitledBorder("adres"));
        add(tab[3]);
        
        tab[4] = new JTextField();
        tab[4].setBounds((getWidth()-70)/2-10, 155, 70, 40);
        tab[4].setBorder(BorderFactory.createTitledBorder("indeks"));
        add(tab[4]);
        
        text = new JTextArea();
        JScrollPane sp = new JScrollPane(text);
        sp.setBounds(10, 210, 390,350);
        add(sp);
        
        odczyt();
        
        
        
        setVisible(true);
    }

    public void zapis(){
        
        SingletonBazy s = SingletonBazy.getInstance();
        s.polaczenie("jdbc:sqlite:plikbazy.db");
        s.executeUpdate("Create table Ksiazka(imie varchar(20), nazwisko varchar(30), adres varhchar(100), numer_telefonu varchar(20)); ");
        s.executeUpdate("delete from Ksiazka;");
        
        
        OsobaBaza osoba = null;
        for(int i = 0, size = list.size() ; i < size; i++){
            
            osoba = list.get(i);
            String str = "insert into Ksiazka values ('" + osoba.getImie() + "', '" + osoba.getNazwisko() + "', '" + osoba.getAdres() + "', '" + osoba.getNumer_telefonu() + "');";
            s.executeUpdate(str);
  
        }
        
         
    }
    
    public void odczyt(){
        
        try{
            
            SingletonBazy s = SingletonBazy.getInstance();
            s.polaczenie("jdbc:sqlite:plikbazy.db");
            ResultSet result = s.executeQuery("Select * from Ksiazka;");
            if(result == null)
                return;
           
            String imie, nazwisko, adres, numer_telefonu;
            OsobaBaza osoba = null;
                    
            while(result.next()){
                
                imie = result.getString("imie");
                nazwisko = result.getString("nazwisko");
                adres = result.getString("adres");
                numer_telefonu = result.getString("numer_telefonu");
                
                osoba = new OsobaBaza(imie, nazwisko, adres, numer_telefonu);
                list.add(osoba);
            }
            
            s.close();
            
        }catch(SQLException ex){
            
        }
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("dodaj")){
            list.add(new OsobaBaza(tab[0].getText(),tab[1].getText(),tab[3].getText(),tab[2].getText()));
            zapis();
        }
        else if(e.getActionCommand().equals("usun")){
            try{
                int i = Integer.parseInt(tab[4].getText())-1;
                
                
                if(i >= 0 && i < list.size()){
                    list.remove(i);
                    zapis();
                }
            }
            catch(NumberFormatException ex){
                
            }
        }else if(e.getActionCommand().equals("wyswietl")){
            
            text.setText("");
            OsobaBaza o  = null;
            for(int i = 0, j = list.size(); i < j; i++){
                
                o  = list.get(i);
                text.append((i+1) + ". " + o.getImie() + " " + o.getNazwisko() + "\nAdres: " + o.getAdres() + "\nTelefon: " + o.getNumer_telefonu() + "\n");
            }
            
        }
        else if (e.getActionCommand().equals("sortuj")){
            Collections.sort(list);
        }
    }

    
}
