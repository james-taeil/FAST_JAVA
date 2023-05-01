package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("ch14/input.txt");
            System.out.println((char)fis.read());

        }  catch (IOException e) {
            e.printStackTrace();

            try {
                fis.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (Exception e2) {
                System.out.println(e2);
            }
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Exception e2) {
                System.out.println(e2);
            }
        }
        System.out.println("FileInputStreamTest.main");
    }
}
