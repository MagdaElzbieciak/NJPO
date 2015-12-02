package Watek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Watek implements Runnable {

	Random r;
	@Override
	public void run() {
		
		try{
		r = new Random();
		File plik = new File("name" + r.nextLong());
		BufferedWriter write = new BufferedWriter(new FileWriter(plik));
		
		for(int i  = 0; i<1048576; i++)
		write.write(r.nextInt(256));
		
		}catch(Exception ex){
			
		}
	}

	
	

}
