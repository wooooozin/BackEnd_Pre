package ch02.ch02;

public class ArrayPractice2 {
    // 배열에서 target에 해당하는 값으 인덱스를 출력
    // 해당값이 여러개라면 가장 큰 인덱스 출력

    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int target = 100;
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (i > idx) {
                    idx = i;
                }
            }
        }

        if (idx >= 0) {
            System.out.println(idx);
        } else {
            System.out.println("찾는 값이 없습니다.");
        }
    }
}
