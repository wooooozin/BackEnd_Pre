package ch02.ch05;

// 문자열 뒤집기
// 스택 사용


import java.util.Stack;

public class Practice1 {

    public static String reverseString(String str) {
        Stack stack = new Stack();
        String result = "";

        for (String s : str.split("")) {
            stack.push(s);
        }

        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String result = reverseString("Hello");
        System.out.println(result);

        result = reverseString("1 3 5 7 9");
        System.out.println(result);
    }
}
