package ch09;

// 빵빵
// 위이잉
// 삐뽀삐뽀 출력

class Car {
    Car() {}
    public void horn() {
        System.out.println("빵빵");
    }
}

class FireTruck extends Car {
    public void horn() {
        System.out.println("위이잉");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀삐뽀");
    }
}
public class PracticeTest {

    public static void main(String[] args) {

        // 방법 1
        Car car = new Car();
        car.horn();

        car = new FireTruck();
        car.horn();

        car = new Ambulance();
        car.horn();

        // 방법 2
        Car carArr[] = {new Car(), new FireTruck(), new Ambulance()};

        for (Car item : carArr) {
            item.horn();
        }
    }

}
