package ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "world";

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString("Hello", "world");

        StringConcat concat = (s, v) -> System.out.printf("%s, %s!\n", s1, s2);
        concat.makeString(s1, s2);


    }
}
