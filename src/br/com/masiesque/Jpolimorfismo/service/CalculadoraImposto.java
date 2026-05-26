package br.com.masiesque.Jpolimorfismo.service;
import br.com.masiesque.Jpolimorfismo.domain.Computador;
import br.com.masiesque.Jpolimorfismo.domain.Monitor;

public class CalculadoraImposto {

    public static void impostoComp(Computador pc)
    {
        double imposto = pc.calcularImposto();
        System.out.println("Imposto do "+pc.getName()+": "+imposto) ;
    }

    public static void impostoMonitor(Monitor monitor)
    {
        double imposto = monitor.calcularImposto();
        System.out.println("Imposto do "+monitor.getName()+": "+imposto);
    }

}
