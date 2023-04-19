package ch02.ch03;

class LinkedList2 extends LinkedList {
    LinkedList2(Node node) {
        this.head = node;
    }

    // 연결 리스트에 데이터 추가
    // before_data가 null인 경우, 가장 뒤에 추가
    // before_data에 값이 있다면 해당 값을 가진 노드 앞에 추가

    public void addData(int data, Integer beforData) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else if (beforData == null) {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        } else {
            Node cur = this.head;
            Node pre = cur;
            while (cur != null) {
                if (cur.data == beforData) {
                    if (cur == this.head) {
                        this.head = new Node(data, this.head);
                    } else {
                        pre.next = new Node(data, cur);
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            }
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("list is Empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;
        while (cur != null) {
            if (cur.data == data) {
                if (cur == this.head) {
                    this.head = cur.next;
                } else {
                    pre.next = cur.next;
                }
                break;
            }
            pre = cur;
            cur = cur.next;
        }
    }
}
public class Practice1 {
    public static void main(String[] args) {
        LinkedList2 myList = new LinkedList2(new Node(1, null));

        myList.showData();

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();

        myList.addData(100, 1);
        myList.addData(200, 100);

        myList.removeData(5);
        myList.showData();
    }
}
