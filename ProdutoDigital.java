public class ProdutoDigital extends Produto {
    private int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);

    }

    public int getTamanhoArquivo() {
        return this.tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double calcularTotal() {
        return super.getPreco() * super.getQuantidade();
    }

}
