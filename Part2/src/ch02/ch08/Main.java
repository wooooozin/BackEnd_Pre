package ch02.ch08;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        // Front 부문 입력
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque);

        // Rear 부분 입력
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque);

        // Front 부분 출력
        System.out.println(deque.removeFirst());
        System.out.println(deque);

        // Rear 부분 출력
        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());

        System.out.println(deque);
        System.out.println(deque.pollLast()); //null
        System.out.println(deque.removeLast()); // error
    }

}
