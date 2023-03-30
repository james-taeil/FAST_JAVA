package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("Herry Porter 1", "Joanne Rowling"));
        library.add(new Book("Herry Porter 2", "Joanne Rowling"));
        library.add(new Book("Herry Porter 3", "Joanne Rowling"));
        library.add(new Book("Herry Porter 4", "Joanne Rowling"));
        library.add(new Book("Herry Porter 5", "Joanne Rowling"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showBookInfo();
        }
    }
}
