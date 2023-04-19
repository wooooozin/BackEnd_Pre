package ch01.ch09;

public class Practice9 {
    final static  int mod = (int) 1e9 + 7;

    public static int solution(long n) {

        return (int) (recusion(5, (n + 1) / 2) * recusion(4, n / 2) % mod);
    }

    public static long recusion(long x, long y) {
        if (y == 0) {
            return 1;
        }
        long p = recusion(x, y / 2);
        return p * p * (y % 2 > 0 ? x : 1) % mod;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
    }
}
