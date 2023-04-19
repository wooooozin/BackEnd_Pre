package ch01.ch09;

public class Practice10 {

    static StringBuffer sb;
    public static void solution(int n) {
        sb = new StringBuffer();

        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        hanoi(n - 1, start, to, mid);
        sb.append(start + " " + to + "\n");

        hanoi(n - 1, mid, start, to);
    }

    public static void main(String[] args) {
        solution(2);
        System.out.println();

        solution(3);
        System.out.println();

        solution(4);
        System.out.println();

    }
}
