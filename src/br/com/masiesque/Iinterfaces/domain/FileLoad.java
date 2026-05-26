package br.com.masiesque.Iinterfaces.domain;

public class FileLoad implements DataLoader, DataRemove{

    @Override
    public void loading() {
        System.out.println("Loading data from file...\n");
    }

    @Override
    public void removing() {
        System.out.println("Getting remove data from file\n");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do arquivo");
    }
}
