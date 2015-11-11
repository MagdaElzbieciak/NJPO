package fabryka;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class GaleriaZdjec extends StronaInternetowa {
	
public  void Img(){
	try{
		BufferedWriter file = new BufferedWriter(new FileWriter(new File("galeria.html")));
		file.write("<img src=\"obraz.jpg\">");
		file.write("<br>");
		file.write("<img src=\"obraz2.jpg\">");
		file.close();
		}
		catch(Exception e){
			
		}
}
}
