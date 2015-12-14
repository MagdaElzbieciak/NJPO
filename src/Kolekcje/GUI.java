/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolekcje;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Danuta
 */
public class GUI extends JFrame implements ActionListener{
    
    JButton  button;
    JTextArea text;
    
    public GUI(){
    
        super("Analizator");
        setBounds(50,50,300,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        button = new JButton("Analizuj");
        button.setBounds(100,15,90,30);
        button.addActionListener(this);
        button.setActionCommand("analizuj");
        add(button);
        
        text = new JTextArea();
        JScrollPane sp = new JScrollPane(text);
        sp.setBounds(10, 60, 260,390);
        add(sp);
        
        setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("analizuj")){
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                
                File file = chooser.getSelectedFile();
                List<Znak> list = new ArrayList<Znak>();
                BufferedReader read = null;
                try{
                    read = new BufferedReader(new FileReader(file));
                    int i;
                    Znak znak ;
                    nastepny_znak:while((i = read.read())!=-1){
                        
                        Iterator<Znak> it = list.iterator();
                        while(it.hasNext()){
                            
                            znak = it.next();
                            if(znak.getZnak() == (char)i){
                                znak.licz();
                                continue nastepny_znak;
                            }
                        }
                        list.add(new Znak((char)i));
                    }
                    Collections.sort(list);
                    
                    Iterator<Znak> it = list.iterator();
                    
                    while(it.hasNext()){
                       
                       znak = it.next();
                       text.append("znak: " + znak.getZnak() + ", ilość: " + znak.getIlosc() + "\n");
                    }
                
                }
                catch(Exception e1){
                    
                }
                finally{
                    try {
                        read.close();
                    } catch (IOException ex) {
                        
                    }
                }
            }
        
        }
    }
    
    
}
