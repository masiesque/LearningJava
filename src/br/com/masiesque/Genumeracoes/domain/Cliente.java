package br.com.masiesque.Genumeracoes.domain;

public class Cliente {
    private String name;
    private TypeClient type;

    @Override
    public String toString() {
        return "name:{"+"'"+name+"'"+
                "tipo:"+type+"}";
    }


    //construtor

    public Cliente(String name, TypeClient type){
        this.name = name;
        this.type = type;
    }
    //construtor

    //getters e setters
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public TypeClient getType() {
        return type;
    }
    public void setType(TypeClient type)
    {
        this.type = type;
    }

    //getters e setters



}
