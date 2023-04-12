package ch11;

// School 인터페이스
interface School {
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40;
    public abstract void printSchool();
}

// Student 클래스 - School 인터페이스 이용

class Student implements School {
    @Override
    public void printSchool() {
        System.out.println("Loopy University");
    }
}

class Person {
    public String name;

    public void printInfo() {
        System.out.println("Name : " + name);
    }
}

class Student2 extends Person implements School {

    public Student2(String name) {
        this.name = name;
    }

    @Override
    public void printSchool() {
        System.out.println("Zanmang University");
    }
}

public class MainTest {
    public static void main(String[] args) {

        // 인터페이스 기본 사용
        Student s1 = new Student();
        s1.printSchool();
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS);

        // 다중 상속처럼 사용
        Student2 s2 = new Student2("Loppy");
        s2.printSchool();
        s2.printInfo();
    }

}
