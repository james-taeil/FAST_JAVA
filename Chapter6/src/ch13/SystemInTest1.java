package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {

        System.out.println("알파벳 여러 개 쓰고 Enter를 누르세요");

        int i;

//        try {
//            i = System.in.read();
//            System.out.println(i);
//            System.out.println((char)i);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            InputStreamReader irs = new InputStreamReader(System.in);
            while ((i = irs.read()) != '\n') {
                System.out.println(i);
                System.out.println((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
