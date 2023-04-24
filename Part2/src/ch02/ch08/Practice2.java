package ch02.ch08;
// 배열을 이용한 기본 데크 직접 구현

class MyDeque2 {
    int arr[];
    int front = 0;
    int rear = 0;

    MyDeque2(int size) {
        this.arr = new int[size + 1];
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.arr.length == this.front;
    }

    public void addFirst(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full");
            return;
        }

        this.arr[this.front] = data;
        this.front = (this.front - 1 + this.arr.length) % this.arr.length;
    }

    public void addLast(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full");
            return;
        }

        this.rear = (this.rear + 1) % this.arr.length;
        this.arr[this.rear] = data;
    }

    public Integer removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }

        this.front = (this.front + 1) % this.arr.length;
        return this.arr[this.front];
    }

    public Integer removeLast() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }
        int data = this.arr[this.rear];
        this.rear = (this.rear + 1) % this.arr.length;
        return data;
    }

    public void printDeque() {
        int start = (this.front + 1) % this.arr.length;
        int end = (this.rear + 1) % this.arr.length;

        for (int i = start; i != end; i = (i + 1) % this.arr.length) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }


}

public class Practice2 {
    public static void main(String[] args) {
        MyDeque2 myDeque2 = new MyDeque2(5);

        myDeque2.addFirst(1);
        myDeque2.addFirst(2);
        myDeque2.addFirst(3);
        myDeque2.printDeque();

        myDeque2.addLast(10);
        myDeque2.addLast(20);
        myDeque2.addLast(30);
        myDeque2.printDeque();
    }
}
