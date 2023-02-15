package TV;

public class Controle {
    private int frequencia;
    private TV tv;
    private boolean enable;
    
   public Controle(int freq,TV tv){
        if(tv.id == freq){
        this.frequencia = freq;
        this.tv= tv;
        this.enable = true;
        } else{
            this.enable = false;
        }
    }

    public void botoes(){
        System.out.println("1 - Ligar/Desligar");
        System.out.println("2 - Aumentar volume");
        System.out.println("3 - Diminuir volume");
        System.out.println("4 - Aumentar canal");
        System.out.println("5 - Diminuir volume");
    }

    public void comando(int botao){
        switch (botao) {
            case 1:
            this.tv.TurnOffOn();
                break;
            case 2:
                this.tv.Aumentar();
                break;    
            case 3:
                this.tv.Diminuir();
                break;
            case 4:
                this.tv.AumentarCanal();
                break;    
            case 5:
                this.tv.DiminuirCanal();
                break;  
            default:
                break;
        }

    }


}
