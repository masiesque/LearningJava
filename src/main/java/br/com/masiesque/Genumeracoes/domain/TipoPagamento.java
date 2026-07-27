package br.com.masiesque.Genumeracoes.domain;

public enum TipoPagamento {
        DEBITO{
            public double calcularDesconto(int valor)
            {
                return valor * 0.1;
            }
        },

        CREDITO{
            public double calcularDesconto(int valor)
            {return valor* 0.05;
            }

        };



    public abstract double calcularDesconto(int valor);

}
