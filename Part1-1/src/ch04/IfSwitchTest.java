package ch04;

public class IfSwitchTest {

    public static void main(String[] args) {

        // 1. if문
        int waterTemp = 99;

        if (waterTemp >= 100) {
            System.out.println("물이 끓습니다.");
        } else {
            System.out.println("물을 끓이는 중입니다.");
        }

        int score = 90;
        char grade = 0;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(grade);


        // 2. switch
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println(fruit + "는 1000원입니다.");
                break;
            case "Banana":
                System.out.println( fruit + "는 1200원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }

        // number값이 홀수인지 짝수인지 판단하는 코드를 작성하시오
        int number = 3;

        boolean isOdd = (number % 2 != 0) ? true : false;
        System.out.println(isOdd);

        // 위 score를 switch문으로 바꿔보자
        score = 90;
        grade = 0;

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println(grade);
    }

}
