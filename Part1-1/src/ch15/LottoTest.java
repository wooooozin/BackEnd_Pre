package ch15;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class LottoTest {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        for (int i = 0; set1.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set1.add(num);
            // Math.random() 메서드는 0.0 이상 1.0 미만의 double 형태의 의사 난수(pseudo-random number)를 반환
            // Math.random() 메서드를 호출하여 0.0 이상 1.0 미만의 double 값을 반환하고,
            // 이를 45를 곱하여 0.0 이상 45.0 미만의 double 값으로 만듭니다.
            // 그리고 이 값을 int로 형변환하여 0 이상 44의 정수형 난수를 생성 + 1 해주면 1~45 난수 생성
        }

        System.out.println(set1); // [32, 18, 3, 4, 6, 28]


        LinkedList set2 = new LinkedList(set1);
        Collections.sort(set2);
        System.out.println(set2); // [3, 4, 6, 18, 28, 32]
    }
}
