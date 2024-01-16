public class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);

    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * para entregas de ate 2kg, frete 5R$
     * para entregas entre 2kg e 5kg, frete 10R$
     * para entregas acima de 5kg, frete com taxa de 2.5R$ * cada kg excedente
     */
    public double calculaValorFrete() {
        double valorEntrega;
        if (peso < 2) {
            valorEntrega = 5;
        }
        if (peso >= 2 && peso <= 5) {
            valorEntrega = 10;
        } else {
            valorEntrega = 2.5 * peso;
        }
        return valorEntrega;
    }

    @Override
    public double calcularTotal() {
        double valorTotal;
        valorTotal = super.getPreco() * super.getQuantidade();
        return valorTotal + calculaValorFrete();
    }

}
