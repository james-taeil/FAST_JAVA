package ch20;

public class ArrayTest {
    public static void main(String[] args) {

        /*int[] arr = new int[10];

        int total = 0;

        for (int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
        }

        for (int num : arr) {
            total += num;
        }
        System.out.println(total);*/

        char[] alphabats = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabats.length; i++) {
            alphabats[i] = ch++;
        }

        for (int i = 0; i < alphabats.length; i++) {
            System.out.println(alphabats[i] + " , " + (int)alphabats[i]);
        }


    }
}
