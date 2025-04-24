package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalParaLocal {
    public static void main(String[] args) {

        // Instanciando Datas
        LocalDate dataLocal = LocalDate.parse("2025-04-23");
        LocalDateTime dataTimeLocal = LocalDateTime.parse("2025-04-23T12:12:33");
        Instant dataGlobal = Instant.parse("2025-04-23T12:12:33Z");

        // Convertendo GLOBAL > LOCAL
        LocalDateTime dataGlobalSystemDefault = LocalDateTime.ofInstant(dataGlobal, ZoneId.systemDefault());
        LocalDateTime dataGlobalTimeZonePortugal = LocalDateTime.ofInstant(dataGlobal, ZoneId.of("Portugal"));
        System.out.println(dataGlobalSystemDefault);
        System.out.println(dataGlobalTimeZonePortugal);

        // Pegando dados individuais.

        System.out.println("Dia do Mês: " + dataLocal.getDayOfMonth());
        System.out.println("Dia do Anual: " + dataLocal.getDayOfYear());
        System.out.println("Dia do Semanal(String): " + dataLocal.getDayOfWeek());
        System.out.println("Ano: " + dataLocal.getYear());
        System.out.println("Mês: " + dataLocal.getMonthValue());

    }
}
