package poo.model;

public class Endereco {

    public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}

    private String endereco;
    private String numero;
    private String complemento;
    private String cidade;
    private String bairro;
    private String estado;
    private String cep;

    public Endereco() {
    }

    public Endereco(String endereco) {
        this.endereco = endereco;
    }

    public Endereco(String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep) {
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
    }

    private String getEndereco() {
        return endereco;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    private String getComplemento() {
        return complemento;
    }

    private void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    private String getCidade() {
        return cidade;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String getBairro() {
        return bairro;
    }

    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    protected String getCep() {
        return cep;
    }

    protected void setCep(String cep) {
        this.cep = cep;
    }
}
