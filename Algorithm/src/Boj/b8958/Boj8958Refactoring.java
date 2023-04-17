package Boj.b8958;

import java.util.Scanner;

public class Boj8958Refactoring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String score = scanner.next();
            int count = 0;
            int sum = 0;

            for (int j = 0; j < score.length(); j++) {
                if (score.charAt(j) == 'O') {
                    count++;
                }
                else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
