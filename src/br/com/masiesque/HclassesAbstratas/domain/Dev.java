package br.com.masiesque.HclassesAbstratas.domain;

public class Dev extends Funcionario{
    public Dev(String name, double wage) {
        super(name, wage);
    }

    public String toString() {
        return "Nome: {"+"'"+name+"'"+","+"\n"+
                "Salário : "+wage+"}";
    }
}


