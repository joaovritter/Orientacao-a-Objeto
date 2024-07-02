package TrabalhoFinal;

public class Produto {
    private int codigo;
    private String descricao;
    private double precoCusto;
    private double precoVenda;
    private int estoque;

    public Produto(int codigo, String descricao, double precoCusto, double precoVenda, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
