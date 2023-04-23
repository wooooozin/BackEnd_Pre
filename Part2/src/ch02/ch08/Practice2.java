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
            return;;
        }

        this.arr[this.front] = data;
        this.front = (this.front - 1 + this.arr.length) % this.arr.length;
    }
}

public class Practice2 {
    public static void main(String[] args) {

    }
}
