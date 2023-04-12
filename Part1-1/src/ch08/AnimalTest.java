package ch08;

class Animal {
    String desc;

    Animal() {
        this.desc = "동물 클래스 입니다.";
    }

    Animal(String desc) {
        this.desc = desc;
    }

    public void printInfo() {
        System.out.println(this.desc);
    }
}

class Cat extends Animal {
    String desc;

    Cat() {
//        this.desc = "고양이 입니다.";
//        super.desc = "고양이 입니다."; 1번 방법 - 상위 클래스의 desc를 변경
        super("고양이 입니다."); // 2번 - 상위 클래스의 생성자 값을 넣어 변경
    }

    @Override // 3번 - 메서드 재정의
    public void printInfo() {
        System.out.println(this.desc);
    }
}


public class AnimalTest {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.printInfo();

    }

}
