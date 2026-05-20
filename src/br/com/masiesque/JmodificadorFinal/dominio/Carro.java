package br.com.masiesque.JmodificadorFinal.dominio;

public class Carro {
    public static final double VELOCIDADE_LIMIT =250;///static final == cosnt -> vc cria uma variável constante em que o valor nao pode ser alterado em tempo de execução;
    private String name;

//getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//getter e setter
}
