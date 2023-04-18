package ch01.ch07;

public class Practice {

    static double pow(int a, double b) {
        double result = 1;
        boolean isMunus = false;

        if (b == 0) {
            return 1;
        } else if (b < 0) {
            b *= -1;
            isMunus = true;
        }

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return isMunus ? 1 / result : result;
    }

    static double sqrt(int a) {
        double result = 1;
        // 바빌로니아 방법
        for (int i = 0; i < 10; i++) {
            result = (result + (a / result)) / 2 ;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(Math.sqrt(8)); // 2.8284271247461903
        System.out.println(sqrt(8)); // 2.82842712474619
        System.out.println(sqrt(4));
    }
}
