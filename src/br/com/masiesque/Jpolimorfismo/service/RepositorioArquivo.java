package br.com.masiesque.Jpolimorfismo.service;

import br.com.masiesque.Jpolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo....");
    }
}
