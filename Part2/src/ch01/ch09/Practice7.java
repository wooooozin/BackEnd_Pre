package ch01.ch09;

public class Practice7 {

    static int solution(String s) {
        return isPalindrome(0, s.length() - 1, s.toCharArray(), 0);
    }

    public static int isPalindrome(int left, int right, char[] arr, int delCnt) {
        while (left < right) {
            if (arr[left] != arr[right]) {
                if (delCnt == 0) {
                    if(isPalindrome(left + 1, right, arr, 1) == 0 ||
                    isPalindrome(left, right - 1, arr, 1) == 0) {
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    return 2;
                }
            } else {
                left++;
                right--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("abba"));
        System.out.println(solution("xabba"));
        System.out.println(solution("yahha"));
    }
}
