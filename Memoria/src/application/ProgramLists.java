package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramLists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("-----------------");

        list.removeIf(name -> name.charAt(0) == 'M');

        System.out.println(list.size());
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("--------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("----------------------");
        List<String> result = list.stream().filter(name -> name.charAt(0) == 'A').toList();
        for (String name : result) {
            System.out.println(name);
        }
        System.out.println("----------------------");
        String name = list.stream().filter(n -> n.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
