package ch02.ch05;

import java.util.Stack;

// 두 문자열 비교
// # ->앞에 있는 바로 이전의 문자를 삭제하는 기능
public class Practice4 {
    public static boolean stringCompare(String s1, String s2) {
        String s1After = doBackspace(s1);
        String s2After = doBackspace(s2);
        return s1After.equals(s2After);
    }

    public static String doBackspace(String s) {
        Stack stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '#' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        System.out.println(stringCompare("tree", "th#ree"));
        System.out.println(stringCompare("ab#a", "aab#"));
        System.out.println(stringCompare("wo#w", "ww#o"));
    }

}
