package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    // 예외 처리는 예외가 발생하는 문장에서 try-catch 블록으로 처리하는 방법과 이를 사용하는 부분에서 처리하는 방법 두 가지가 있음
    // throws를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있음

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);    //FileNotFoundException 발생
        Class c = Class.forName(className);                     //ClassNotFoundException 발생
        return c;
    }

    public static void main(String[] args) {

        // Exception 클래스를 활용하여 defualt 처리를 할 때 Exception 블록은 맨 마지막에 위치해야 함

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 최상위 exception
        // 처리할 때 위에 예외 처리 빼고 나머지 다 업케스팅 되어 예외처리가 된다.
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

}
