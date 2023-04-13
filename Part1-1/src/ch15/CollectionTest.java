package ch15;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        // 1. List
        // 1-1.ArrayList
        System.out.println("==ArrayLIst==");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3); // 값 추가
        System.out.println("list1 -> " + list1);
        list1.remove(Integer.valueOf(3)); // 특정 값 삭제
        System.out.println("list1 -> " + list1);
        list1.add(0, 10); // 특정 인덱스 값 추가
        System.out.println("list1 -> " + list1);
        System.out.println(list1.size()); // 길이
        System.out.println(list1.contains(2)); // 특정 값 있는지 확인
        System.out.println(list1.indexOf(10)); // 위치 확인

        // 1-2.LinkedList
        System.out.println("==LinkedList==");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.addFirst(0);
        list2.addLast(4);
        System.out.println(list2); // [0, 1, 2, 3, 4]
        list2.remove(Integer.valueOf(2));
        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2); // [1, 3]
        System.out.println(list2.size()); // 2

        // 2. Set
        // 2-1. HashSet
        System.out.println("==HashSet==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.remove(1);
        System.out.println(set1); // [2, 3]
        set1.add(2);
        set1.add(3);
        System.out.println(set1); // [2, 3]
        System.out.println(set1.size());
        System.out.println(set1.contains(1));

        // 2-2. TreeSet
        System.out.println("==TreeSet==");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println(set2);
        set2.clear();
        System.out.println(set2);

        set2.add(10);
        set2.add(5);
        set2.add(25);
        set2.add(35);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(25)); // 입력값 보다 작은 데이터중 최대값 출력 5, 10 중 10이 최대값이라 10 출력
        System.out.println(set2.higher(10)); // 입력값 보다 큰 데이터 중 최소값 출력 25, 35 중 25가 최소값이라 25 출력

        // 3. Map
        // 3-1.HashMap - 키 밸류 값
        System.out.println("==HashMap==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println(map1); // {1=kiwi, 2=apple, 3=mango}

        map1.remove(2);
        System.out.println(map1); // {1=kiwi, 3=mango}
        System.out.println(map1.get(3)); // mango

        // 3-2. TreeMap
        System.out.println("==TreeMap==");
        TreeMap map2 = new TreeMap();
        map2.put(10, "kiwi");
        map2.put(5, "apple");
        map2.put(15, "mango");
        map2.put(25, "banana");
        System.out.println(map2); // {5=apple, 10=kiwi, 15=mango}
        System.out.println(map2.firstKey());
        System.out.println(map2.lastKey());
        System.out.println(map2.lowerEntry(15)); // 10=kiwi, 15보다 작은 키값의 최대 키값 10 > 5
        System.out.println(map2.higherEntry(10)); // 15=mango, 10보다 작은 키값의 최소 키값 15 > 25
    }

}
