package ch20;

public class CharArrayTest {

    public static void main(String[] args) {

        char[] alphabets = new char[26];

        char ch = 'a';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;
        }

        for (char alph : alphabets) {
            System.out.println(alph + " , " + (int)alph);
        }


    }
}
