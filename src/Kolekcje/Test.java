package Kolekcje;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

	
	
public class Test extends JFrame implements ListenerTest, ActionListener{
	

	private JButton b1;
	private Thread arraylist;
	private Thread linkedlist;
        private JTextArea text;
	
	
	public Test(){
	
	super("Listy");
	setBounds(50, 50, 400, 250);
	setLayout(null);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	b1 = new JButton("Testuj");
	b1.addActionListener(this);
	b1.setBounds(15, 15, 100, 30);
	add(b1);
        
        text = new JTextArea();
        JScrollPane sp = new JScrollPane(text);
        sp.setBounds(15, 55, 350,130);
        add(sp);
	

	setVisible(true);
	
	}


	@Override
	public void wyswietl(String str) {
		// TODO Auto-generated method stub
		
            text.append(str);
		
	}
        
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource().equals(b1)){
			
			arraylist = new Thread(new ArrayListWatek(this));
			linkedlist = new Thread(new LinkedListWatek(this));
			arraylist.start();
			linkedlist.start();
			
		}
	
	}
}
