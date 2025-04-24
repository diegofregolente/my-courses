package application;

public class Conceitos {
    public static void main(String[] args) {

        System.out.printf("Conceito Importantes \n" +
                "Data-[Hora] Local - ano-mes-dia-[hora] sem fuso hora opcional \n" +
                "Data-hora Global - ano-mes-dia-hora com fuso horario não tem opcional \n" +
                "Duração - tempo decorrido entre duas datas-horas \n" +
                "2022-07-23T14:30:00Z - Onde T informa que é o horário e o Z corresponde ao fuso de londrês UTC/GMT \n" +
                "Local se o seu arquivo não for acessado por pessoas de outro fuso, global se for multi-região. \n");
    }
}
