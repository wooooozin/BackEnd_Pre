package ch01.ch03;

import java.util.ArrayList;

public class Practice {

    // 약수
    public ArrayList<Integer> getDivisor(int num) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 1; i <= (int)num / 2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    public int getGCD(int numA, int numB) {
        int gcd = -1;

        ArrayList<Integer> divisorA = this.getDivisor(numA);
        ArrayList<Integer> divisorB = this.getDivisor(numB);

        for (int itemA : divisorA) {
            for (int itemB : divisorB) {
                if (itemA == itemB) {
                    if (itemA > gcd) {
                        gcd = itemA;
                    }
                }
            }
        }
        return gcd;
    }


    // 최소 공약수

    public int getLCM(int numA, int numB) {
        int lcm = -1;
        int gcd = getGCD(numA, numB);
        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }

        return lcm;
    }

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 6;

        Practice p = new Practice();
        ArrayList l1 = p.getDivisor(number1);
        ArrayList l2 = p.getDivisor(number2);

        System.out.println("l1 " + l1);
        System.out.println("l2 " + l2);

        System.out.println(p.getGCD(number1, number2));
        System.out.println(p.getLCM(number1, number2));

    }
}
