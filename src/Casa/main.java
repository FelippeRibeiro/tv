package Casa;
import TV.TV;
public class main {

	public static void main(String[] args) {
		TV TvSala = new TV();
		TvSala.TurnOffOn();
		System.out.println(TvSala.getVolume());
		TvSala.MudarCanal(2);
		
		TV TvQuarto = new TV();
		TvQuarto.MudarCanal(0);
	
	}

}
