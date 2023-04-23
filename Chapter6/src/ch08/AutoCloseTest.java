package ch08;

public class AutoCloseTest {
    public static void main(String[] args) {

        AutoCloseable obj = new AutoCloseableObj();

        try (obj) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception error message");
        }

        System.out.println("end");
    }
}
