package ch08;

public class Person {

    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("===printInfo===");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
