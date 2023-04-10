package ch02;

public class StringTest {
    public static void main(String[] args) {

        // 1. 자료형 - 문자열
        String str = "Hello world!";
        String str1 = "123";
        System.out.println(str + str1);

        // 1-1 equals - 문자열의 값이 같은지 비교
        String s1 = "HI"; // 리터럴값은 상수풀에 존재해 s1, s2가 같은 HI를 가리키고 있음
        String s2 = "HI";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        String s3 = new String("HI"); // new 하게되면 새로운 객체를 만들어서 저장
        System.out.println(s2.equals(s3)); // true, 값이 같은지 비교
        System.out.println(s2 == s3); // false , == 은 객체를 비교하는 것

        // 1-2 indexOf - 문자열에서 특정 문자열의 위치를 찾는 메서드
        String s4 = "Hello! Wordl!";
        System.out.println(s4.indexOf("!")); // 5
        System.out.println(s4.indexOf("!", s4.indexOf("!") + 1)); // 12

        // 1-3 replace
        String s5 = s4.replace("Hello", "Bye");
        System.out.println(s5);

        // 1-4 substring - begin Index 부터 범위 전까지 출력, 문자를 포함하고 싶다면 + 1
        System.out.println(s5.substring(0, 3)); // Bye
        System.out.println(s5.substring(0, s5.indexOf("!") + 1));

        // 1-5 toUpperCase, toLowerCase
        System.out.println(s5.toUpperCase());

        // 2. 자료형 - StringBuffer - 문자열의 변경이 잦다면 StringBuffer를 사용하는게 좋음, 객체가 유지되면서 사용됨
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println(sb1);
        sb1.append("56789");
        System.out.println(sb1);

        String a = "01234";
        String b = "56789";
        System.out.println(a + b); // 새로운 객체를 만들어내 데이터를 할당, 메모리 생성이 잦다.

        // 3. 배열
        int[] intArr = {1, 2, 3, 4, 5};
        int[] intArr2 = new int[5]; // 값을 초기화 하지 않아 0이 할당되어 있음
        String[] strArr = new String[3];
        strArr[0] = "A";
        strArr[1] = "B";
        strArr[2] = "C";

        for (int i : intArr) {
            System.out.println(i);
        }

        for (int i : intArr2) {
            System.out.println(i);
        }

        for (String s : strArr) {
            System.out.println(s);
        }
    }

}
