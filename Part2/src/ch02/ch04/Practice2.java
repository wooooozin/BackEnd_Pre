package ch02.ch04;

class MyStack2 {
    int[] arr;
    int top = -1;

    MyStack2(int size) {
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.top == this.arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack is full");
            return;
        }
        this.top += 1;
        this.arr[this.top] = data;
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("Stakc is empty");
            return null;
        }
        int data = this.arr[this.top];
        this.top -= 1;
        return data;
    }

    public Integer peak() {
        if (this.isEmpty()) {
            System.out.println("Stakc is empty");
            return null;
        }
        return this.arr[this.top];
    }

    public void printStack() {
        for (int i = 0; i < this.top + 1; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}

public class Practice2 {

    public static void main(String[] args) {
        MyStack2 stack2 = new MyStack2(5);
        System.out.println(stack2.isFull());

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.printStack();

        System.out.println(stack2.peak());
        stack2.printStack();

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        stack2.printStack();
    }
}
