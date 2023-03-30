package ch21;

public class BookTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("Herry potter 1", "Joanne Rowling");
        library[1] = new Book("Herry potter 2", "Joanne Rowling");
        library[2] = new Book("Herry potter 3", "Joanne Rowling");
        library[3] = new Book("Herry potter 4", "Joanne Rowling");
        library[4] = new Book("Herry potter 5", "Joanne Rowling");

        for (Book book : library) {
            System.out.println(book);
            book.showBookInfo();
        }
    }
}
