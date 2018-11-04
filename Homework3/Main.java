package Homework3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "four", "five", "four", "two"};

      // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Set<String> UniqueList = new HashSet<String>(Arrays.asList(words));
        System.out.println("Уникальные слова:");
        System.out.println(UniqueList);

        // Посчитать, сколько раз встречается каждое слово.
        Map<String, Integer> hasharray = new HashMap<>();
        System.out.println("Частота повторения:");
        for (String word : words) {
            hasharray.put(word, hasharray.getOrDefault(word, 0) + 1);
        //    System.out.println(hasharray.getOrDefault(word, 0));
        }
        System.out.println(hasharray);

        // Телефонный справочник
        Telephons pb = new Telephons();

        pb.add("FIO_1", "11111");
        pb.add("FIO_2", "22222");
        pb.add("FIO_1", "33333");
        pb.add("FIO_3", "44444");

        System.out.println(pb.get("FIO_1"));
    }
}
