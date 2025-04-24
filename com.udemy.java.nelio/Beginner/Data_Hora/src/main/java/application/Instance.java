package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Instance {
    public static void main(String[] args) {
        // instanciando AGORA > DATA HORA
        LocalDate dateAgora = LocalDate.now();  // static
        LocalDateTime dateTimeAgora = LocalDateTime.now(); // static
        Instant dateTimeGlobal = Instant.now();

        // instanciando TEXTO ISO 8601 > DATA HORA
        LocalDate stringDataHora = LocalDate.parse("2025-04-23");
        LocalDateTime stringDataHoraISO = LocalDateTime.parse("2025-04-23T10:36:00");
        Instant stringDataHoraGlobal = Instant.parse("2025-04-23T10:37:00Z");
        Instant stringDataHoraTimeZone = Instant.parse("2025-04-23T10:37:00-03:00");

        // mostrando na tela
        System.out.println("Data agora: " + dateAgora);
        System.out.println("Data com horário agora: " + dateTimeAgora);
        System.out.println("Data com timezone UMT (z) com horário: " + dateTimeGlobal);
        System.out.println();
        System.out.println("DataHora com formato ISO: " + stringDataHoraISO);
        System.out.println("DataHora Global com formato ISO: " + stringDataHoraGlobal);
        System.out.println("DataHora Global com formato ISO: " + stringDataHoraTimeZone);
        System.out.println("Pegando int de um LocalDate (Mês): " + stringDataHora.getMonthValue());
        System.out.println("Pegando int de um LocalDate (Ano): " + stringDataHora.getYear());
        System.out.println("Pegando int de um LocalDate (Day/mês): " + stringDataHora.getDayOfMonth());
        System.out.println("Pegando int de um LocalDate (Day): " + stringDataHora.getDayOfWeek());
        System.out.println("Pegando int de um LocalDate (Day): " + stringDataHora.getDayOfYear());
        System.out.println();
        System.out.println("Pegando o inicio de um LocalDate: " + dateAgora.atStartOfDay());
        System.out.println("Pegando o horário de um timezone especifico: " + dateTimeAgora.atZone(ZoneId.of("America/Sao_Paulo")));
        System.out.println();

        // instanciando TEXTO FORMATO CUSTOMIZADO > DATA
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse("20/07/2022", formatador);
        System.out.println("Instanciando um texto customizado e atribuindo variavel data: " + dataFormatada);

        // instanciando TEXTO FORMATADO CUSTOMIZADO > DATA E HORA
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraFormatada = LocalDateTime.parse("23/04/2025 10:50", formatadorHora);
        System.out.println("Instanciando um texto formatado e atribuindo a uma variavel data: " + dataHoraFormatada);

        // juntando atribuição de variavel com datetime (util para input user (scanner)
        LocalDateTime dateTimeFormatted = LocalDateTime.parse("22/04/2025 10:50", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Instanciando um  texto com datetimeformatter dentro do argumento: " + dateTimeFormatted);
        System.out.println();

        // como instanciar data com números isolados
        LocalDateTime dataHoraIsolados = LocalDateTime.of(2025, 04, 23, 11, 00);
        System.out.println("Definindo separadamente valores de uma data: " + dataHoraIsolados);
        System.out.println();
    }
}
