package ch02;

public class VariableTypeTest {

    public static void main(String[] args) {
        // 1. 자료형 - 숫자
        System.out.println("** 숫자 **");

        // 정수
        int intNum = 10;
        System.out.println("intNum: " + intNum);

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483648

        int intNum2 = Integer.MAX_VALUE + 1;
        System.out.println(intNum2);

        long longNum = (long)Integer.MAX_VALUE + 1;
        System.out.println(longNum); // 2147483648

        // 실수
        float fNum = 1.27F;
        double dNum = 1.23;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 2진수, 8진수, 16진수
        int bNum = 0b1100;
        int oNum = 014;
        int hNum = 0xC;

        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(hNum);

        System.out.println(Integer.toBinaryString(bNum));
        System.out.println(Integer.toOctalString(oNum));
        System.out.println(Integer.toHexString(hNum));

        // 자료형 - 불리언
        boolean isPass = true;
        boolean isOk = false;

        // 자로형 - 문자
        char keyFirst = 'a';
        char keyLast = 'z';

        System.out.println(keyLast);
        System.out.println((int)keyLast); // 122
    }
}
