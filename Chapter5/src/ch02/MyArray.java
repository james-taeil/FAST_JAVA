package ch02;

public class MyArray {

    int[] intArr;   // int Array
    int count;      // element 갯수

    public int ARRAY_SIZE; // capacity
    public static final int ERROR_NUM = -999999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public int getSize() { return count; }
    public int getElement(int position) {
        if (position < 0 || position > count - 1) {
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printElement() {
        if (isEmpty()) {
            System.out.println("Element : 0");
            return ;
        }

        for (int el : intArr) {
            System.out.printf("%d ", el);
        }
        System.out.println(" ");
    }

    public boolean isEmpty() {
        if (count == 0) return true;
        return false;
    }

    // 중간에 element가 들어오는 경우
    public void insertElement(int position, int num) {
        int i; // index

        // 범위 초과 에러
        if (position < 0 || position > count) {
            System.out.println("Error message");
            return;
        }

        // 용량보다 요소가 더 많을 경우 에러
        if (count >= ARRAY_SIZE) {
            System.out.println("Error message");
            return;
        }

        for (i = count - 1; position <= i; i--) {
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num;
        count++;
    }

    public int deleteElement(int position) {

        if (isEmpty()) {
            System.out.println("Error message");
            return ERROR_NUM;
        }

        if (position < 0 || position > count - 1) {
            System.out.println("Error message");
            return ERROR_NUM;
        }

        int result = intArr[position];

        for (int i = position; i < count - 1; i++) {
            intArr[i] = intArr[i+1];
        }
        count--;
        return result;
    }

    public void removeAll() {
        if (isEmpty()) {
            System.out.println("Error message");
            return;
        }

        for (int i = 0; i < count; i++) {
            intArr[i] = 0;
        }

        count = 0;
        System.out.println("Done!");
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("Error : Empty Array");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(intArr[i]);
        }
    }

    public static void main(String[] args) {
        MyArray arr = new MyArray(10);

        /*arr.addElement(1);
        arr.addElement(2);
        arr.addElement(3);
        arr.addElement(4);
        arr.addElement(5);
        System.out.println(arr.getElement(2));*/

        MyArray array = new MyArray();
        array.addElement(10);
        array.addElement(20);
        array.addElement(30);
        array.insertElement(1, 50);
        array.printElement();

        array.deleteElement(1);
        array.printElement();

        array.addElement(70);
        array.printElement();
        array.deleteElement(1);
        array.printElement();

        System.out.println(array.getElement(2));


    }
}
