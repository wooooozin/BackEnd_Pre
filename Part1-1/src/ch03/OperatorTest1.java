package ch03;

public class OperatorTest1 {

    public static void main(String[] args) {
        // 1. 대입 연산자, 부호 연산자
        int num = 10;
        num = -10;

        // 2. 산술 연산자, 증가/감소 연산자
        int num1 = 10;
        int num2 = 3;
        int result = 0;

        result = num1 % num2;
        System.out.println(result); // 1

        System.out.println(num1++); // 10, 증가하지 않고 값 대입하고 증가
        System.out.println(num1); // 11

        System.out.println(++num2); // 4, 먼저 증가하고 값 대입
        System.out.println(num2); // 4

        // 3. 관계 연산자
        int a = 10;
        int b = 9;
        System.out.println(a > b); // true
        System.out.println(a < b);
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        // 4. 논리 연산자
        System.out.println(12 > 9 && 1 == 0);
        System.out.println(12 > 9 || 1 == 0);

        // 5. 복합 대입 연산자
        int num3 = 10;
        int num4 = 5;
        num3 += num4;
        // num3 = num3 + num4;
        System.out.println(num3); // 15

        // 6. 삼항 연산자
        int num5 = (a > b) ? 1 : 0; // 조건 ? 참 값 : 거짓 값;
        System.out.println(num5); 
    }

}
