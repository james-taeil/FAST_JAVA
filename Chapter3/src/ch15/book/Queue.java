package ch15.book;

public interface Queue {

    void enQueue(String title);
    String deQueue();

    int getSize();
}
