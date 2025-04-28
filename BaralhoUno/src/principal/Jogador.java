package principal;

public class Jogador {

    private Carta[] mao;
    private Carta maior;

    public Jogador(int tamanho) {
        this.mao = new Carta[tamanho];
    }

    public void escolherMaior() {
        maior = mao[0];
        /*
        for (int i = 1; i < mao.length; i++) {
            if (mao[i].ehMaior(maior) == 1) {
                maior = mao[i];
            }
        }
        */
        for(Carta aux : mao){
            if(aux.ehMaior(maior) == 1){
                maior = aux;
            }
        }
    }
    
    public Carta descartarMaior(){
        for(int i = 0; i<mao.length;i++){
            if(mao[i].ehMaior(maior) == 0){
                maior = mao[i];
                mao[i]=null;
            }
        }
        return maior;
    }
    
    public void setMao(Carta[] cartasDistribuidas){
        this.mao = cartasDistribuidas;
    }

}
