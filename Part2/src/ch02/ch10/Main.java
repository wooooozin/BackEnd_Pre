package ch02.ch10;

// 해시 테이블

import java.util.Hashtable;
import java.util.Map;

public class Main {
    // 해시 함수

    public static int getHash(int key) {
        return key % 5;
    }

    public static void main(String[] args) {
        // 기본 해시테이블 사용 방법
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("key1", 10);
        hashtable.put("key2", 20);
        hashtable.put("key3", 30);
        hashtable.put("key3", 50);
        for (Map.Entry<String, Integer> item : hashtable.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        // 해시 충돌 케이스 (해시 함수 사용)
        Hashtable<Integer, Integer> ht2 = new Hashtable<>();
        ht2.put(getHash(1), 10);
        ht2.put(getHash(2), 20);
        ht2.put(getHash(3), 30);
        ht2.put(getHash(4), 40);
        ht2.put(getHash(5), 50);

        for (Map.Entry<Integer, Integer> item : ht2.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        // 충돌 후
        ht2.put(getHash(6), 60);
        for (Map.Entry<Integer, Integer> item : ht2.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }

}
