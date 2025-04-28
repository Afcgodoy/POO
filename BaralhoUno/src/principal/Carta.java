package principal;

public class Carta {
    private int valor;
    private String naipe;

    public Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    
    
    public int ehMaior(Carta carta){
        if(this.valor > carta.getValor()){
            return 1;
        }else{
            if (this.valor < carta.getValor()){
                return -1;
            }
        }
        return 0;
    }
    
}
