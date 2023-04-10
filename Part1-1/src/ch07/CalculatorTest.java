package ch07;


class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

}

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(1, 2);
        cal.sum(2.0, 3.5);
        cal.sum("12", "34");
        cal.sum(1, 2, 3);
    }
}
