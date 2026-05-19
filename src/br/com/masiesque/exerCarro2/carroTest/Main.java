package br.com.masiesque.exerCarro2.carroTest;
import br.com.masiesque.exerCarro2.domain.Carros;

public class Main {
    public static void main(String[] args) {
        Carros c1 = new Carros("Lancer",4,1980);
        Carros c2 = new Carros("C4",1,2003);

       c1.showConfig();
       c2.showConfig();

        }
    }
