package ch03;

public class BitOperatorTest {

    public static void main(String[] args) {
        // 1. 비트 논리 연산자
        // 1-1. AND 연산자
        int a = 5;
        int b = 3;
        int result = 0;

        result = a & b;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a)));
        // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(b)));
        // 0011
        System.out.println(result);
        // 0001, 1

        // 1-2. OR 연산자
        result = a | b;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a)));
        // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(b)));
        // 0011
        System.out.println(result);
        // 0111, 7

        // 1-3. XOR 연산자
        result = a ^ b;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a)));
        // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(b)));
        // 0011
        System.out.println(result);
        // 0110, 6

        // 1-4. 반전 연산자
        result = ~a;
        System.out.printf("%s\n", Integer.toBinaryString(result));
        // 11111111111111111111111111111010
        System.out.println(result); // -6

        // 2. 비트 이동 연산자
        // 2-1. << 연산자
        int num = 3;
        result = num << 1;
        System.out.println(result); // 6
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0110

        // 2-2. >> 연산자

        result = num >> 1;
        System.out.println(result); // 1
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0001

        // 2-3. >>> 연산자

        num = -5;
        result = num >>> 1;
        System.out.println(result); //
        System.out.printf("%s\n", (Integer.toBinaryString(num))); // 11111111111111111111111111111011
        System.out.printf("%s\n", (Integer.toBinaryString(result))); // 1111111111111111111111111111101


    }

}
