package br.com.masiesque.Iinterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemove{
    @Override
    public void loading() {
        System.out.println("getting load dataBase...\n");
    }

    @Override
    public void removing() {
        System.out.println("Getting remove data from dataBase\n");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do BD");
    }
}
