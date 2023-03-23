package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int chage;

        if (age < 8) {
            chage = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        else if (age  < 14) {
            chage = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if (age < 20) {
            chage = 3000;
            System.out.println("중,고등학생 입니다.");
        }
        else {
            chage = 4000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는" + chage + "입니다.");
    }
}
