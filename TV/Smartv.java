package TV;

import java.util.Scanner;

public class Smartv extends Tv {
	static Scanner input = new Scanner(System.in);
	Boolean conectado =false;
	int usuario = 123456, senha = 987654;

	public Smartv() {
		super();

	}

	public String login(int login, int senha) {
		if (login == this.usuario && senha == this.senha && super.getEstado()) {
			conectado = true;
			System.out.println("TV conectada");
			return "Conectado!";
		} else if (login != this.usuario || senha != this.senha) {
			System.out.println("Credências incorretas");
			return "Credenciais Incorreta";
		} else {
			return "Erro";
		}

	}

	public String mudarSenha(int novologin, int novasenha) {
		if (conectado == true && super.getEstado()) {
			this.usuario = novologin;
			this.senha = novasenha;
			conectado = false;
			System.out.println("Senha alterada com sucesso!");
			return "Senha alterada com sucesso!";
		} else {

			System.out.println("TV não conectada!");
			return "TV n�o conectada";
		}
	}
	
	
	public Boolean getConectado() {
		return conectado;
	}

	public void setConectado(Boolean conectado) {
		this.conectado = conectado;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
