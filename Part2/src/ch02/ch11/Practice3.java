package ch02.ch11;

import java.util.HashMap;
import java.util.Hashtable;

// HashTable, HashMap
public class Practice3 {

    public static void main(String[] args) {
            // HashTable
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(10, 10);
        System.out.println(ht);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 20);
        System.out.println(map.get(0));

//        ht.put(null, -999);
//        System.out.println(ht.get(null)); error
        map.put(null, -999);
        System.out.println(map.get(null));

        // 공통 : 둘다 map 인터페이스를 구현한 것
        // 차이 - null 을 key값으로 사용할 수 있는지 여부
        //     - ht -> 멀티 스레드 환경에서 우수 / map -> 싱글 스레드에서 우수
        // synchronizedMap, ConcurrentHashMap(스레드 세이프 하지 않음)
    }
}
