package ch02.ch11;

import java.util.Arrays;
import java.util.Hashtable;

public class Practice2 {
    public static int[] solution(int[] numbers, int target) {
        int[] result = new int[2];
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i = 0; i < numbers.length; i++) {
            if (ht.containsKey(numbers[i])) {
                result[0] = ht.get(numbers[i]);
                result[1] = i;
                return result;
            }

            ht.put(target - numbers[i], i);
            System.out.println(ht);
        }

        return null;
    }


    public static void main(String[] args) {
        int[] arr1 = {7, 11, 5, 3};
        System.out.println(Arrays.toString(solution(arr1, 10)));
    }
}
