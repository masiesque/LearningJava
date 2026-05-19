package br.com.masiesque.EblocosDeInicializacao1.domain;

//ORDEM DE EXECUÇÃO:
//1-Alocação na memoria, para o objeto da classe;
//2- Os atributos são criados e alocados;
//3-Bloco de inicialização é chamado;
//4-Construtores são chamados;

public class Anime{
    private String name;
    private int[] ep;

//-bloco de inicialização-(serve para padronizarmos, alguma coisa(como metodos ou declarações de variaveis primitivas)
// antes de compilarmos diferentes construtores.
{
    System.out.println("\nBloco de inicialização:\n");
    ep = new int[100];
    for(int i=0; i<ep.length; i++)
    {
        ep[i] = i+1;
    }
}
//-construtores:-

    //sem parametro;
    public Anime()
    {

        for(int epsodios:ep)
        {
            System.out.println(epsodios + "");
        }

    }
    //com parametro:
    public Anime(String name)
    {
        this.name = name;

    }



    //-getters e setters:-

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEp() {
        return ep;
    }

    public void setEp(int[] ep) {
        this.ep = ep;
    }
}