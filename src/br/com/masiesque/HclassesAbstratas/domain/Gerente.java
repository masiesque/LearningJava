package br.com.masiesque.HclassesAbstratas.domain;

public class Gerente extends Funcionario {


    public Gerente(String name, double wage) {
        super(name, wage);
    }

    @Override
    public String toString() {
        return "Nome: {"+"'"+name+"'"+","+"\n"+
                "Salário : "+wage+"}";
    }
}

