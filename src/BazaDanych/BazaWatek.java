package BazaDanych;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class BazaWatek implements Runnable {

	
	private ListenerTestBaza l;
	
	public BazaWatek(ListenerTestBaza l){
		
		this.l = l;
	}
	
	@Override
	public void run() {
		
            SingletonBazy s = SingletonBazy.getInstance();
            Random r = new Random();
            s.polaczenie("jdbc:sqlite:plikbazy.db");
            s.executeUpdate("Create table Test( ID Bigint);");
            s.executeUpdate("delete from Test;");
            
            for(int  i = 0 ; i < 200 ; i++){
                s.executeUpdate("insert into Test values ( " + r.nextLong() + ");");
                System.out.println(i);
            }
            long time = System.nanoTime();
            s.executeQuery("select * from Test order by id asc;");
            time = System.nanoTime() - time;
            
            l.wyswietl("Czas sortowania dla bazy: " + time/1000 + " us.\n" );
		
	}
	

}
