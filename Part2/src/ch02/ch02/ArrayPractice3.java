package ch02.ch02;

import java.util.Arrays;

public class ArrayPractice3 {
    // 배열 순서 바꾸기, 추가 배열 사용하지 않기
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
