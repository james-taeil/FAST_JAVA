package ch04;

public class StringConcatImpl implements StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.printf("%s, %s!\n", s1, s2);
    }
}
