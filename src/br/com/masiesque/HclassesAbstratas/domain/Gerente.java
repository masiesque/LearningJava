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

    @Override
    public double calcularBonus() {
        return this.wage = this.wage+ this.wage  * 0.5;
    }
}

