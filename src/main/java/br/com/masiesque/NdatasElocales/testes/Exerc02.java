package br.com.masiesque.NdatasElocales.testes;
import java.time.LocalDate;//Representa apenas a data
import java.time.LocalDateTime;//Representa Data, hora
import java.time.LocalTime;//Representa hora
import java.time.ZoneId;//representa fuso-horario
import java.time.ZonedDateTime;//represnta data,hora,fuso-horario
import java.time.format.DateTimeFormatter;//Formata data e hora;
import java.util.Locale;//Representa localização/idioma/cultura

public class Exerc02 {
    public static void main(String[] args) {

        //1 setamos a data e hora:
        LocalDateTime dataHora = LocalDateTime.of(2026,10,10,14,0);

        //2 O ZoneId serve para referenciar um fuso horário especifico
        ZoneId  fusoBrazil = ZoneId.of("America/Sao_Paulo");//usamos sua notação desta maneira ("continente/cidade")

        //3 O ZonedDateTime para setar tanto fuso, quanto data e hora
        ZonedDateTime meetingBrazil = ZonedDateTime.of(dataHora,fusoBrazil);// o uso do .of é uma tendencia do java moderno para instanciar objetos das classes
        //utilitárias, porem o "new", ainda funciona .

        //4 vamos formatar para a data, local e fuso:

        Locale locBr = new Locale("pt","BR");// no caso a versão do java 14, que eu estou usando no tinha o .of para a classe Locale. Por isso instanciei
        //ela normalmente;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy 'às' HH:mm (z)", locBr);

        System.out.println("\n=======================Horários para cada País=======================\n");
        System.out.println("Brasil-São Paulo(sede):  "+ meetingBrazil.format(formatter));

        //setando os demais paises:

        ZoneId fusoPortugal = ZoneId.of("Europe/Lisbon");

        ZonedDateTime meetingPortugal = meetingBrazil.withZoneSameInstant(fusoPortugal);
        System.out.println("Portugal-Lisboa:   "+meetingPortugal);

        ZoneId fusoJapan = ZoneId.of("Asia/Tokyo");
        ZonedDateTime meetingJapan = meetingBrazil.withZoneSameInstant(fusoJapan);
        System.out.println("Japan-Tokyo:   "+meetingJapan);



    }


}
