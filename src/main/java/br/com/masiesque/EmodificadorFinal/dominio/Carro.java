package br.com.masiesque.EmodificadorFinal.dominio;

public class Carro {
    public static final double VELOCIDADE_LIMIT = 250;
    /// static final == cosnt -> vc cria uma variável constante em que o valor nao pode ser alterado em tempo de execução;
    private String name;
    public final Comprador COMPRADOR = new Comprador();


    //getter e setter

    public Comprador getComprador() {
        return COMPRADOR;
    }
        //aqui o inteliJ NAO CRIOU um metodo setter, pq o nosso atributo-objeto comprador é final(const/imutável) e assim
        // como qualquer objeto é instanciado por referencia de ponteiros e aloca na memória, nao podemos mudar sua referencia
        // com o metodo setter(que seria oq ele faria neste), LEMBRANDO que é porque o atributo-objeto é final.

    //getter e setter

//getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//getter e setter
}

//IMPORTANTE -> Em geral os atributos de tipos primitivos(int, String, Integer etc) ficam alocados na stack mesmo
//Enquanto que os objetos(os quais são alocados dinâmicamente, tipo em C só que de maneita implícita) ficam alocados na
//heap para serem usadas durante  o processo inteiro.