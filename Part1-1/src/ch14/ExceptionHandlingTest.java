package ch14;


import java.io.BufferedReader;
import java.io.FileReader;

class NotTenException extends RuntimeException {

}

public class ExceptionHandlingTest {

    public static boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }
        return true;
    }

    public static boolean checkTenWithException(int ten) {
        try {
            if (ten != 10) {
                throw new NotTenException();
            }
        } catch(NotTenException e) {
            System.out.println(e);
            return false;
        }

        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException {
        if (ten != 10) {
            throw new NotTenException();
        }

        return true;
    }

    public static void main(String[] args) {

        // 1. 예외
        // 1-1 0으로 나누기
        System.out.println("0으로 나누기");
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("e => " + e); // e => java.lang.ArithmeticException: / by zero
        } finally {
            System.out.println("finally 무조건 실행");
        }

        // 1-2 배열 인덱스 초과
        int[] b = new int[4];
//        b[4] = 1;
        try {
            b[4] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e -> " + e);
        }

        // 1-3 없는 파일 열기
//        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));


        // 2. throw, throws
        Boolean checkResult = ExceptionHandlingTest.checkTen(10);

        checkResult = ExceptionHandlingTest.checkTenWithException(9);
        System.out.println(checkResult);

        try {
            checkResult = ExceptionHandlingTest.checkTenWithThrows(9);
        } catch (NotTenException e) {
            System.out.println("e = > " + e);
        }
        System.out.println(checkResult);
    }

}
