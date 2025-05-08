package principal;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;

public class SuporteTecnico {
    private HashMap<String,String> banco_solucoes;
    private ArrayList<String> resposta_padrao;
    private SecureRandom gerador;
    
    public SuporteTecnico(){
        banco_solucoes = new HashMap<>();
        resposta_padrao = new ArrayList<>();
        gerador = new SecureRandom();
        preencherBancoSolucoes();
        preencherRespostaPadrao();
    }
    
    private void preencherBancoSolucoes(){
        banco_solucoes.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?");
        banco_solucoes.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?");
        banco_solucoes.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        banco_solucoes.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        banco_solucoes.put("windows", "Este é um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        banco_solucoes.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        banco_solucoes.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\n e comparou todas as características do nosso software com outras ofertas de mercado?");
        banco_solucoes.put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\n que farão todo o trabalho para você. Você já leu as instruções\n de instalação?");
        banco_solucoes.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\n a memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?");
        banco_solucoes.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?");
        banco_solucoes.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
        banco_solucoes.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
    }
    
    private void preencherRespostaPadrao(){
        resposta_padrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        resposta_padrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
        resposta_padrao.add("Isso parece interessante. Diga-me mais a respeito...");
        resposta_padrao.add("Preciso de maiores informações a respeito.");
        resposta_padrao.add("Você já verificou se existe algum conflito de DLL?");
        resposta_padrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        resposta_padrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?");
        resposta_padrao.add("Isso não é um problema, é apenas uma característica do software!");
        resposta_padrao.add("Você poderia explicar melhor?");
    }
    
    public String buscarSolucao(String palavra_chave){
        banco_solucoes.get(palavra_chave);
        
        if(banco_solucoes.containsKey(palavra_chave)){
            return palavra_chave;
        }
        
        else{
            return buscarSolucaoPadrao();
        }
    }
    
    private String buscarSolucaoPadrao(){
        int posicao = gerador.nextInt(resposta_padrao.size());
        return resposta_padrao.get(posicao);
    }
    
}
