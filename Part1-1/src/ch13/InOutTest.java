package ch13;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InOutTest {

    public static void referInputStream() throws IOException {

        // System-in - character 1나 입력
        System.out.println("=== System-in ===");
        System.out.print("입력 :");
        int a = System.in.read() - '0';
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 남은 데이터를 소진해줘야 함

        // InputStreamReader
        System.out.println("=== InputStreamReader ===");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3];
        System.out.print("입력: ");
        reader.read(c);
        System.out.println(c);


        // BufferedReader
        System.out.println("=== BufferedReader ===");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력: ");
        String s1 = br.readLine();
        System.out.println("s1 + " + s1);

    }

    public static void main(String[] args) throws IOException {

        // 1. 입력
        // 다른 입력 방식 참고
//        referInputStream();

        // Scanner
        System.out.println("=== Scanner ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        System.out.println(sc.next());
        sc.nextLine();

        System.out.println("입력2: ");
        System.out.println(sc.nextInt());
        sc.nextLine();

        System.out.println("입력3: ");
        System.out.println(sc.nextLine());

        // 참고. 정수, 문자열 반환
        int num = Integer.parseInt("1234");
        String str = Integer.toString(12344);

        // 출력
        String s = "자바";
        int number = 1;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);
        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10);
        System.out.printf("%x\n", 10);

        System.out.printf("%f\n", 5.2F);
        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "AAAAAAAAA");

        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);
        System.out.printf("%-5d\n", 345);

        System.out.printf("%.2f\n", 12.12312312);

    }

}
