package ch08;

public class Student2 extends Person {

    String name;
    int stdId;

    public Student2(String name, int age, int stdId) {
        this.name = name;
//        super.name = name; // 부모 객체의 name
        this.age = age; // 상속받은 age를 뜻함
//        super(name, age);
        this.stdId = stdId;
    }

    public void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("stdId : " + stdId);
    }

}
