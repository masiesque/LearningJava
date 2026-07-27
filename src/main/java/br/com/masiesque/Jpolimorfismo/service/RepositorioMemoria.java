package br.com.masiesque.Jpolimorfismo.service;

import br.com.masiesque.Jpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memória......");
    }
}
