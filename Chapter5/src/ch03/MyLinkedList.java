package ch03;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        // 새로 들어갈 노드
        MyListNode newNode = new MyListNode(data);

        // first node
        // head == null => 첫 노드야? 라고 물어보는 것
        if (head == null) {
            head = newNode; // head가 첫번째 노드로 할당
        }

        // other node
        // 마지막 node는 null을 가리킴
        else {
            MyListNode temp = head; // head = 첫번째 element

            // 마지막 노드를 찾기 위해 while을 돈다
            while (temp.next != null) {
                temp = temp.next;
            }
            // temp 마지막을 가리키는 node
            // 그래서 newNode를 할당해 준다.
            // newNode의 link는 null
            temp.next = newNode;
        }
        count++;
        return newNode;

        /*newNode = new MyListNode(data);
        newNode.next = head;
        head = newNode;

        count++;*/
    }

    public MyListNode insertElement(int position, String data) {
        // tempNode 처음 node
        MyListNode firstNode = head;

        // 데이터 삽입할 node의 이전 node
        MyListNode preNode = null;

        // 삽입할 node
        MyListNode newNode = new MyListNode(data);

        // 예외 처리
        // 넣을 위치가 범위 초과인 경우
        if (position < 0 || position > count) {
            return null;
        }

        // 맨 앞으로 들어갈 경우
        if (position == 0) {
            // 원래 head 였던 친구가 newNode의 다음 것이 되고
            newNode.next = head;

            // newNode가 head로 가면 된다.
            head = newNode;
        } else {
            // pre Node 찾기
            for (int i = 0; i < position; i++) {
                // head node를 pre node에 할당하여 pre node 값 저장
                preNode = firstNode;

                // pre node 다음 값을 처음 값에 할당
                firstNode = firstNode.next;

                // 이런 루프를 돌면서 pre node 찾기
            }

            newNode.next = preNode.next;
            preNode.next = newNode;
        }

        count++;
        return newNode;
    }

    public MyListNode deleteElement(int position) {

        MyListNode firstNode = head;
        MyListNode preNode = null;

        // 예외 처리
        if (position < 0 || position > count) {
            return null;
        }

        // 맨 앞
        if (position == 0) {
            head = firstNode.next;
        } else {
            for (int i = 0; i < position; i++) {
                preNode = firstNode;
                firstNode = firstNode.next;
            }
            // 이전 노드가 first를 가리키는게 아니고 first next가 가리키던걸 가리켜야함
            preNode.next = firstNode.next;
        }
        count--;
        return firstNode;
    }

    public MyListNode getNode(int position) {
        MyListNode firstNode = head;

        if (position < 0 || position > count) {
            System.out.println("Out of range");
            return null;
        }

        if (position == 0) {
            return head;
        }

        for (int i = 0; i < position; i++) {
            firstNode = firstNode.next;
        }
        return firstNode;
    }

    public String getElement(int position) {
        MyListNode firstNode = head;

        if (position < 0 || position > count) {
            System.out.println("Out of range");
            return new String("Error");
        }

        if (position == 0) {
            return firstNode.getData();
        }

        for (int i = 0; i < position; i++) {
            firstNode = firstNode.next;
        }
        return firstNode.getData();
    }

    public void deleteAll() {
        head = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("Nothing data");
        }

        MyListNode firstNode = head;
        while (firstNode != null) {
            System.out.print(firstNode.getData());
            firstNode = firstNode.next;

            if (firstNode != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }
}
