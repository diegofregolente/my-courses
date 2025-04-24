package application;

public class ISO8601 {
    public static void main(String[] args) {

        System.out.printf("PADRÃO ISO 8601 \n" +
                "Data-[HORA] Local: \n" +
                "Data: 2022-07-21 \n" +
                "DataHora: 2022-07-21T14:52 \n" +
                "DataHoraSegundos: 2022-07-22T14:52:09 \n" +
                "DataHoraSegundosMilliseconds: 2022-07-22T14:52:09.4073 \n");

        System.out.printf("Data-hora global: \n"+
                "DataHoraSegundosTimeZone: 2022-07-23T14:52:09Z \n" +
                "DataHoraSegundosMillisecondsTimeZone: 2022-07-23T14:52:09.254935Z \n" +
                "DataHoraSegundosMillisecondsUTC-3: 2022-07-23T14:52:09-03:00 \n"
                );
    }
}
