public class ClientePessoaJuridica extends Cliente {
    private String cnpj;
    private String representante;

    public ClientePessoaJuridica(String nome, String telefone, String endereco, String cnpj, String representante) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRepresentante() {
        return this.representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

}
