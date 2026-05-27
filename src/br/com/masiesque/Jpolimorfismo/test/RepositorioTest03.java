package br.com.masiesque.Jpolimorfismo.test;

import br.com.masiesque.Jpolimorfismo.repositorio.Repositorio;
import br.com.masiesque.Jpolimorfismo.service.RepositorioArquivo;
import br.com.masiesque.Jpolimorfismo.service.RepositorioBD;

public class RepositorioTest03 {
    public static void main(String[] args) {
        Repositorio repo = new RepositorioBD();
        repo.salvar();
    }
}
