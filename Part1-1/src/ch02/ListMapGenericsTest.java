package ch02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class ListMapGenericsTest {

    public static void main(String[] args) {

        // 1. 자료형 - 리스트(List)
        System.out.println("=== List ====");
        // 1-1. add
        ArrayList l1 = new ArrayList(); // 타입을 지정해 주지 않아 어떤 타입이던 들어갈 수 있음
        l1.add(1);
        l1.add("Hello");
        l1.add(3);
        l1.add(4);
        l1.add("world");
        System.out.println(l1);
        l1.add(0, "11");
        System.out.println(l1);

        // 1-2. get - 인덱스 값
        System.out.println(l1.get(3));

        // 1-3. size - 길이
        System.out.println(l1.size());

        // 1-4. remove - 특정인덱스 또는 값을 삭제할 수 있음
        System.out.println(l1.remove(Integer.valueOf(4)));
        System.out.println(l1);

        // 1-5. clear - 모두 삭재
        l1.clear();
        System.out.println(l1);

        // 1-6. sort - 오름차순, 내림차순
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(3);
        intList.add(2);
        intList.add(6);
        intList.add(1);

        System.out.println(intList);
        intList.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(intList); // [1, 2, 3, 6]
        intList.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(intList); // [6, 3, 2, 1]

        // 1-7. contains - 속해있는지 확인
        System.out.println(intList.contains(1)); // true
        System.out.println(intList.contains(10)); // false


        System.out.println("=== Map ===");
        // 2. 자료형 - HashMap, 키 밸류 값으로 이루어진 자료형, 순서는 반영되지 않음, 키값을 통해 접근
        HashMap map = new HashMap();

        // 2-1. put
        map.put("키위", "12000");
        map.put("바나나", "2000");
        map.put("대파", "3000");
        System.out.println(map); // {키위=12000, 대파=3000, 바나나=2000}

        // 2-2. get
        System.out.println(map.get("키위")); // 12000
        System.out.println(map.get("귤")); // null

        // 2-3. size
        System.out.println(map.size()); // 3

        // 2-4. remove

        map.remove("키위"); // 12000
        map.remove("귤"); // null
        System.out.println(map); // {대파=3000, 바나나=2000}

        // 2-5. containKey, containsValue
        System.out.println(map.containsKey("대파")); // true
        System.out.println(map.containsKey("귤")); // false
        System.out.println(map.containsValue("3000")); // true


        // 3. Generics - 자료형을 명시적으로 지정, 제한적일 수 있지만 안정성을 높여주고 형변환을 줄여줌
        ArrayList<String> l4 = new ArrayList<String>();
        l4.add("안녕");
        l4.add("하");
        l4.add("세요");
//        l4.add(1);
        System.out.println(l4); // [안녕, 하, 세요]

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("고구마", 1200);
        System.out.println(map2); // {고구마=1200}


    }

}
