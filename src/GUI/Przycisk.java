/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Danuta
 */
public class Przycisk extends JFrame implements MouseListener {
    
    private JButton button;
    
    public Przycisk(){
        
        super("Przycisk");
        setBounds(50, 50, 500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        button = new JButton("Click!");
        button.setBounds(200, 125, 100, 30);
        button.addMouseListener(this);
        add(button);
        
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Random r = new Random();
        int x = r.nextInt(getWidth()-button.getWidth()-50);
        int y = r.nextInt(getHeight()-button.getHeight()-50);
        button.setLocation(x, y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    
    
}
