package br.com.masiesque.Iinterfaces.domain;

public interface DataLoader {

    public abstract  void loading();

    default void checkPermission()
    {
        System.out.println("Fazendo checagem de permissões\n");
    }

}
