package Tvsmart;

import java.util.Scanner;
import TV.TvPadrao;

public class Smartv extends TvPadrao {
	static Scanner input = new Scanner(System.in);
	Boolean conectado;
	int usuario = 123456, senha = 987654;

	public Smartv() {
		super();

	}

	public void login(int login, int senha) {
		if (login == this.usuario && senha == this.senha && super.getEstado()) {
			conectado = true;
			System.out.println("TV conectada");
		} else if (login != this.usuario || senha != this.senha) {
			System.out.println("Credências incorretas");

		}

	}

	public void mudarSenha(int novologin, int novasenha) {
		if (conectado == true && super.getEstado()) {
			this.usuario = novologin;
			this.senha = novasenha;
			conectado = false;
			System.out.println("Senha alterada com sucesso!");
		} else {

			System.out.println("TV não conectada!");
		}
	}

	public void Streaming() {
		if (conectado == true && super.getEstado()) {

			System.out.println("1 - Netflix ");
			System.out.println("2 - Amazon ");
			System.out.println("3 - Hbomax ");
			System.out.println("4 - Voltar para TV");
			int opcao = input.nextInt();
			if (opcao == 4) {

				menuSmart();
			}
			else {
				System.out.println("Aproveite seu filme!");
				menuSmart();
				
			}
		} else {
			System.out.println("Tv não conectada!");
			menuSmart();
		}

	}

	public void menuSmart() {
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
			this.login(login, senha);
			break;
		case 2:
			System.out.println("Digite a senha atual: ");
			// senha = input.nextInt();
			if (this.senha == input.nextInt()) {
				System.out.println("Digite o novo login: ");
				int novologin = input.nextInt();
				System.out.println("Digite a nova senha: ");
				int novasenha = input.nextInt();
				this.login(novologin, novasenha);
			} else {

				System.out.println("Senha incorreta");
			}
			break;
		case 3:
			Streaming();
			break;
		case 4:
			break;

		}

	}

	public void menu() {
		System.out.println("1 - Ligar/Desligar");
		System.out.println("2 - Aumentar Volume");
		System.out.println("3 - Diminuir Volume");
		System.out.println("4 - Mudar Canal");
		System.out.println("5 - TV smart");
		int menus = input.nextInt();
		
		switch (menus) {
		case 1:
			super.onoff();
			break;
		case 2:
			if (super.getEstado()) {
			this.volumeaumentar();
			System.out.println(super.getVolume());}
			break;
		case 3:
			if (super.getEstado()) {
			this.volumediminuir();
			System.out.println(super.getVolume());
			}
			break;
		case 4:
			if (super.getEstado()) {
			System.out.println("Digite o canal desejado:");
			super.canal(input.nextInt());
			}
			break;
		case 5:
			if(super.getEstado()) {
				menuSmart();
			}
						
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}

	}
}
