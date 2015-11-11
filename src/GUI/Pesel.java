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
public class Pesel extends JFrame implements ActionListener{
    
    private JLabel l;
    private JTextField text;
    private JButton button;
    
    public Pesel(){
        
        super("Pesel");
        setBounds(50,50,350,200); //ustawia położenie okna i rozmiar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); 
        
        l = new JLabel("Wpisz swój pesel");
        l.setBounds(10, 10, 200, 30);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        add(l);
        
        text = new JTextField();
        text.setBounds(10, 50, 300, 30);
        add(text);
        
        button = new JButton("Sprawdź");
        button.setBounds(60, 90, 100, 30);
        button.addActionListener(this);
        button.setActionCommand("klik");
        add(button);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("klik")){
            String pesel = text.getText();
            int [] tab = new int[11];
            int [] wagi = {9,7,3,1,9,7,3,1,9,7};
            if(pesel.length() != 11){
                l.setText("Niepoprawny pesel");
                return;
            }
            for(int i =0;i<pesel.length();i++){
                char znak = pesel.charAt(i);
                if(znak>='0' && znak<='9'){
                    tab[i] = znak - 48;
                }
                else{
                    l.setText("Niepoprawny pesel");
                    return;
                }
            }
            int suma = 0;
            for(int i = 0; i<tab.length-1;i++){
                suma +=tab[i]*wagi[i];
            }
            if(suma%10 == tab[10])
                l.setText("Poprawny pesel");
            else
                l.setText("Niepoprawny pesel");
        }
    }
    
}
