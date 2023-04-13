package ch16;

interface ComputeTool {
    int compute(int x, int y);
//    int compute2(int x, int y); 추상 메서드가 두개이상이면 람다식 사용에 제한이 있음.
}
public class LamdaTest {

    public static void main(String[] args) {

        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };
        System.out.println(cTool1.compute(1, 2));


        // 람다식

        ComputeTool cTool2 = (x, y) -> {return x + y;};
        System.out.println(cTool2.compute(1, 2));
    }

}
