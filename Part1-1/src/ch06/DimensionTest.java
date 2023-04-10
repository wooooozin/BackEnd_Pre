package ch06;

public class DimensionTest {

    public static void main(String[] args) {


        // 일차원 배열
        int[] arr1 = {1, 2, 3};
        for (int num : arr1) {
            System.out.println(num);
        }

        // 이차원 배열
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2[1][0]);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }

        // 연습문제 - 3x3 행렬, 원소를 1로 변경하고 대각 원소는 10으로 변경
        int[][] testArr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < testArr.length; i++) {
            for (int j = 0; j < testArr[i].length; j++) {
                if (i == j) {
                    testArr[i][j] = 10;
                    continue;
                }
                 testArr[i][j] = 1;

            }
        }

        for (int[] preNum : testArr) {
            for (int anNum : preNum) {
                System.out.println(anNum);
            }
        }

    }


}
