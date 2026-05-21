package br.com.masiesque.Bassocicao.teste;

import br.com.masiesque.Bassocicao.domain.Jogador;
import br.com.masiesque.Bassocicao.domain.Time;

public class TimeTeste01
{
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("kobe Bryant");
        Jogador jogador2 = new Jogador("Luka Doncic");
        Jogador jogador3 = new Jogador("Carmelho Anthony");
        Jogador[] jogadores = {jogador1,jogador2, jogador3};
        Time club = new Time("Dream Team",jogadores);
        club.imprimir();

    }

}
