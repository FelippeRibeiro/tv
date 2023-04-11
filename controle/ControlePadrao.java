package controle;
import java.util.Scanner;

import TV.Tv;

public class ControlePadrao {
	static Scanner input = new Scanner(System.in);

	

	public ControlePadrao() {
	}

	

	public void menu(Tv Tv) {
		boolean Break = true;
		while(Break) {
		System.out.println("1 - Ligar/Desligar");
		System.out.println("2 - Aumentar Volume");
		System.out.println("3 - Diminuir Volume");
		System.out.println("4 - Mudar Canal");
		int menus = input.nextInt();

		switch (menus) {
		case 1:
			Tv.onoff();
			break;
		case 2:
			if (Tv.getEstado()) {
				Tv.volumeaumentar();
			System.out.println(Tv.getVolume());
			}
			break;
		case 3:if (Tv.getEstado()) {
			Tv.volumediminuir();
			System.out.println(Tv.getVolume());
		}
			break;
		case 4:
			if (Tv.getEstado()) {
			System.out.println("Digite o canal desejado:");
			Tv.canal(input.nextInt());
			} else {System.out.println("Tv desligada");}
			break;
		default:
			Break = false;
			break;
		}
		}

}
}