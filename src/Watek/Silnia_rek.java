package Watek;

public class Silnia_rek  implements Runnable{

	private int wart;
	private Listener l;
	
	public Silnia_rek(int wartosc, Listener l){
		
		wart = wartosc;
		this.l = l;
		
	}
	
	public int silnia(int wartosc){
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
		if(wartosc<=1) return 1;
		return wartosc*silnia(--wartosc);
	}
	
	@Override
	public void run() {
		
		long czas = System.nanoTime();
		int silnia = silnia(wart);
		czas = System.nanoTime() - czas;
		System.out.println("dupa");
		l.wyswietl(true, czas, silnia);
	}
	
	

}
