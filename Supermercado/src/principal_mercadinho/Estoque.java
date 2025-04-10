package principal_mercadinho;

public class Estoque {
    
    private ItemProduto[] estante;
    
    public Estoque(int tamanho){
        estante = new ItemProduto[150];
    }
    
    public boolean adicionarItemProduto(ItemProduto item){
        for(int i=0; i<estante.length; i++){
            if(estante[i]==null){
                estante[i] = item;
                return true;
            }
        }
        return false;
    }
    
    public String listarProdutos(){
        String retorno = "";
        
        for(int i=0; i<estante.length; i++){
            if (estante[i] != null){
                retorno += estante[i].getProduto().getCodigo() + " - " + estante[i].getProduto().getDescricao() + "\n";
            }
        }
        return retorno;
    }
    
}
