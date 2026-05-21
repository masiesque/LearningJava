package br.com.masiesque.Bassocicao.teste;

import br.com.masiesque.Bassocicao.domain.Jogador;
import br.com.masiesque.Bassocicao.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Luka Doncic");//instancia um jogador;
        Time time = new Time("Lakers");//instancia um time;
        jogador1.setName(time);//fazemos o jogador receber o time criado a partir de
        // um metodo setter
        jogador1.printPlayer();//printamos o jogador;

    }
}
