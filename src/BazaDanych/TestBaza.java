package BazaDanych;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

	
	
public class TestBaza extends JFrame implements ListenerTestBaza, ActionListener{
	

	private JButton b1;
	private Thread arraylist;
	private Thread baza;
        private JTextArea text;
	
	
	public TestBaza(){
	
	super("Testy");
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
			
			arraylist = new Thread(new ListWatek(this));
			baza = new Thread(new BazaWatek(this));
			arraylist.start();
			baza.start();
			
		}
	
	}
}
