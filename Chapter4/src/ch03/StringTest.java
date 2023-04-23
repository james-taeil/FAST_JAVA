package ch03;

public class StringTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java)); // 1450495309
        java = java.concat(android);
        System.out.println(System.identityHashCode(java)); // 1670782018
        System.out.println(java);


    }
}
