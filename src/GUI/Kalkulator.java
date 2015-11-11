/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Danuta
 */
public class Kalkulator extends JFrame implements ActionListener {
    
    public JTextField t1;
    public JTextField t2;
    public JTextField t3;
    public JLabel l;
    public JRadioButton [] r;
    
    public Kalkulator(){
    
        super("Kalkulator");
        setBounds(50,50,300,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        l = new JLabel("Podaj liczbe");
        l.setBounds(10, 10, 200, 30);
        add(l);
        
        t1 = new JTextField();
        t1.setBounds(10,50,75,50);
        add(t1);
        
        t2 = new JTextField();
        t2.setBounds(100,50,75,50);
        add(t2);
        
        JButton b = new JButton("Click!"); // ustawia przycisk
        b.setBounds(70, 170, 75, 50);
        b.addActionListener(this);
        b.setActionCommand("klik");
        add(b);
        
        l = new JLabel("Wybierz operacje");
        l.setBounds(10, 110, 200, 30);
        add(l);
        
        r = new JRadioButton[4];
        r[0] = new JRadioButton("+");
        r[0].setBounds(10, 140, 40, 20);
        add(r[0]);
        
        r[1] = new JRadioButton("-");
        r[1].setBounds(10, 170, 40, 20);
        add(r[1]);
        
        r[2] = new JRadioButton("*");
        r[2].setBounds(10, 200, 40, 20);
        add(r[2]);
        
        r[3] = new JRadioButton("/");
        r[3].setBounds(10, 230, 40, 20);
        add(r[3]);
        
        ButtonGroup g = new ButtonGroup();
        for(int i = 0; i < r.length ; i++){
           g.add(r[i]); 
        }
        
        l = new JLabel("Wynik");
        l.setBounds(10, 260, 200, 30);
        add(l);
        
        t3 = new JTextField();
        t3.setBounds(10, 290, 75, 50);
        t3.setEditable(false);
        add(t3);
        
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("klik")){
            String a = t1.getText();
            String b = t2.getText();
            double wynik = 0;
            double c = 0;
            double d = 0;
        
            try{    
                c = Double.parseDouble(a);
                d = Double.parseDouble(b);
            }catch(NumberFormatException ex){
                return;
            }
            
            if(r[0].isSelected()){
                wynik = c + d;
            }
            else if(r[1].isSelected()){
                wynik = c - d;
            }
            else if(r[2].isSelected()){
                wynik = c * d;
            }
            else if(r[3].isSelected()){
                wynik = c / d;
            }
            t3.setText(wynik+"");
            
        }
       
    }
    
    
}
