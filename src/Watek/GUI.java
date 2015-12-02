package Watek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

	
	
public class GUI extends JFrame implements Listener, ActionListener{
	
	private JTextField f;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JButton b1;
	private JButton b2;
	private Thread rek;
	private Thread iter;
	
	
	public GUI(){
	
	super("Silnia");
	setBounds(50, 50, 400, 250);
	setLayout(null);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	l1 = new JLabel("Wpisz wartoœæ:");
	l1.setBounds(20, 10, 100 , 30);
	add(l1);
	
	f = new JTextField();
	f.setBounds(120, 10, 100, 30);
	add(f);
	
	b1 = new JButton("Licz");
	b1.addActionListener(this);
	b1.setBounds(120, 50, 100, 30);
	add(b1);
	
	b2 = new JButton("Nie chce d³u¿ej czekaæ");
	b2.addActionListener(this);
	b2.setBounds(60, 90, 200, 30);
	add(b2);
	
	l2 = new JLabel("Iteracyjnie:");
	l2.setBounds(20, 120, 300 , 30);
	add(l2);
	
	l3 = new JLabel("Rekurencyjnie:");
	l3.setBounds(20, 150, 300 , 30);
	add(l3);
	
	setVisible(true);
	
	}


	@Override
	public void wyswietl(boolean wart, long czas, int silnia) {
		// TODO Auto-generated method stub
		
		if (wart){
			l3.setText("Rekurencyjnie: " + silnia + "   ,czas: " + czas + "ns");
		}
		else
			l2.setText("Iteracyjnie: " + silnia + "   ,czas: " + czas + " ns" );
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource().equals(b1)){
			
			try{
			rek = new Thread(new Silnia_rek(Integer.parseInt(f.getText()),this));
			iter = new Thread(new Silnia_iter(Integer.parseInt(f.getText()),this));
			rek.start();
			iter.start();
			}catch(NumberFormatException e){
				
			}
			
		}
		else if(arg0.getSource().equals(b2)){
			
			rek.interrupt();
			iter.interrupt();
			
		}
			
		
	}
}
