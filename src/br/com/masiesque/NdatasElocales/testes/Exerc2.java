import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exerc2 {
    public static void main(String[] args) {
        // 1. Criamos a data e hora local da reunião (sem fuso horário ainda)
        // 10 de Outubro de 2026 às 14:00
        LocalDateTime dataHoraLocal = LocalDateTime.of(2026, 10, 10, 14, 0);

        // 2. Definimos o fuso horário de Brasília (São Paulo)
        ZoneId fusoBrasil = ZoneId.of("America/Sao_Paulo");

        // 3. Juntamos a data/hora com o fuso horário para criar o momento exato no planeta
        ZonedDateTime reuniaoBrasil = ZonedDateTime.of(dataHoraLocal, fusoBrasil);

        // 4. Criamos os formatadores para exibir a resposta de forma elegante
        Locale localeBr = new Locale("pt", "BR");
        DateTimeFormatter formatoCompleto = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy 'às' HH:mm (z)", localeBr);

        System.out.println("--- HORÁRIOS DA REUNIÃO ---");
        System.out.println("Brasil (Sede): " + reuniaoBrasil.format(formatoCompleto));

        // 5. O MACETE: Converter para os outros fusos usando .withZoneSameInstant()
        // Esse método calcula exatamente que horas serão naquele local no MESMO INSTANTE.

        // Conversão para Portugal
        ZoneId fusoPortugal = ZoneId.of("Europe/Lisbon");
        ZonedDateTime reuniaoPortugal = reuniaoBrasil.withZoneSameInstant(fusoPortugal);
        System.out.println("Portugal:      " + reuniaoPortugal.format(formatoCompleto));

        // Conversão para o Japão
        ZoneId fusoJapao = ZoneId.of("Asia/Tokyo");
        ZonedDateTime reuniaoJapao = reuniaoBrasil.withZoneSameInstant(fusoJapao);
        System.out.println("Japão:         " + reuniaoJapao.format(formatoCompleto));
    }
}


//========================PERGUNTAS===============================
//pq o locale tivemos que instanciar ele, e os outros objetos não?

//========================PERGUNTAS===============================
