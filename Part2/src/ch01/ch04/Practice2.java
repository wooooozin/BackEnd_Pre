package ch01.ch04;

import java.util.Arrays;

public class Practice2 {

    void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {

        if (depth == r) {
            System.out.println(Arrays.toString(out));
        }

        for (int i = 0; i < n; i++) {
            if(visited[i] != false) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, visited, out);
                visited[i] = false;
            }
        }

    }

    public static void main(String[] args) {

        int n = 4;
        int r = 3;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];
        int[] out = new int[r];
        Practice2 p = new Practice2();
        p.permutation(arr, 0, n, r, visited, out);

    }
}
