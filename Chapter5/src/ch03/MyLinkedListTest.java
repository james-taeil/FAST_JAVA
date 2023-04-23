package ch03;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.printAll();
        list.insertElement(3, "D");
        list.printAll();
        list.deleteElement(0);
        list.printAll();
        list.deleteElement(1);
        list.printAll();

        list.insertElement(0, "A-1");
        list.printAll();
        System.out.println(list.getSize());

        list.deleteElement(0);
        list.printAll();
        System.out.println(list.getSize());

        list.deleteAll();
        list.printAll();
        list.addElement("A");
        list.printAll();
        System.out.println(list.getElement(0));
        list.deleteElement(0);

    }
}
