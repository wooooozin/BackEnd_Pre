package ch02.ch06;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll()); // 1
        System.out.println(queue); // [2, 3, 4, 5]
        System.out.println(queue.peek()); // 2
        System.out.println(queue.contains(2)); // true
        System.out.println(queue.size()); // 4
        System.out.println(queue.isEmpty()); // false

        queue.clear();
        System.out.println(queue); // []
        System.out.println(queue.poll()); // null
    }


}
