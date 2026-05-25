package br.com.masiesque.Genumeracoes.domain;

public enum TypeClient {
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    private final int  valor;
    private final String nomeRelatorio;

    public static TypeClient typeClientByPapeline(String relatorio){
        for(TypeClient clienteX : values())
        {
            if(clienteX.getNomeRelatorio().equals(relatorio))
                return clienteX;
        }
        return null;
    }
         TypeClient(int valor,String nomeRelatorio)//ele é implicitamente private, A JVM deixa ele como private por padrão
        {
            this.valor = valor;
            this.nomeRelatorio = nomeRelatorio;
        }

        public int getValor()
        {
            return this.valor;
        }

        public String getNomeRelatorio()
        {
            return this.nomeRelatorio;
        }

}

//obs: -O modificador Static-> faz com que o atributo seja da classe e nao do objeto. Ou seja, quando eu crio (private static int contador = 10)
// e faço(Pessoa pessoa1 = new Pessoa) (Pessoa pessoa2 = new Pessoa) -> pessoa1.contador = 10, para o pessoa2 tbm será 10, eles compartilham o mesmo atributo.
//System.out.println(pessoa2.contador) -> 10
// - O modificador final -> ele torna o atributo imutável após vc declarar ele-> ou seja. private final int number = 5. Você não poderá alterar esse valor em tempo de execução
//seja com o setter ou qualquer outra coisa

//estamos criando atributos do tipo da classe TypeClient. Eles são finals e do tipo TypeClient