package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("Lee");
        sList.add("Kim");
        sList.add("Choi");

        Stream<String> stream = sList.stream();
        stream.forEach(el -> System.out.printf("%s ", el)); // Lee Kim Choi
        System.out.println();

        sList.stream()
                .sorted()
                .forEach(el -> System.out.printf("%s ", el)); // Choi Kim Lee

        System.out.println();
        sList.stream()
                .map(el -> el.length())
                .forEach(el -> System.out.printf("%s ", el));

        System.out.println();
        sList.stream()
                .filter(el -> el.length() > 3)
                .forEach(el -> System.out.printf("%s ", el));

    }
}
