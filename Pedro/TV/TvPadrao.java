package TV;

import java.util.Scanner;

public class TvPadrao {
	static Scanner input = new Scanner(System.in);
	private Boolean estado;
	private int volume;
	private int canal;

	public TvPadrao() {
		this.volume = 0;
		this.canal = 1;
		this.estado = false;
	}

	public void onoff() {

		if (this.estado == false) {

			this.estado = true;
			System.out.println("TV Ligada!");

		} else if(this.estado == true) {

			this.estado = false;
			System.out.println("TV Desligada");
		}

	}

	public void volumeaumentar() {
		if (this.estado == true && this.volume < 100) {
			volume += 1;

		}
	}

	public void volumediminuir() {
		if (this.estado == true && this.volume > 0) {
			volume -= 1;

		}
	}

	public void canal(int channel) {
		
			switch (channel) {
			
			case 1:
				this.canal = 1;
				System.out.println("Canal 1");
				break;
			case 3:
				this.canal = 3;
				System.out.println("Canal 3");
				break;
			case 5:
				this.canal = 5;
				System.out.println("Canal 5");
				break;
			case 7:
				this.canal = 7;
				System.out.println("Canal 7");
				break;
			case 11:
				this.canal = 11;
				System.out.println("Canal 11");
				break;
			default:

				System.out.println("Canal invalido");
				break;
			}
		

	}

	public void menu() {
		System.out.println("1 - Ligar/Desligar");
		System.out.println("2 - Aumentar Volume");
		System.out.println("3 - Diminuir Volume");
		System.out.println("4 - Mudar Canal");
		int menus = input.nextInt();

		switch (menus) {
		case 1:
			this.onoff();
			break;
		case 2:
			if (this.estado == true) {
			this.volumeaumentar();
			System.out.println(this.volume);
			}
			break;
		case 3:if (this.estado == true) {
			this.volumediminuir();
			System.out.println(this.volume);
		}
			break;
		case 4:
			if (this.estado == true) {
			System.out.println("Digite o canal desejado:");
			this.canal(input.nextInt());
			} else {System.out.println("Tv desligada");}
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}

	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

}
