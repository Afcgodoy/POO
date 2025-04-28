
package principal;

import java.util.Scanner;

public class Mesa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // instanciando o baralho
        Baralho copag = new Baralho();
        System.out.println("Mesa embaralhando........");
        // invocando o metodo embaralhar do baralho
        copag.embaralhar();
        System.out.println("Informe o número de cartas a distribuir para os jogadores:");
        int tamanho = input.nextInt();
        // instanciando o jogador A
        Jogador a = new Jogador(tamanho);
        // instanciando o jogador B
        Jogador b = new Jogador(tamanho);

    }
    
}
