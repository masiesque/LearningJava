package br.com.masiesque.HclassesAbstratas.domain;

public class Dev extends Funcionario{
    public Dev(String name, double wage) {
        super(name, wage);
    }

    public String toString() {
        return "Nome: {"+"'"+name+"'"+","+"\n"+
                "Salário : "+wage+"}";
    }

    @Override
    public double calcularBonus()
    {
       return this.wage = this.wage+ this.wage *0.6;
    }
}


