package Boj.b1157;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1157Refactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase();

        int[] counts = new int['z' - 'a' + 1]; // z - a : 25
        // System.out.println(Arrays.toString(counts)); // 0으로 초기화 [26]

        char[] alpha = new char['z' - 'a' + 1]; // 26
        // System.out.println(Arrays.toString(alpha)); // 글자로 초기화

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char)('a' + i); // int : 'a' + i || (char)('a' + i) char 형변환
        }
        // System.out.println(Arrays.toString(alpha)); // arr : a ~ z

        for (int i = 0; i < word.length(); i++) {
            counts[word.charAt(i) - 'a']++; // input 받은 알파벳 하나의 index에 +1씩 증가해줌
        }
        // System.out.println(Arrays.toString(counts));


        // 최대로 많이 나온 알파벳 찾기
        // 여러개가 같은 경우 return ?

        int max = -1;
        char popular = '\0'; // 공백

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                popular = (char)(alpha[i] - ('a' - 'A'));
            }
            else if (counts[i] == max) {
                popular = '?';
            }
        }
        System.out.println(popular);
        scanner.close();
    }
}
