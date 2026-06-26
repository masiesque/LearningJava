package br.com.masiesque.NdatasElocales.testes;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

public class Exerc1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
         String name = scanner.nextLine();
        System.out.println("Digite sua data de nascimento, no formato->(dd/MM/yyyy):");
        String datebirth = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//criamos um formatador de data, para o estilo brasileiro

        try {
            LocalDate dataNascimento = LocalDate.parse(datebirth,formatter);//transformamos a String em um LocalDate


            //pegamos a data atual:
            LocalDate today = LocalDate.now();
            String dateTodayFormater = today.format(formatter);
            System.out.println("Data de hoje: "+ dateTodayFormater);

            //realizamos a conta para saber se a pessoa é maior ou menor de idade(x>18||18>x):

            LocalDate maioridade = dataNascimento.plusYears(18);

            if(maioridade.isBefore(today)|| maioridade.isEqual(today))
                System.out.println("\nOlá "+name+", você é maior de idade!!");
            else
                System.out.println("\nOlá "+name+", você menor de idade!!");

        }catch(DateTimeParseException e)
        {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }

    }





}


//-----------------------------------------PERGUNTAS--------------------------------------------------//
//pq nao precisamos instanciar para criar um formatador, ele é um obj, ou um tipo de variável ou objeto?
// RESPOSTA -> o java instancia para vc por de baixo dos panos, criando um onjeot do tipo LocalDate

//pq eu nao posso usar o this.name ?
// RESPOSTA-> pq o metodo é static, e ele é iniciado antes da classe, ent n faz muito sentido.

// perguntar se eu nao posso fechar o scanner usando alguma classe que implements closeable
//-----------------------------------------PERGUNTAS--------------------------------------------------//
