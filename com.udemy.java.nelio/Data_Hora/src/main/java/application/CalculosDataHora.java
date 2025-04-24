package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        // Instanciando
        LocalDate dateLocal = LocalDate.parse("2025-04-24");
        LocalDateTime dateTimeLocal = LocalDateTime.parse("2025-04-24T08:59:00");
        Instant dateTimeZone = Instant.parse("2025-04-24T09:00:00Z");

        // Adicionando ao LocalDate
        LocalDate pastWeekDateLocal= dateLocal.minusDays(7);
        LocalDate nextWeekDateLocal= dateLocal.plusDays(7);

        //  Adicionando ao LocalDateTime
        LocalDateTime pastWeekDateTimeLocal = dateTimeLocal.minusDays(7);
        LocalDateTime nextWeekDateTimeLocal = dateTimeLocal.plusDays(7);

        // Adicionando ao Instant
        Instant pastWeekInstant = dateTimeZone.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = dateTimeZone.plus(7, ChronoUnit.DAYS);

        // Calculo de Duração
        Duration differenceTime = Duration.between(pastWeekDateTimeLocal, dateTimeLocal);

        // Calculando Duracao em LocalDate

        Duration differenceTimeLocal = Duration.between(pastWeekDateLocal.atTime(0, 0), dateLocal.atTime(0, 0));
        Duration differenceTimeLocal2 = Duration.between(pastWeekDateLocal.atStartOfDay(), dateLocal.atStartOfDay());


    }
}
