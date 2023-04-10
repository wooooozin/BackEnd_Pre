package ch05;

public class LoopTest {

    public static void main(String[] args) {

        // 1. 반복문
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
//                continue; // 실행하지 않고 다음 순환으로 넘어감
                break; // 조건을 만족하면 반복문 종료
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for each
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        // while
        int i = 0;
        while (i < 5) {
            System.out.println("while : " + i);
            i++;
        }

        i = 0;
        while (i < 5) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println("while : " + i++);
        }

        // do-while
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);


        // 별찍기
        for (int k = 0; k < 8; k++) {
            if (k % 2 == 0) {
                continue;
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 물끓이기
        int temp = 0;

        while (temp < 100) {
            temp++;
            if(temp % 10 == 0) {
                System.out.println(temp +" 도 입니다.");
            }
        }
    }

}
