package ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요 \n");

        System.out.println("입력 1 : ");
        int num = scanner.nextInt();
        System.out.println("입력 2 : ");
        int num2 = scanner.nextInt();

        System.out.println("max value");
        max = (num > num2)? num : num2;

        System.out.println(max);

    }
}
