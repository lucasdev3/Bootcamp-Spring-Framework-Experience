package poo;

import poo.model.Cliente;
import poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();


        Cliente cliente = new Cliente();

        cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso!");

    }

}
