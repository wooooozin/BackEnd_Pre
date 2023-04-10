package ch07;

public class AnimalTest {

    public static void main(String[] args) {

        Animal ani1 = new Animal("초코", 5.0, "푸들");
        Animal ani2 = new Animal("냥이", 3.0, "코리안숏헤어");

        ani1.showInfo();
        ani1.run();

        ani2.showInfo();
        ani2.walk();

    }
}
