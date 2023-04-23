package ch02.ch08;
// ArrayList를 이용한 데크 구현

import java.util.ArrayList;

class MyDeque1 {

    ArrayList list;

    MyDeque1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(int data) {
        this.list.add(0, data);
    }

    public void addLast(int data) {
        this.list.add(data);
    }

    public Integer removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Deque is Empty");
            return null;
        }

        int data = (int)this.list.get(0);
        this.list.remove(0);
        return data;
    }

    public Integer removeLast() {
        if (this.list.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }

        int data = (int)this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return data;
    }

    public void printDeque() {
        System.out.println(this.list);
    }

}
public class Practice1 {
    public static void main(String[] args) {
        MyDeque1 myDeque1 = new MyDeque1();

        myDeque1.addFirst(1);
        myDeque1.addFirst(2);
        myDeque1.addFirst(3);

        myDeque1.addLast(10);
        myDeque1.addLast(20);
        myDeque1.addLast(30);
        myDeque1.printDeque();
        System.out.println(myDeque1.removeFirst());
        myDeque1.printDeque();
    }
}
