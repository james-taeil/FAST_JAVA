package ch15.book;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();

        bookQueue.enQueue("칼의 노래1");
        bookQueue.enQueue("칼의 노래2");
        bookQueue.enQueue("칼의 노래3");
        bookQueue.enQueue("칼의 노래4");
        bookQueue.enQueue("칼의 노래5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());
    }
}
