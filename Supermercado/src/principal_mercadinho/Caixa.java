package principal_mercadinho;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto p1 = new Produto("Leite", 2, 7.0);
        p1.setDescricao("Leite Longa Vida");
        
        Estoque docas = new Estoque(150);
        
        ItemProduto item = new ItemProduto(p1, 100, 700);
        
        docas.adicionarItemProduto(item);
        
        System.out.println("Bem-vindo ao Supermercado Mercadinho!\n");
        System.out.println(docas.listarProdutos());
        System.out.println("Informe o código do produto desejado: ");
        int codigo = entrada.nextInt();
    }
    
    
}
