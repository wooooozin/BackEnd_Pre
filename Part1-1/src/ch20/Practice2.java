package ch20;

import java.util.ArrayList;

public class Practice2 {

    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int index = Math.abs(numbers[i]) - 1;

            if (numbers[index] < 0) {
                list.add(Math.abs(index + 1));
            }
            numbers[index] = -numbers[index];
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
    }
}
