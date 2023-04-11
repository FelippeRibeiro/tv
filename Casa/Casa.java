package Casa;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import TV.Smartv;
import TV.Tv;
import controle.ControlePadrao;
import controle.ControleSmart;

public class Casa {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Tv TvSala=null,TvQuarto=null,TvVaranda=null;
		ControlePadrao controle = new ControlePadrao();
		ControleSmart controleSmart = new ControleSmart();

		System.out.println("Qual o tipo da tv da sala?");
		System.out.println("Smart ou Padrão?");
		System.out.println("1- Smart");
		System.out.println("2- Padrão");

		switch (input.nextInt()) {

		case 1:
			TvSala = new Smartv();

			break;
		case 2:
			TvSala = new Tv();

			break;

		}

		System.out.println("Qual o tipo da tv do Quarto?");
		System.out.println("Smart ou Padrão?");
		System.out.println("1- Smart");
		System.out.println("2- Padrão");

		switch (input.nextInt()) {

		case 1:
			TvQuarto = new Smartv();

			break;
		case 2:
			TvQuarto = new Tv();

			break;
		}

		System.out.println("Qual o tipo da tv da Varanda?");
		System.out.println("Smart ou Padrão?");
		System.out.println("1- Smart");
		System.out.println("2- Padrão");

		switch (input.nextInt()) {

		case 1:
			TvVaranda = new Smartv();

			break;
		case 2:
			TvVaranda = new Tv();

			break;
		}

		while (true) {
	
			System.out.println("1 - Tv Sala");
			System.out.println("2 - Tv Quarto");
			System.out.println("3 - Tv Varanda");
			switch (input.nextInt()) {
			case 1:
			
				if(!(TvSala instanceof Smartv)) {
			
					
					controle.menu(TvSala);
				} else {
				
					
					controleSmart.menu((Smartv) TvSala);
				}
				break;
			case 2:
				
				if(!(TvQuarto instanceof Smartv)) {
					
					controle.menu(TvQuarto);
				} else {
				
				
					controleSmart.menu((Smartv)TvQuarto);
				}

				break;
				
			case 3:
				
				if(!(TvVaranda instanceof Smartv)) {
					
					controle.menu(TvVaranda);
				} else {
				
					
					controleSmart.menu((Smartv)TvVaranda);
				}
				
				break;
				
			default:
				break;
			}
		}

	}



}
