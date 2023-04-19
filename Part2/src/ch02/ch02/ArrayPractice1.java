package ch02.ch02;

public class ArrayPractice1 {
    // 짝수 데이터들의 평균과 홀수 데이터들의 평균을 출력

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int oddCnt = 0;
        int evenCnt = 0;
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCnt++;
                evenSum += arr[i];
            } else {
                oddCnt++;
                oddSum += arr[i];
            }
        }

        System.out.println("홀수 평균" + ((double)oddSum / (double)oddCnt));
        System.out.println("짝수 평균" + ((double)evenSum / (double)evenCnt));

    }
}
