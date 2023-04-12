package ch12;

class Outer {
    public void print() {
        System.out.println("outer.print");
    }

    class Inner {
        public void innerPrint() {
            Outer.this.print();
        }
    }

    static class InnerStaticClass {
        void innerPrint() {
//            Outer.this.print();
        }
    }

}

abstract class Person {
    public abstract void printInfo();
}

public class InnerClassTest {

    public static void main(String[] agrs) {
        // 외부 클래스
        Outer outer = new Outer();

        // 내부 클래스 - 인스턴스
        Outer.Inner inner = new Outer().new Inner();

        // 내부 클래스 - 정적
        Outer.InnerStaticClass innerStaticClass = new Outer.InnerStaticClass();

        // 익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
    }

}
