package principal;

import java.util.HashSet;

public class Interpretadora {
    private HashSet<String> palavras_chave;
    SuporteTecnico suporte;
    
    public Interpretadora(){
        palavras_chave = new HashSet<>();
        suporte = new SuporteTecnico();
    }
    
    public void separarPalavras(String frase){
        String[] palavras = frase.split(" ");
        
        for(String palavra: palavras){
            palavras_chave.add(palavra);
        }
    }
    
    public String consultarSuporte(HashSet<String> palavras_chave){
        for(String palavra: palavras_chave){
            
        }
    }
    
    
}
