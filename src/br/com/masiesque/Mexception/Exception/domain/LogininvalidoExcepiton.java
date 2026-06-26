package br.com.masiesque.Mexception.Exception.domain;
import java.lang.Exception;

public class LogininvalidoExcepiton extends Exception{// estamos extendendo da classe Exception, que é checked;

    public LogininvalidoExcepiton() {
        // Chama o construtor da superclasse Exception que recebe uma mensagem.
        // Será utilizada uma mensagem padrão quando nenhuma for informada.
        super("Dados do login inválidos.");

    }

    public LogininvalidoExcepiton(String message) {
        // Chama o construtor da superclasse Exception passando a mensagem
        // recebida, permitindo personalizar a descrição da exceção.
        super(message);
    }
}
//construtores não são métodos e tbm não são herdados. Até pq os construtores são usados ara bildar um objeto
// especifico da classe que os chama, por isso não pode ser herdado na hora de instanciar um objeto de uma subclasse.
// Mas pode ser chamado com o "super" sempre que quiser na hora de biuldar uma subclasse.