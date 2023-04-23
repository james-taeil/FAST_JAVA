package ch06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class InArrayStreamTest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int el : arr) {
            System.out.printf("%d ", el);
        }

        System.out.println();
        Arrays.stream(arr).forEach(el -> System.out.printf("%d ", el));
        IntStream is = Arrays.stream(arr);
    }
}
