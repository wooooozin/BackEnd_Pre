package ch18;

import java.util.Scanner;

public class Practice2 {

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳 입력");
        char inputChar = sc.nextLine().charAt(0);
        int output = 0;

        int step = (int)'a' - (int)'A';

        if (inputChar >= 'a' && inputChar <= 'z') {
            output = (int)inputChar - step;
            System.out.println("대문자 : " + (char)output);
        } else if (inputChar >= 'A' && inputChar <= 'Z') {
            output = (int)inputChar + step;
            System.out.println("소문자 : " + (char)output);
        } else {
            System.out.println("알파벳이 아닙니다.");
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
