package Watek;

public class Silnia_iter implements Runnable {

	private int wart;
	private Listener l;
	
	public Silnia_iter(int wartosc, Listener l){
		
		wart = wartosc;
		this.l = l;
	}
	
	
	@Override
	public void run() {
		
		int wynik = 1;
		long czas = System.nanoTime();
		for(int i = 1; i <= wart ; i++){
			wynik = wynik * i; 
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
				break;
			}
		}
		czas = System.nanoTime() - czas;
		l.wyswietl(false, czas, wynik);
		
		
	}
	

}
