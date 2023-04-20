package ch02.ch05;

// 후위표기법 연산
// 전위 / 중위 / 후휘 표기법
// 중위 표기법 2 + 2
// 2 2 + 후위표기법
// + 2 2 전위표기법
// (1 + 2) * 3 -> 후위 표기법으로 바꾼다면? ((1 + 2) * 3) -> 1 2 + 3 *
// 1 + 2 * 3 -> 후위표기법 -> 1 2 3 * +

import java.util.Stack;

public class Practice3 {
    public static double calculate(String string) {
        Stack<Double> stack = new Stack<Double>();

        for (String s : string.split(" ")) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                stack.push(- stack.pop() + stack.pop());
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                stack.push(1 / stack.pop() * stack.pop());
            } else {
                stack.push(Double.parseDouble(s));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println((calculate("2 2 +")));
        System.out.println(calculate("1 1 + 2 * 3 * 2 / 5 -"));
    }
}
