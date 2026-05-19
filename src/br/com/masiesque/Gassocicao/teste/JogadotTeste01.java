package br.com.masiesque.Gassocicao.teste;

import br.com.masiesque.Gassocicao.domain.Jogador;
import br.com.masiesque.Gassocicao.domain.Time;

public class JogadotTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jordan");
        Jogador jogador2 = new Jogador("James Harden");
        Jogador jogador3 = new Jogador("Curry");

        Jogador[] playersAllTime = new Jogador[]{jogador1 ,jogador2,jogador3};
        for (Jogador jogador : playersAllTime) {

            jogador.printPlayer();
        }


    }
}
