package br.com.masiesque.Mexception.Exception.teste;

import br.com.masiesque.Mexception.Exception.domain.LogininvalidoExcepiton;

import java.util.Scanner;

public class ExcepCustom {

    public static void main(String[] args) {
        try{
            login();
        }catch(LogininvalidoExcepiton e)
        {
            e.printStackTrace();
        }
    }


    private static void login() throws LogininvalidoExcepiton {
        Scanner leitor = new Scanner(System.in);
        String usernameDB = "Breno";
        String passwordDB = "m123";
        System.out.println("Digite usuario:");
        String usernameDigitado = leitor.nextLine();
        System.out.println("Digite a senha:");
        String passwordDigitada = leitor.nextLine();

        //validação:
        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitada))
            throw new LogininvalidoExcepiton("usuário ou senha incorretos");
        else
            System.out.println("Login feito com sucesso");
    }

}