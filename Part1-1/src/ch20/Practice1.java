package ch20;

public class Practice1 {

    public static void solution(int[] arr) {
        int idx = 0;

        for (int num : arr) {
            if (idx == 0 || num > arr[idx - 1]) {
                arr[idx++] = num;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        solution(new int[] {1, 1, 2, 2, 3, 4});
    }

}
