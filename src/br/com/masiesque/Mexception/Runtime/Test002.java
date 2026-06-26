package br.com.masiesque.Mexception.Runtime;

public class Test002 {
    public static void main(String[] args) {
        divisao(10,0);
    }

    private static int divisao(int a, int b)
    {
    try{return a/b;
    }catch(RuntimeException e)//apesar de ser uma ArithmeticException ela herda do RuntimeException, e pelo polimorfismo podemos
    // usar metodos que tbm são da superclasse
    {
        e.printStackTrace();
    }
        return 0;
    }


}


//quando for uma RuntimeException vc não precisa fazer o tratamento da exceção;
//no exemplo acima nós iremos fazer o tratamento apenas por conveniencia