package ch07;

public class Car {
    // Car class - 객체 변수, 메서드

    String name;
    String type;

    // 생성자
    public Car() { System.out.println("Car 기본 생성자 출력"); }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("Car 생성자 출력");
    }

    // 메서드
    public void printCarInfo() {
        System.out.println("Car name: " + name);
        System.out.println("Car type: " + type);
    }

    public void move() {
        System.out.println("MOVE!!");
    }

    public void brake() {
        System.out.println("STOP!!");
    }

}
