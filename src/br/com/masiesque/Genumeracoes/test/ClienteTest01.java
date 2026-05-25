package br.com.masiesque.Genumeracoes.test;

import br.com.masiesque.Genumeracoes.domain.Cliente;
import br.com.masiesque.Genumeracoes.domain.TipoPagamento;
import br.com.masiesque.Genumeracoes.domain.TypeClient;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("User1", TypeClient.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("User2",TypeClient.PESSOA_JURIDICA,TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("User3", TypeClient.PESSOA_FISICA,TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("User4",TypeClient.PESSOA_JURIDICA,TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        //TypeClient clienteNovo = TypeClient.typeClientByPapeline("Pessoa Físi32a");retornando NULL
        TypeClient clienteNovo = TypeClient.typeClientByPapeline("Pessoa Física"); //retornando o tipo de cliente
        System.out.println(clienteNovo);
    }
}
