package fabryka;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GaleriaZdjec img = (GaleriaZdjec)Fabryka.createType(TypStrony.GaleriaZdjec);
		img.Img();
		StronaInformacyjna img2 = (StronaInformacyjna)Fabryka.createType(TypStrony.StronaInformacyjna);
		img2.Text();
		StronaKontaktowa img3 = (StronaKontaktowa)Fabryka.createType(TypStrony.StronaKontaktowa);
		img3.Text();
		Aktualnosci img4 = (Aktualnosci)Fabryka.createType(TypStrony.Aktualnosci);
		img4.Text();
		
	}

}
