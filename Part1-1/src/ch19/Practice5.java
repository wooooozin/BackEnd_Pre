package ch19;

public class Practice5 {

    public static int solution(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }

        int result = 1;
        int upCnt = 1;
        int downCnt = 0;
        int peak = 0;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                upCnt++;
                peak = upCnt;
                downCnt = 0;
                result += upCnt;
            } else if (ratings[i] == ratings[i - 1]) {
                upCnt = 1;
                downCnt = 0;
                peak = 0;
                result += 1;
            } else {
                downCnt++;
                upCnt = 1;
                result += downCnt;
                if (peak <= downCnt) {
                    result += 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test code
        int[] ratings = {1, 2, 3};
        System.out.println(solution(ratings));

        ratings = new int[]{3, 2, 1};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 0, 2};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 2, 2};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 3, 5, 3, 1, 3, 5, 7, 5, 3, 1, 0};
        System.out.println(solution(ratings));
    }
}
