package ch09;

public class MainTest {

    public static void main(String[] args) {
        // 1. 다형성
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student();
//        Student s2 = new Person(); 불가
        p1.print();
        s1.print();
        s1.print2();
        p2.print();
//        p2.print2(); 불가 - 타입 기준으로 메서드 사용

        Person p3 = new CollegeStudent();
        p3.print();


        // 2. 타입 변환

        Person pp1 = null;
        Person ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅

        ss1 = (Student)pp3; // 다운캐스팅

        // 3. instanceof

        System.out.println(pp2 instanceof Person); // true
        System.out.println(pp2 instanceof Student); // false

        if (pp2 instanceof Student) {
            Student student = (Student)pp2;
         }
    }

}
