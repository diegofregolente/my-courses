import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoComDataHora {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.parse("2024-04-22T11:32");
        Instant d03 = Instant.now();

        // adicionando/removendo 7 dias
        LocalDate pastWeek = d01.minusDays(7);
        System.out.println(pastWeek);
        LocalDate nextWeek = d01.plusDays(7);
        System.out.println(nextWeek);

        // adicionando/removendo 3 horas
        LocalDateTime threeHoursLater = d02.plusHours(3);
        LocalDateTime threeHoursEarlier = d02.minusHours(3);
        System.out.println(threeHoursEarlier);
        System.out.println(threeHoursLater);

        // truncando as horas e zerando minutos/segundos
        Instant testInstant = d03.truncatedTo(ChronoUnit.HOURS);
        System.out.println(testInstant);

        // adicionando/removendo 7 dias em instant.
        Instant testInstant1 = d03.minus(7, ChronoUnit.DAYS);
        Instant testInstant2 = d03.plus(7, ChronoUnit.DAYS);
        System.out.println(testInstant1);
        System.out.println(testInstant2);

        // pegando a diferença de horas
        Duration t1 = Duration.between(threeHoursLater, d02);
        System.out.println(t1.toHours());

        // pegando a diff com datetime
        Duration t2 = Duration.between(pastWeek.atStartOfDay(), d01.atStartOfDay());
        System.out.println(t2.toDays());

        // pegando a diff com instant
        Duration t3 = Duration.between(testInstant1, d03);
        System.out.println(t3.toDays());

   }
}
