package ch02.ch06;

import java.util.ArrayList;

class MyQueue1 {
    ArrayList list;

    MyQueue1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        this.list.add(data);
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        int data = (int)this.list.get(0);
        this.list.remove(0);
        return data;
    }

    public Integer peak() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return (int)this.list.get(0);
    }

    public void printQueue() {
        System.out.println(this.list);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        MyQueue1 queue1 = new MyQueue1();

        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.push(4);
        queue1.printQueue();
        System.out.println(queue1.peak());
    }

}
