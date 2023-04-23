package ch03;

public class MyListNode {

    private String data;        // 들어오는 데이터
    public MyListNode next;     // 다음 노드를 가리키는 링크
    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode link) {
        this.data = data;
        this.next = link;
    }

    public String getData() {
        return data;
    }
}
