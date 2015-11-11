package fabryka;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class StronaInformacyjna extends StronaInternetowa {
	
	public void Text(){
		try{
			BufferedWriter file = new BufferedWriter(new FileWriter(new File("stronainformacyjna.html")));
			
			String str="";
			char n;
			Random r = new Random();
			for(int i=0; i<10000;i++){
				n = (char)(r.nextInt(26)+97);
				str = str + n;
				if(i%100==99){
					str=str+"<br>";
				}
			}
			
			file.write(str);
			file.close();
		}catch(Exception e ){
			
		}
	}
	

}
