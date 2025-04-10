package principal_mercadinho;

public class Produto {
    private String descricao;
    private int codigo;
    private double preco;

    public Produto(String descricao, int codigo, double preco) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.toUpperCase();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
