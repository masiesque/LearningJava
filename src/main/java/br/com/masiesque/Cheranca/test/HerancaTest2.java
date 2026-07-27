package br.com.masiesque.Cheranca.test;

import br.com.masiesque.Cheranca.dominio.Employee;

public class HerancaTest2 {
    //0-Bloco de inicializçõ estático da super classe é executado quando a JVM carregar a classe pai
    //1-Bloco de inicializçõ estático da sub classe é executado quando a JVM carregar a subclasse
    //2-Alocando espaço em memória pro objeto da classe pai
    //3-Cada atributo de classe pai é criado e inicializado com valores defalt ou que for passado da classe pai
    //4-Bloco de inicialização da superclasse é executado na ordem em que aparece
    //5- Construtor da superclasse é executado

    //6-Alocando espaço em memória pro objeto da subclasse
    //7-Cada atributo de subclasse é criado e inicializado com valores defalt ou que for passado da subclasse
    //8-Bloco de inicialização da subclasse é executado na ordem em que aparece
    //9- Construtor da subclasse é executado
    public static void main(String[] args) {
        Employee funcionarioT = new Employee("bilubilu");

    }
}
