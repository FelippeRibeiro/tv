package TV;

public class TV {
	private boolean on;
	private int volume;
	private int canalAtual;
	private int[] canaisDisponiveis = {1,3,5,7,11};

	
	public TV(){
		this.on = false;
		this.volume = 0;
		this.canalAtual = 1;
		
	}

	public void TurnOffOn(){
		if(this.on == false) {
			this.on = true;
			System.out.println("Tv Ligada");
		} else {
			this.on = false;
			System.out.println("Tv Desligada");
		}
	}
	
	public void Aumentar() {
		if(on == true && this.volume >100) {
		this.volume +=1;
		System.out.println(this.volume);
		} else if(on == false) {
			TurnOffOn();
		}
	}
	
	public void Diminuir() {
		if(on == true && this.volume >0) {
			this.volume -=1;
		System.out.println(this.volume);
		} else if(on == false) {
			TurnOffOn();
		}
	}
	
	
	public void AumentarCanal() {
		
		switch (canalAtual) {
		case 1: {
			canalAtual = 3;
			break;
		}
		case 3: {
			canalAtual = 5;
			break;
		}
		case 5: {
			canalAtual = 7;
			break;
		}
		case 7: {
			canalAtual = 11;
			break;
		}
		case 11: {
			canalAtual = 1;
			break;
		}
		default:
			break;
		}
		System.out.println(this.canalAtual);
		
	}
	
	public void DiminuirCanal() {
		
		switch (canalAtual) {
		case 11: {
			canalAtual = 7;
			break;
		}
		case 7: {
			canalAtual = 5;
			break;
		}
		case 5: {
			canalAtual = 3;
			break;
		}
		case 3: {
			canalAtual = 1;
			break;
		}
		case 1: {
			canalAtual = 11;
			break;
		}
		default:
			break;
		}
		System.out.println(this.canalAtual);
		
	}
	
	public void MudarCanal(int canal) {
		
		if(on == true) {
			switch (canal) {
			case 1: {
				canalAtual = canal;
				System.out.println(canalAtual);
				break;
			}
			case 3: {
				canalAtual = canal;
				System.out.println(canalAtual);
				break;
			}
			case 5: {
				canalAtual = canal;
				System.out.println(canalAtual);
				break;
			}
			case 7: {
				canalAtual = canal;
				System.out.println(canalAtual);
				break;
			}
			case 11: {
				canalAtual = canal;
				System.out.println(canalAtual);
				break;
			}
			default:
				System.out.println("Canal indisponivel");
				break;
			}
		}
	}

	
	
	///Get an Setters;
	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int[] getCanaisDisponiveis() {
		return canaisDisponiveis;
	}

	public void setCanaisDisponiveis(int[] canaisDisponiveis) {
		this.canaisDisponiveis = canaisDisponiveis;
	}
	


	

}
