package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Integer codigo;
    private String nome;
    private String cpf;
    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco) {
        if(endereco == null) {
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        if(endereco.getCep() == null) {
            throw new NullPointerException("CEP não pode ser nulo");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if(enderecos == null) {
            enderecos = new ArrayList<>();
        }
        return enderecos;
    }

}