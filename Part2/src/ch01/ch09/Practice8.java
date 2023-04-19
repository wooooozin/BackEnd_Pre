package ch01.ch09;

public class Practice8 {

    public static String solution(String eq) {
        String[] parts = eq.split("=");
        int[] leftSide = evaluate2(parts[0]);
        int[] rightSide = evaluate2(parts[1]);

        if (leftSide[0] == rightSide[0] && leftSide[1] == rightSide[1]) {
            return "Infinite solutions";
        } else if (leftSide[0] == rightSide[0]) {
            return "No solution";
        } else {
            return "x=" + (rightSide[1] - leftSide[1] / (leftSide[0] - rightSide[0]));
        }
    }

    public static int[] evaluate(String str) {
        int[] result = new int[2];
        boolean isMinus = false;
        int idx = 0;

        while (idx != str.length()) {
            char c = str.charAt(idx++);

            if (c == '+') {
                continue;
            }
            if (c == '-') {
                isMinus = true;
                continue;
            }

            if(c == 'x') {
                result[0] += isMinus ? -1 : 1;
            } else {
                if (idx < str.length() && str.charAt(idx) == 'x') {
                    result[0] += isMinus ? -(c - '0') : (c - '0');
                } else {
                    result[1] += isMinus ? -(c - '0') : (c - '0');
                }
            }
            isMinus = false;
        }

        return result;
    }

    public static int[] evaluate2(String str) {
        int[] result = new int[2];
        for (String s : str.split("(?=[+-])")) {
            if (s.equals("+x") || s.equals("x")) {
                result[0]++;
            } else if (s.equals("-x")) {
                result[0]--;
            } else if (s.contains("x")) {
                result[0] += Integer.parseInt(s.substring(0, s.length() -1));
            } else {
                result[1] += Integer.parseInt(s);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String eq = "x+5-3+x=6+x-2";
        System.out.println(solution(eq));

        eq = "x=x";
        System.out.println(solution(eq));

        eq = "2x=x";
        System.out.println(solution(eq));
    }

}
