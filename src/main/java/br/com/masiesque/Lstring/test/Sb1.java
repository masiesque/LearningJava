package br.com.masiesque.Lstring.test;

public class Sb1 {
    public static void main(String[] args) {
        String nome = "JOJO jojo";
        nome.concat("bilubilu");

        StringBuilder sb = new StringBuilder("JOJO jojo");
        sb.append("bilubilu");
        sb.reverse();
        sb.reverse();
        System.out.println(nome);
        System.out.println(sb);



    }
}
//string não é dinamica, uma vez alocada na memoria não pode ser alterada;
// StringBuilder é dinamica, e funciona com alocação dinamica de memória na heap, por isso pode ser alterada dps de
// declarada, até mesmo em tempo de execução;
