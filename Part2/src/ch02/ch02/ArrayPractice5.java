package ch02.ch02;

public class ArrayPractice5 {
    // 배열 오름차순으로 출력
    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 6, 1};
        int[] visited = new int[arr.length]; // 원소 선택여부 확인
        int visitedCnt = 0;
        int minValue = Integer.MAX_VALUE;
        int minIdx = -1;

        while (visitedCnt < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minValue && visited[i] == 0) {
                    minValue = arr[i];
                    minIdx = i;
                }
            }

            if (minIdx != -1) {
                System.out.print(minValue + " ");
                visited[minIdx] = 1;
                visitedCnt++;
            }

            minValue = Integer.MAX_VALUE;
            minIdx = -1;
        }



    }
}
