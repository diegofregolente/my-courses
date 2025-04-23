package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatTextToDateTime {
    public static void main(String[] args) {

        // instanciando
        LocalDate parseDate = LocalDate.parse("2025-04-23");
        LocalDateTime parseDateTime = LocalDateTime.parse("2025-04-23T11:04:00");
        Instant parseDateTimeGlobal = Instant.parse("2025-04-23T11:04:00Z");

        // Exemplos de uso format (resultado é o mesmo) só DATA
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data: " + parseDate.format(formatoData));
        System.out.println("Data: " + formatoData.format(parseDate));
        System.out.println("Data: " + parseDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();

        // Exemplos de uso format com DATETIME
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("DATA E HORA: " + parseDateTime.format(formatoDataHora));
        System.out.println("DATA: " + parseDateTime.format(formatoData));
        System.out.println();

        // Exemplos de uso format com INSANT(GLOBAL DATETIME)
        DateTimeFormatter formatoDataHoraTimeZ = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatoDataHoraTimeZ2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("Data Global (TimeZone): " + formatoDataHoraTimeZ.format(parseDateTimeGlobal));
        System.out.println("Data Global (TimeZone): " + formatoDataHoraTimeZ2.format(parseDateTimeGlobal));
        System.out.println();

        // Exemplo de modelo pronto de time zone
        DateTimeFormatter formatoPronto = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatoPronto2 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(formatoPronto.format(parseDateTime));
        System.out.println(formatoPronto2.format(parseDateTimeGlobal));
    }
}
