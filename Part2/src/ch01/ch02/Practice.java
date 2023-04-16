package ch01.ch02;

import java.util.ArrayList;

class MySet {
    // ArrayList
    ArrayList<Integer> list;

    // 생성자 1
    MySet() {
        this.list = new ArrayList<Integer>();
    }

    // 생정사 2
    MySet(int[] arr) {
        this.list = new ArrayList<Integer>();

        for (int item : arr) {
            this.list.add(item);
        }
    }

    // 원소 추가(중복 없이)
    public void add(int x) {
        for( int item : this.list) {
            if (item == x) {
                return;
            }
        }
        this.list.add(x);
    }


    // 교집합
    public MySet retainAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            for (int itemB : b.list) {
                if (itemA == itemB) {
                    result.add(itemA);
                }
            }
        }
        return result;
    }


    // 합집합
    public MySet addAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            result.add(itemA);
        }

        for (int itemB : b.list) {
            result.add(itemB);
        }

        return  result;
    }


    // 차집합
    public MySet removeAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            boolean containFlag = false;

            for (int itemB : b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }
            if (!containFlag) {
                result.add(itemA);
            }
        }
        return result;
    }


}

public class Practice {

    public static void main(String[] args) {
        MySet a = new MySet();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a.list);

        a = new MySet(new int[] {1, 2, 3, 4, 5});
        MySet b = new MySet(new int[] {2, 4, 6, 8, 10});

        // 교집합
        MySet result = a.retainAll(b);
        System.out.println(result.list);

        // 합집합
        result = a.addAll(b);
        System.out.println(result.list);

        // 차집합
        result = a.removeAll(b);
        System.out.println(result.list);
    }

}
