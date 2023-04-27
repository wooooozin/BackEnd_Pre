package ch02.ch11;

// 배열을 비교해 배열 내 데이터가 해시테이블에 있는지 확인
import java.util.Hashtable;

public class Practice1 {

    public static void solution(int[] arr1, int[] arr2) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i = 0; i < arr1.length; i++)  {
            ht.put(arr1[i], arr1[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (ht.contains(arr2[i])) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 2, 3, 4, 5};

        solution(arr1, arr2);
    }
}
