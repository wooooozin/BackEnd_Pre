package ch02.ch02;

import java.util.Arrays;

class MyArray {
    int[] arr;

    // 배열 초기 사이즈 설정
    MyArray(int size) {
        this.arr = new int[size];
    }

    // insert
    public void insertData(int index, int data) {
        if (index < 0 || index > this.arr.length) {
            System.out.println("index error");
            return;
        }

        int[] arrDup = this.arr.clone();
        this.arr = new int[this.arr.length + 1];

        for (int i = 0; i < index; i++) {
            this.arr[i] = arrDup[i];
        }

        for (int i = index + 1; i < this.arr.length; i++) {
            this.arr[i] = arrDup[i - 1];
        }

        this.arr[index] = data;
    }

    // delete
    public void removeData(int data) {
        int targetIndex = -1;

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == data) {
                targetIndex = i;
                break;
            }
        }

        if (targetIndex == -1) {
            System.out.println("해당 데이터가 없습니다.");
        } else {
            int[] arrDup = this.arr.clone();
            this.arr = new int[this.arr.length - 1];

            for (int i = 0; i < targetIndex; i++) {
                this.arr[i] = arrDup[i];
            }

            for (int i = targetIndex; i < this.arr.length; i++) {
                this.arr[i] = arrDup[i + 1];
            }
        }
    }
}
public class Practice {

    public static void main(String[] args) {

        int size = 5;
        MyArray myArray = new MyArray(size);

        for (int i = 0; i < size; i++) {
            myArray.arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray.arr));

        myArray.insertData(2,20);
        System.out.println(Arrays.toString(myArray.arr));

        myArray.removeData(20);
        System.out.println(Arrays.toString(myArray.arr));


    }
}
