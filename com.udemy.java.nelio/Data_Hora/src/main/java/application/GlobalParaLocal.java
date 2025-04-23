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

        LocalDate dataGlobalTime = LocalDate.ofInstant(dataGlobal, ZoneId.systemDefault());
        System.out.println(dataGlobalTime);

    }
}
