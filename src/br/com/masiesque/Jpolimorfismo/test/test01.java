package br.com.masiesque.Jpolimorfismo.test;

import br.com.masiesque.Jpolimorfismo.domain.Computador;
import br.com.masiesque.Jpolimorfismo.domain.Monitor;
import org.w3c.dom.ls.LSOutput;
import br.com.masiesque.Jpolimorfismo.service.CalculadoraImposto;

public class test01 {

    public static void main(String[] args) {
        Computador comp1 = new Computador("macAir15", 18000.0);
        Monitor mon1 = new Monitor("AlienWare",10000.0);


        System.out.println(comp1);
        CalculadoraImposto.impostoComp(comp1);
        System.out.println("-------------------");
        System.out.println(mon1);
        CalculadoraImposto.impostoMonitor(mon1);


    }

}
