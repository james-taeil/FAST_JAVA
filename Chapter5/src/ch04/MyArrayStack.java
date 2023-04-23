package ch04;

import ch02.MyArray;

public class MyArrayStack {
    MyArray arrayStack;

    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.deleteElement(--top);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top - 1);
    }

    public boolean isFull() {
        return (top == arrayStack.ARRAY_SIZE) ? true : false;
    }

    public int getSize() {
        return arrayStack.getSize();
    }

    public boolean isEmpty() {
        return (top == 0) ? true : false;
    }

    public void printAll() {
        arrayStack.printAll();
    }
}
