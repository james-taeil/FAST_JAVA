package ch02;

public class AddTest {
    public static void main(String[] args) {
        Add addTest = (x, y) -> x + y;

        System.out.println(addTest.add(2, 3));
    }
}
