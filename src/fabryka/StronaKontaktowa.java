package fabryka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Random;

public class StronaKontaktowa extends StronaInternetowa {
	
	public void Text(){
		String[] imie = {"Magda","Asia","Kasia","Basia","Janusz"};
		try{
			BufferedWriter file = new BufferedWriter(new FileWriter(new File("stronakontaktowa.html")));
			
			String str = "";
			Random r = new Random();
			DecimalFormat format = new DecimalFormat("000000000");
			for(int i=0;i<50;i++){
				
				str = str +  "imie:"+imie[r.nextInt(imie.length)] + ", numer:" + format.format(r.nextInt(1000000000)) +", miasto:Sosnowiec"+"<br>";
				
			}
			
			file.write(str);
			file.close();
		}catch(Exception e ){
			
		}
	}
	
}
