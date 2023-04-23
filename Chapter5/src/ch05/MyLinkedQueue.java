package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue {
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();
}
public class MyLinkedQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;
    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        // 맨 처음 들어가는 경우
        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        // 1개 이상 데이터가 있는 상태에서 들어가는 경우
        else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " add");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            return null;
        }

        String data = front.getData();
        front = front.next;

        if (front == null) {
            rear = null;
        }


        return data;
    }

    @Override
    public void printQueue() {
        printAll();
    }
}
