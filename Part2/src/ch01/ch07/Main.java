package ch01.ch07;

public class Main {

    public static void main(String[] args) {

        // 제곱, 제곱근, 지수
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, -3));
        System.out.println(Math.pow(-2, -3)); // -0.125

        System.out.println(Math.pow(2, 30)); // 1.073741824E9
        System.out.printf("%.0f\n", Math.pow(2, 30)); // 1073741824

        // 제곱근
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(16, 1.0/2));
        System.out.println(Math.pow(16, 1.0/4));

        // 절대값
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));

        // 로그
        System.out.println(Math.E);
        System.out.println(Math.log10(1000));
        System.out.println(Math.log(4) / Math.log(2));

    }
}
