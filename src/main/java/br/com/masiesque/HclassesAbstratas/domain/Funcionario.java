package br.com.masiesque.HclassesAbstratas.domain;

public abstract class  Funcionario {
protected   String name;
protected double wage;

    public Funcionario(String name, double wage) {
        this.name = name;
        this.wage = wage;
        calcularBonus();
    }

    public abstract double calcularBonus();
}
