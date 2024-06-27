public class Produto {

    private String codigo;
    private String descricao;
    private double precoDeCompra;
    private double precoDeVenda;
    private String statusDoProduto;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setPrecoDeCompra(double precoDeCompra){
        this.precoDeCompra = precoDeCompra;
    }
    public double getPrecoDeCompra() {
        return this.precoDeCompra;
    }
    public void setPrecoDeVenda(double precoDeVenda){
        this.precoDeVenda = precoDeVenda;
    }
    public double getPrecoDeVenda() {
        return this.precoDeVenda;
    }
    public void setStatusDoProduto(String statusDoProduto){
        this.statusDoProduto = statusDoProduto;
    }
    public String getStatusDoProduto() {
        return this.statusDoProduto;
    }



}

