package ch17;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam {

    public static void main(String[] args) {

        // 1 - 10 숫자 중 짝수 들의 합
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // for 문일 때
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);

        // 스트림 사용
        int sum2 = IntStream.range(1, 11).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);

    }
}
