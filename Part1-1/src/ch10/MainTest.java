package ch10;

// 추상 클래스
abstract class Person {
    abstract void printInfo();
}

// 추상 클래스 상속
class Student extends Person {

    @Override
    void printInfo() {
        System.out.println("Studetn.printInfo()");
    }
}
public class MainTest {

    public static void main(String[] args) {

//      Person p1 = new Person();
        Student s1 = new Student();
        s1.printInfo();

        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo()");
            }
        };

        p2.printInfo();
    }

}
