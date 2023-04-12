package ch08;

public class PersonTest {

    public static void main(String[] args) {

        // 1. 상속

        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


        // 2. super, super(), 오버라이딩
        Student2 s2 = new Student2("b", 32, 1);
        s2.printInfo();
    }

}
