package ch02.ch05;

import java.util.Stack;

// 괄호 짝 검사
// ( 들어왔을 때 팝, ) 푸시 했을 때 값이 비면 패스, 있으면 실패
public class Practice2 {

    public static void checkParenthesis(String str) {
        Stack stack = new Stack();
        boolean checkFlag = true;

        for (String s : str.split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    checkFlag = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (checkFlag && stack.isEmpty()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        checkParenthesis("(");
        checkParenthesis(")");
        checkParenthesis("()");
        checkParenthesis("()()()");
        checkParenthesis("(())()");
        checkParenthesis("((((()))");
    }
}
