package fabryka;

public class Fabryka {
	
	public static StronaInternetowa createType(TypStrony typ){
		
		switch(typ){
		case Aktualnosci:{
			return new Aktualnosci();
		}
		case StronaKontaktowa:{
			return new StronaKontaktowa();
		}
		case GaleriaZdjec:{
			return new GaleriaZdjec();
		}
		case StronaInformacyjna:{
			return new StronaInformacyjna();
		}
		default:
			return null;	
		}
	}

}
