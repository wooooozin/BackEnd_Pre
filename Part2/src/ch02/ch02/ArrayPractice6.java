package ch02.ch02;

public class ArrayPractice6 {
    // 배열 중복 값 제거 후 새 배열 만들기
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] arrResult = new int[arr.length];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean dupFalg = false;
            for (int j = 0; j < cnt; j++) {
                if (arr[i] == arrResult[j]) {
                    dupFalg = true;
                }
            }
            if (dupFalg == false) {
                arrResult[cnt++] = arr[i];
            }
        }
        for (int j = 0; j < cnt; j++) {
            System.out.print(arrResult[j] + " ");
        }
        System.out.println();
    }
}
