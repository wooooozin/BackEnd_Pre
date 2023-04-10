package ch07;

public class Car {
    // Car class - 객체 변수, 메서드
    static int serialNum = 0;
    String name;
    String type;

    // 생성자
    public Car() {
        System.out.println("Car 기본 생성자 출력");
        serialNum++;
    }

    public Car(String name, String type) {
        serialNum++;
        this.name = name;
        this.type = type;
        System.out.println("Car 생성자 출력");
    }

    // 메서드
    public void printCarInfo() {
        System.out.println("Car name: " + name);
        System.out.println("Car type: " + type);
    }

    public void printCarInfo(String date) {
        this.printCarInfo();
        System.out.println("date :" + date);
    }

    public void printCarInfo(int number) {
        this.printCarInfo();
        System.out.println("number :" + number);
    }

    public void printCarInfo(String date, int number) {
        this.printCarInfo();
        System.out.println("date :" + date);
        System.out.println("number :" + number);
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public void move() {
        System.out.println("MOVE!!");
    }

    public void brake() {
        System.out.println("STOP!!");
    }

}
