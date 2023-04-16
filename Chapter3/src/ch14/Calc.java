package ch14;

public interface Calc {

    // public static final constant
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // default method
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    // static method
    static int total(int[] arr) {

        int total = 0;

        for (int num : arr) {
            total += num;
        }
        myStaticMethod();
        return total;
    }

    // private method
    // interface 내에서 사용
    // implement 하는 곳에서 사용하는거 아님
    // 재정의로 사용하는 것도 아님
    // interface 안에서 사용하려고 하는 것

    // 2가지 종류
    private void myMethod() {
        System.out.println("My private Method");
    }

    private static void myStaticMethod() {
        System.out.println("My Private Static Method");
    }

}
