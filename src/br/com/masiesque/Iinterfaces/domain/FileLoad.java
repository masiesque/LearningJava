package br.com.masiesque.Iinterfaces.domain;

public class FileLoad implements DataLoader{

    @Override
    public void loading() {
        System.out.println("Laoding files..");
    }
}
