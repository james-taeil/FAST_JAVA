package ch23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class FastLibrary {
    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("해리포터 1");
        shelf.add("해리포터 2");
        shelf.add("해리포터 3");

    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        if (shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }
        if (shelf.size() > 0) {
            String book = shelf.remove(0);
            System.out.println(t.getName() + book + " lend");
            return book;
        }
        else {
            return null;
        }

    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();

        shelf.add(book);
        notify();
        System.out.println(t.getName() + book + " return");
    }
}

class Student extends Thread {
    public Student(String name) {
        super(name);
    }
    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            if (title == null) {
                System.out.println(getName() + "not book");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class LibraryMain {
    public static FastLibrary library = new FastLibrary();
    public static void main(String[] args) {
        Student std1 = new Student("Kim");
        Student std2 = new Student("Lee");
        Student std3 = new Student("Park");
        Student std4 = new Student("Choi");
        Student std5 = new Student("Hu");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
    }
}
