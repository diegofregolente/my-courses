import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoGlobalLocal {
    public static void main(String[] args) {


        // Instanciando
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // pegando a zona padrão do sistema
        LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println(r1);

        // pegando uma zona padrão do localdatetime checar documentação
        LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println(r2);

        //pegando dados isolados
        System.out.println(d04.getDayOfMonth());
        System.out.println(d04.getMonthValue());
        System.out.println(d04.getYear());

        System.out.println(d05.getHour());
        System.out.println(d05.getMinute());
        System.out.println(d05.getSecond());

    }
}
