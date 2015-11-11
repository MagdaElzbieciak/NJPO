/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Danuta
 */
public class HelloWorld extends JFrame implements ActionListener{
    
    private JTextField t;
    private JLabel l;
    
    public HelloWorld(){
        
        super("Welcome");
        setBounds(50,50,250,200); //ustawia położenie okna i rozmiar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); //można samemu z nullem ustawiać buttony
        
        JButton b = new JButton("Kliknij mnie!"); // ustawia przycisk
        b.setBounds(50, 60, 120, 30);
        b.addActionListener(this);
        b.setActionCommand("klik");
        add(b);
        
        t = new JTextField(); // miejsce do wpisywania tekstu
        t.setBounds(25, 20, 170, 30);
        add(t);
        
        l = new JLabel("Podaj imię"); //wyświetla tekst
        l.setBounds(25, 100, 170, 30);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        add(l);
        
        setVisible(true); // wyświetla okno
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("klik")){
            String imie = t.getText();
            l.setText( "Witaj " + imie + "!");   
        }
    }
    
    
    
    
    
}
