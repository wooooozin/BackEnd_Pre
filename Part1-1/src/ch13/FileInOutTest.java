package ch13;

import java.io.*;

public class FileInOutTest {

    public static void main(String[] args) throws IOException {
        // 1. 파일 쓰기
        // FileWriter
        FileWriter fileWriter = new FileWriter("./memo.txt");
        String memo = "안녕하세요1.\n";
        fileWriter.write(memo);
        String memo2 = "반가워요!1\n";
        fileWriter.write(memo2);
        fileWriter.close();

        // PrintWriter
        PrintWriter printWriter = new PrintWriter("./memo.txt");
        printWriter.println(memo);
        printWriter.println(memo2);
        printWriter.close();

        // 2. 파일 이어쓰기
        FileWriter fileWriter1 = new FileWriter("./memo.txt", true);
        memo = "날씨 맑음\n";
        fileWriter1.write(memo);
        fileWriter1.close();

        PrintWriter printWriter1 = new PrintWriter(new FileWriter("./memo.txt", true));
        memo2 = "날씨 흐릴거야";
        printWriter1.println(memo2);
        printWriter1.close();

        // 3. 파일 입력
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./memo.txt"));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        bufferedReader.close();



    }
}
