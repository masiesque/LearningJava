package br.com.masiesque.HclassesAbstratas.test;

import br.com.masiesque.HclassesAbstratas.domain.Dev;
import br.com.masiesque.HclassesAbstratas.domain.Funcionario;
import br.com.masiesque.HclassesAbstratas.domain.Gerente;

public class FuncionarioTest001 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 12000.00);
        System.out.println(gerente);
        Dev desenvolvedor = new Dev("Zoro",30000.00);
        System.out.println(desenvolvedor);


    }
}
