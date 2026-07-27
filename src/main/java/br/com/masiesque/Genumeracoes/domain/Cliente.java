package br.com.masiesque.Genumeracoes.domain;

public class Cliente {


    private String name;
    private TypeClient type;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "name:{"+"'"+name+"'"+
                "\ntipo:"+type+
                "\ntipoInt: "+type.getValor()+"}"+
                "\ntipoPagamento: "+ tipoPagamento+"}\n";
    }//podemos usar o toString para printar os nossos atributos, pq o metodo toString está dentro da nossa classe.E uma
    //classe tem acesso direto aos seus atributos privates.


    //construtor

    public Cliente(String name, TypeClient type,TipoPagamento tipoPagamento ){
        this.name = name;
        this.type = type;
        this.tipoPagamento = tipoPagamento;
    }
    //construtor




}
