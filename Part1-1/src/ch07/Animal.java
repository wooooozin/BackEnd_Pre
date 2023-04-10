package ch07;

public class Animal {

    String name;
    Double weight;
    String classification;

    public  Animal() { }

    public Animal(String name, Double weight, String classification) {
        this.name = name;
        this.weight = weight;
        this.classification = classification;
    }

    public void showInfo() {
        System.out.println(name +"은 몸무게가 " + weight + " 이고 종은 " + classification + "입니다.");
    }

    public void eat() {
        System.out.println("묵자묵자!");
    }

    public void sleep() {
        System.out.println("잠자기");
    }

    public void walk() {
        System.out.println("걷기");
    }

    public void run() {
        System.out.println("뛰기");
    }

}
