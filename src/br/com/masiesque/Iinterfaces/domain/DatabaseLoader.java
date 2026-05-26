package br.com.masiesque.Iinterfaces.domain;

public class DatabaseLoader implements DataLoader{
    @Override
    public void loading() {
        System.out.println("getting load dataBase...");
    }
}
