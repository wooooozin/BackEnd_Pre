package ch02.ch04;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // [1, 2, 3, 4, 5]

        stack.pop();
        System.out.println(stack); // [1, 2, 3, 4]

        stack.pop();
        System.out.println(stack); // [1, 2, 3]

        System.out.println(stack.pop()); // 3
        System.out.println(stack); // [1, 2]

        System.out.println(stack.peek()); // 2 , 값을 빼지는 않고 마지막 값을 출력
        System.out.println(stack); // [1, 2]

        System.out.println(stack.contains(1)); // true
        System.out.println(stack.size()); // 2
        System.out.println(stack.empty()); // false

        stack.clear();
        System.out.println(stack);
//        stack.pop(); // 에러 처리해줘

    }
}
