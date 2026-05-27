package br.com.masiesque.Jpolimorfismo.service;

import br.com.masiesque.Jpolimorfismo.repositorio.Repositorio;

public class RepositorioBD implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados......");
    }
}
