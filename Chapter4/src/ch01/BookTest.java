package ch01;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("린치핀", "세스 고딘");
        System.out.println(book); // output : 가상 메모리 , instance가 할당된 주소 값 16진수

        String str = new String("test");
        System.out.println(str); // string 값 => 이미 str.toString()값으로 나옴
    }
}
