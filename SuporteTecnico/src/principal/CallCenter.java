package principal;

import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Interpretadora interpreta = new Interpretadora();
        
        System.out.print("Bem-vindo ao sistema de Suporte Técnico.\nPressione <enter> para continuar ou digite 'sair' para sair do sistema.\n");
        
        String resposta = scanner.nextLine();
        
        if(resposta.equalsIgnoreCase("sair")){
            System.out.print("Obrigada por utilizar nossos serviços!\n");
        }
        while(resposta.equalsIgnoreCase("sair")==false){
            System.out.print("Descreva seu problema de maneira sucinta: ");
            String problema = scanner.nextLine();
            
            interpreta.separarPalavras(problema);
            
            
            
        }
        
        
    }
    
}
