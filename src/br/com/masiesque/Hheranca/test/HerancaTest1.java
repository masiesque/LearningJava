package br.com.masiesque.Hheranca.test;

import br.com.masiesque.Hheranca.dominio.Address;
import br.com.masiesque.Hheranca.dominio.Employee;
import br.com.masiesque.Hheranca.dominio.Pessoa;

public class HerancaTest1 {

    public static void main(String[] args) {
        Address endereco1 = new Address();
        endereco1.setStreet("Rua do Limoeiro");
        endereco1.setNumberOfBuilding(6969);
        Pessoa person01 = new Pessoa();
        person01.setCpf("123.321.213");
        person01.setAddress(endereco1);
        person01.setName("Breno");
        person01.printPerson();
        Employee funcionario01 = new Employee();
        funcionario01.setEarn(1000.00);



    }
}