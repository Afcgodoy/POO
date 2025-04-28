package principal;

import java.security.SecureRandom;

public class Baralho {

    private Carta[] cartas;
    private String[] naipes = {"Ouros", "Copas", "Espada", "Paus"};
    private SecureRandom gerador;

    public Baralho() {
        cartas = new Carta[52];
        int pos = 0;
        gerador = new SecureRandom();
        for (int n = 0; n < naipes.length; n++) {
            for (int v = 1; v < 14; v++) {
                cartas[pos] = new Carta(v, naipes[n]);
                pos++;
            }
        }
    }

    public void embaralhar() {
        int pos;
        Carta aux;
        for (int v = 0; v < 4; v++) {
            for (int i = 0; i < cartas.length; i++) {
                pos = gerador.nextInt(52);
                aux = cartas[pos];
                cartas[pos] = cartas[i];
                cartas[i] = aux;

            }
        }
    }
    
    public Carta[] distribuirCartas(int tamanho){
        Carta[] deller =  new Carta[tamanho];
        // retirar as cartas do baralho para distribuir ao jogador
        
        return deller;
    }

}
