package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Lista {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3, 9);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println("Ultimo da lista: " + list.getLast());
        System.out.println("Primeiro da lista: " + list.getFirst());
        System.out.println("Tem 4 na lista? " + list.contains(4));
        System.out.println("Qual posicao do 5? " + list.indexOf(5));
        System.out.println("Tamanho da lista: " + list.size());

        System.out.println();
        System.out.println("Lista reversa: " + list.reversed());
        System.out.println("Lista normal: " + list);
        System.out.println();

        for (Integer x : list ){ /* for each para mostrar todos os itens da lista */
            System.out.println(x);
        }
        System.out.println();

        list.remove(Integer.valueOf(4));
        list.remove(3);
        System.out.println(list);
        System.out.println();

        list.removeIf(x -> x == 5);
        System.out.println(list);

        System.out.println("Onde ta o 3: " + list.indexOf(3));
        System.out.println(list.indexOf(2));

        List<Integer> result = list.stream().filter(x -> x > 3).toList();
        System.out.println(result);
        System.out.println();

        Integer number = list.stream().filter(x -> x > 8).findFirst().orElse(null);
        System.out.println(number);
    }
}
