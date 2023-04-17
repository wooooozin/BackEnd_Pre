package ch01.ch06;

public class Main {

    static int recursion1(int n) {
        if (n == 1) {
            return 1;
        }
        return 3 * recursion1(n - 1);
    }

    static int recursion2(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursion2(n - 1);
    }

    static int recursion3(int n) {
        if (n < 3) {
            return 1;
        }
        return recursion3(n - 2) + recursion3(n - 1);
    }

    public static void main(String[] args) {

        // 점화식 -> 반복문, 재귀함수
        // 1, 3, 9, 27...의 n번째 수
        int n = 4;
        int result = 1;
        for (int i = 0; i < n; i++) {
            if(i == 0) {
                result = 1;
            } else {
                result *= 3;
            }
        }

        System.out.println(result); // 27

        // 재귀함수
        int result1 = recursion1(4);
        System.out.println(result1); // 27

        // 1, 2, 3, 4... n번째 까지의 합
        System.out.println(recursion2(10)); // 55

        // 피보나치 수열 1, 1, 2, 3, 5, 8, 11...n번쨰 수
        n = 6;
        result = 0;
        int a1 = 1;
        int a2 = 1;

        if( n < 3) {
            result = 1;
        } else {
            for (int i = 2; i < n; i++) {
                result = a1 + a2;
                a1 = a2;
                a2 = result;
            }
        }

        System.out.println(result); // 8
        System.out.println(recursion3(6)); // 8
    }
}
