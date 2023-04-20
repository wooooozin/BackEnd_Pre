package ch02.ch03;


class CircularLinkedList1 {
    NodeBi head;
    NodeBi tail;

    CircularLinkedList1(NodeBi node) {
        this.head = node;
        this.tail = node;
        node.next = this.head;
        node.prev = this.head;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // 연결리스트에 데이터 추가
    // before_data가 null 인 경우, 가장 뒤에 추가
    // before_data가 값이 없다면, 해당 값을 가진노드 앞에 추가

    public void addData(int data, Integer beforeData) {
        if (this.head == null) {
            NodeBi newNodeBi = new NodeBi(data, null, null);
            this.head = newNodeBi;
            this.tail = newNodeBi;
            newNodeBi.next = newNodeBi;
            newNodeBi.prev = newNodeBi;
        } else if (beforeData == null) {
            NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);
            this.tail.next = newNodeBi;
            this.head.prev = newNodeBi;
            this.tail = newNodeBi;
        } else {
            NodeBi cur = this.head;
            NodeBi pre = cur;

            do {
                if (cur.data == beforeData) {
                    if (cur == this.head) {
                        NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);
                        this.tail.next = newNodeBi;
                        this.head.prev = newNodeBi;
                        this.head = newNodeBi;
                    } else {
                        NodeBi newNodeBi = new NodeBi(data, cur, pre);
                        pre.next = newNodeBi;
                        cur.prev = newNodeBi;
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            } while (cur != this.head);
        }
    }

    // 연결 리스트에서 특정 값을 가진 노드 삭제
    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("list is empty");
            return;
        }

        NodeBi cur = this.head;
        NodeBi pre = cur;
        while (cur != null) {
            if (cur.data == data) {
                if (cur == this.head && cur == this.tail) {
                    this.head = null;
                    this.tail = null;
                } else if (cur == this.head) {
                    cur.next.prev = this.head.prev;
                    this.head = cur.next;
                    this.tail.next = this.head;
                } else if (cur == this.tail) {
                    pre.next = this.tail.next;
                    this.tail = pre;
                    this.head.prev = this.tail;
                } else {
                    pre.next = cur.next;
                    cur.next.prev = pre;
                }
                break;
            }

            pre = cur;
            cur = cur.next;
        }
    }

    public void showData() {
        if (this.isEmpty()) {
            System.out.println("list is empty");
            return;
        }

        NodeBi cur = this.head;
        while (cur.next != this.head) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(cur.data);
    }
}

public class Practice4 {

    public static void main(String[] args) {
        CircularLinkedList1 list = new CircularLinkedList1(new NodeBi(1, null, null));
        list.addData(2, null);
        list.addData(3, null);
        list.addData(4, null);
        list.showData();

        list.removeData(2);
        list.showData();
    }
}
