package ch20;

public class NestedLoopTest {
    public static void main(String[] args) {

        /*for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }*/

        int i = 2;
        int j = 1;
        while (i < 10) {

            while(j < 10) {
                System.out.println(i + " X " + j + " = " + i * j);
                j++;
            }
            i++;
            j = 1;
            System.out.println();
        }
    }
}
