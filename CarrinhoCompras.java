import java.util.ArrayList;

public class CarrinhoCompras {
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private double valorTotal;

    public CarrinhoCompras(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
        this.valorTotal = 0;
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public boolean adicionarProduto(Produto produto) {
        if (this.cliente.getLimite() > this.produtos.size()) {
            this.produtos.add(produto);
            return true;
        }
        return false;
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public double calcularTotalCompra() {
        this.valorTotal = 0;
        for(Produto produto : this.produtos){
            this.valorTotal += produto.calcularTotal();
        }
        return this.valorTotal;
    }

}