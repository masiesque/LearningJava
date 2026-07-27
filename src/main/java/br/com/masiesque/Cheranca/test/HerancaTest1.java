package br.com.masiesque.Cheranca.test;

import br.com.masiesque.Cheranca.dominio.Address;
import br.com.masiesque.Cheranca.dominio.Employee;
import br.com.masiesque.Cheranca.dominio.Pessoa;

public class HerancaTest1 {

    public static void main(String[] args) {
        Address endereco1 = new Address();
        endereco1.setStreet("Rua do Limoeiro\n");
        endereco1.setNumberOfBuilding(6969);
        Pessoa person01 = new Pessoa("Breno");
        person01.setCpf("123.321.213");
        person01.setAddress(endereco1);
       person01.printPerson();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        Employee funcionario01 = new Employee("Joazinho");
        funcionario01.setEarn(1000.00);
        funcionario01.setCpf("1230.1516");
        funcionario01.setAddress(endereco1);
        funcionario01.printPerson();


    }
}