package br.com.masiesque.Mexception.Exception.domain;
import java.lang.Exception;

public class LogininvalidoExcepiton extends Exception{// estamos extendendo da classe Exception, que é checked;

    public LogininvalidoExcepiton() {
        super("Dados do login inválidos.");
        //estamos usando o polimorfismo da super classe/ classe mae
        //caso o usuario nao passe nenhuma mensagem como parametro
    }

    public LogininvalidoExcepiton(String message) {
        //estamos usando o polimorfismo da super classe/ classe mae
        //caso o usuário passe alguma mensagem iremos sobrescrever o metodo construtor da classe mae, com a mensagem
        // do usuario.
        super(message);
    }
}
//construtores não são métodos e tbm não são herdados