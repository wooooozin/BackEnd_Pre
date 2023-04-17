package ch01.ch05;

public class Main {

    static int getCombination(int n, int r) {
        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        return  pResult/rResult;
    }

    public static void main(String[] args) {
        // 1. 조합
        // 서로 다른 4명 중 주번 2명 선발
        int n = 4;
        int r = 2;
        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }

        System.out.println(pResult / rResult); // 6

        // 2. 중복조합
        // 후보 2명, 유권자 3명일 때 무기명 투표 경우 수
        n = 2;
        r = 3;
        System.out.println(getCombination(n+r-1, r));

    }
}
