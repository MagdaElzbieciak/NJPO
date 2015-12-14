package Kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListWatek implements Runnable {

	
	private ListenerTest l;
	
	public LinkedListWatek(ListenerTest l){
		
		this.l = l;
	}
	
	@Override
	public void run() {
		
            String str = "";
            LinkedList<String> list = new LinkedList<String>();	
            for(int i = 0; i < 1000; i++){
                list.add(" ");
            }	
            
            long time = System.nanoTime();
            list.add(0, " ");
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Dodanie na poczatku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.add(" ");
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Dodanie na końcu: " + time + " ns\n";
            
            time = System.nanoTime();
            list.add(list.size()/2, " ");
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Dodanie  w środku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.remove(0);
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Usunięcie na poczatku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.remove(list.size()-1);
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Usunięcie na końcu: " + time + " ns\n";
            
            time = System.nanoTime();
            list.remove(list.size()/2);
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Usunięcie w środku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.get(0);
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Zwrócenie z początku " + time + " ns\n";
            
            time = System.nanoTime();
            list.get(list.size()-1);
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Zwrócenie z końca " + time + " ns\n";
            
            time = System.nanoTime();
            list.get(list.size()/2);
            time = System.nanoTime() - time;
            str = str + "LINKEDLIST - Zwrócenie ze środka " + time + " ns\n";
            
            
            l.wyswietl(str); 
		
		
	}
	

}
