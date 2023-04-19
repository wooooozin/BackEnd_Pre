package ch02.ch02;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1차원 배열
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        // 2차원 배열
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2[0][2]);
        for (int[] row : arr2) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        // ArrayList - 1차원, 2차원
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        list1.add(4);
        list1.add(5);
        list1.remove(Integer.valueOf(2));
        System.out.println(list1);

        ArrayList list2D = new ArrayList();
        ArrayList listD1 = new ArrayList(Arrays.asList(1, 2, 3));
        ArrayList listD2 = new ArrayList(Arrays.asList(4, 5, 6));

        list2D.add(listD1);
        list2D.add(listD2);
        System.out.println(list2D); // [[1, 2, 3], [4, 5, 6]]
    }
}
