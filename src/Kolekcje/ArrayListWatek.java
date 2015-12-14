package Kolekcje;

import java.util.ArrayList;

public class ArrayListWatek implements Runnable {

	private ListenerTest l;
	
	public ArrayListWatek(ListenerTest l){
		
		this.l = l;
	}
	
	
	@Override
	public void run() {
            
            String str = "";
            ArrayList<String> list = new ArrayList<String>();	
            for(int i = 0; i < 1000; i++){
                list.add(" ");
            }	
            
            long time = System.nanoTime();
            list.add(0, " ");
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Dodanie na poczatku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.add(" ");
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Dodanie na końcu: " + time + " ns\n";
            
            time = System.nanoTime();
            list.add(list.size()/2, " ");
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Dodanie  w środku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.remove(0);
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Usunięcie na poczatku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.remove(list.size()-1);
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Usunięcie na końcu: " + time + " ns\n";
            
            time = System.nanoTime();
            list.remove(list.size()/2);
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Usunięcie w środku: " + time + " ns\n";
            
            time = System.nanoTime();
            list.get(0);
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Zwrócenie z początku " + time + " ns\n";
            
            time = System.nanoTime();
            list.get(list.size()-1);
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Zwrócenie z końca " + time + " ns\n";
            
            time = System.nanoTime();
            list.get(list.size()/2);
            time = System.nanoTime() - time;
            str = str + "ARRAYLIST - Zwrócenie ze środka " + time + " ns\n";
            
            
            l.wyswietl(str); 
		
		
	}
	

}
