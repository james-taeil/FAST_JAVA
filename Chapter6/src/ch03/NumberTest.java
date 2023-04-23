package ch03;

public class NumberTest {
    public static void main(String[] args) {

        Number number = (x, y) -> x > y ? x : y;
        System.out.println(number.getMax(20, 10));
        System.out.println(number.getMax(10, 20));
    }
}
