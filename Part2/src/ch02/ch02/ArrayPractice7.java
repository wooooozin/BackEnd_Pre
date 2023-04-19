package ch02.ch02;

public class ArrayPractice7 {
    // 90도 회전

    static void printArr(int[][] arr) {
        for (int[] item1D : arr) {
            for (int item : item1D) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[][] arrResult = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int r = arr.length - 1 - i;
                arrResult[j][r] = arr[i][j];
            }
        }

        printArr(arrResult);
    }
}
