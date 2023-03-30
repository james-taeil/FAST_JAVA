package ch21;

public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];


        library[0] = new Book("Herry potter 1", "Joanne Rowling");
        library[1] = new Book("Herry potter 2", "Joanne Rowling");
        library[2] = new Book("Herry potter 3", "Joanne Rowling");
        library[3] = new Book("Herry potter 4", "Joanne Rowling");
        library[4] = new Book("Herry potter 5", "Joanne Rowling");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        System.out.println(" == library == ");
        for (Book book : library) {
            System.out.println(book);
            book.showBookInfo();
        }

        System.out.println(" ");

        System.out.println(" == copy library == ");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showBookInfo();
        }


    }
}
