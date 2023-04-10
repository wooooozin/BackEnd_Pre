package ch07;

public class CarTest {

    public static void main(String[] args) {

        // 클래스의 사용
        Car myCar = new Car();
        myCar.name = "붕붕이";
        myCar.type = "mini suv";
        myCar.printCarInfo();
        myCar.move();
        myCar.brake();

        // Car2 클래스 사용
        Car myCar2 = new Car("방방이", "ben");
        myCar2.printCarInfo();
    }

}
