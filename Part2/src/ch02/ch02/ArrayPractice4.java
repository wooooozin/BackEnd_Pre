package ch02.ch02;

public class ArrayPractice4 {
    // 피크값 출력 - 좌우 값 보다 큰 값
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            } else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    } // 3 6 5 10 11
}
