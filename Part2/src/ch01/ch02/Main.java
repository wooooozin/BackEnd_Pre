package ch01.ch02;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // 1. 자바에서 집합 사용 - HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // 2. 집합 연산
        // 2-1. 교집합
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));
        HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8, 10));

//        a.retainAll(b);
        System.out.println("a ->" + a); // a ->[2, 4]

        // 2-2. 합집합
//        a.addAll(b);
        System.out.println("합집합 " + a); // 합집합 [1, 2, 3, 4, 5, 6, 8, 10]

        // 2-3. 차힙합
        a.removeAll(b);
        System.out.println("차집합 " + a); // 차집합 [1, 3, 5]



    }
}
