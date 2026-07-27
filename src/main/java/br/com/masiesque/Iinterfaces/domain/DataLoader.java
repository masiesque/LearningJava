package br.com.masiesque.Iinterfaces.domain;

public interface    DataLoader {

    public abstract  void loading();

    default void checkPermission()
    {
        System.out.println("Fazendo checagem de permissões\n");
    }

    public static void retrieveMaxDataSize()
    {
        System.out.println("recuperando tamanho de dados");// esse por ser static, pertence apenas a classe
    }
}


//Interfaces são como contratos, que podem ser "herdados" ou melhor implementados, mais de 1 por classe. Eles possuem métodos por padrão public abstract
//para tornar os metodos dentro da classe com algum comportamente e codar no corpo dele, basta colocar o modificador de acesso "default".
//ordem crescente de liberdade dentro dos modificadores de acesso: private-> default -> protected -> public

