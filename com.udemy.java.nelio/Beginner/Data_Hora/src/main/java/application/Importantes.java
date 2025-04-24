package application;

public class Importantes {
    public static void main(String[] args) {

        System.out.print("OPERAÇÕES IMPORTANTES COM DATA-HORA \n" +
                "INSTANCIAÇÃO: \n" +
                "NOW -> DATA-HORA \n" +
                "ISO8601 -> DATA-HORA \n" +
                "STRING FORMATADO -> DATA-HORA \n" +
                "DIA, MÊS, ANO, [OPCIONAL HORA] -> DATA-HORA LOCAL \n");

        System.out.print("FORMATAÇÃO \n" +
                "DATA-HORA -> ISO8601 \n" +
                "DATA-HORA -> STRING FORMATADO \n" +
                "PEGAR DATALOCAL E TRANSFORMAR EM dd/MM/yyyy/HH:mm" +
                "DATA-HORA LOCAL -> DIA, MÊS, ANO, HORÁRIO \n" +
                "GLOBAL PARA LOCAL" +
                "DATA-HORA GLOBAL, TIMEZONE (SISTEMA LOCAL) -> DATA-HORA LOCAL \n" +
                "CALCULOS COM HORA" +
                "DATA-HORA ADD OU REMOVE TEMPO -> DATA-HORA \n" +
                "DATA-HORA1 - DATA-HORA2 = DURAÇÃO");
    }
}
