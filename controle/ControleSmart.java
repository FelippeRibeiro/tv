package controle;

import java.util.Scanner;

import TV.Smartv;

public class ControleSmart {
	
	static Scanner input = new Scanner(System.in);

	public ControleSmart() {
	
	}

	public void menuSmart(Smartv Tv) {
		System.out.println("1 - Conectar a internet ");
		System.out.println("2 - Alterar senha ");
		System.out.println("3 - Streaming ");
		System.out.println("4 - Voltar para TV");
		switch (input.nextInt()) {
		case 1:
			System.out.println("Digite o login: ");
			int login = input.nextInt();
			System.out.println("Digite a senha: ");
			int senha = input.nextInt();
			Tv.login(login, senha);
			break;
		case 2:
			System.out.println("Digite a senha atual: ");
			senha = input.nextInt();
			if (Tv.getSenha() == input.nextInt()) {
				System.out.println("Digite o novo login: ");
				int novologin = input.nextInt();
				System.out.println("Digite a nova senha: ");
				int novasenha = input.nextInt();
				Tv.login(novologin, novasenha);
			} else {

				System.out.println("Senha incorreta");
			}
			break;
		case 3:
			this.Streaming(Tv);
			break;
		case 4:
			this.menu(Tv);
			break;

		}

	}

	public void menu(Smartv Tv) {
		boolean Break = true;
		while(Break) {
		System.out.println("1 - Ligar/Desligar");
		System.out.println("2 - Aumentar Volume");
		System.out.println("3 - Diminuir Volume");
		System.out.println("4 - Mudar Canal");
		System.out.println("5 - TV smart");
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
		case 3:
			if (Tv.getEstado()) {
				Tv.volumediminuir();
				System.out.println(Tv.getVolume());
			}
			break;
		case 4:
			if (Tv.getEstado()) {
				System.out.println("Digite o canal desejado:");
				Tv.canal(input.nextInt());
			}
			break;
		case 5:
			if (Tv.getEstado()) {
				menuSmart(Tv);
			}

			break;
		default:
			Break = false;
			break;
		}
		}
	}

	public void Streaming(Smartv Tv) {
		if (Tv.getConectado() && Tv.getEstado()) {

			System.out.println("1 - Netflix ");
			System.out.println("2 - Amazon ");
			System.out.println("3 - Hbomax ");
			System.out.println("4 - Voltar para TV");
			int opcao = input.nextInt();
			if (opcao == 4) {

				menuSmart(Tv);
			} else {
				System.out.println("Aproveite seu filme!");
				menuSmart(Tv);

			}
		} else {
			System.out.println("Tv não conectada!");
			menuSmart(Tv);
		}
	}

}
