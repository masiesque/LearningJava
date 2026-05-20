package br.com.masiesque.Hheranca.test;

import br.com.masiesque.Hheranca.dominio.Employee;

public class HerancaTest2 {
    //0-Bloco de inicializçõ estático da super é executado quando a JVM carregar a classe
    //1-Alocando espaço em memória pro objeto
    //2-Cada atributo de classe é criado e inicializado com valores defalt ou que for passado
    //3-Bloco de inicialização é executado
    //4- Construtor é executado
    public static void main(String[] args) {
        Employee funcionarioT = new Employee("bilubilu");

    }
}
