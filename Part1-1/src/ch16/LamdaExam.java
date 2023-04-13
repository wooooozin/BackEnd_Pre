package ch16;

interface CompareTool {
    public abstract int getMaxNum(int num1, int num2);
}

public class LamdaExam {

    public static void main(String[] args) {

        CompareTool compareTool = new CompareTool() {
            @Override
            public int getMaxNum(int num1, int num2) {
                return (num1 > num2) ? num1 : num2;
            }
        };
        System.out.println(compareTool.getMaxNum(10, 20)); // 20

        // 람다식으로 작성
        CompareTool compareToolLamda = (num1, num2) -> {return num1 > num2 ? num1 : num2;};
        System.out.println(compareToolLamda.getMaxNum(20, 10));

    }

}
