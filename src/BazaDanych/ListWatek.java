package BazaDanych;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListWatek implements Runnable {

	private ListenerTestBaza l;
	
	public ListWatek(ListenerTestBaza l){
		
		this.l = l;
	}
	
	
	@Override
	public void run() {
          
            Random r  = new Random();
           
            List<Long> list = new ArrayList<Long>();
            
            for(int  i = 0 ; i < 200 ; i++){
                list.add(r.nextLong());
            }
            long time = System.nanoTime();
            Collections.sort(list);
            time = System.nanoTime() - time;
            
            l.wyswietl("Czas sortowania dla listy: " + time/1000 + " us.\n");
		
	}
	

}
