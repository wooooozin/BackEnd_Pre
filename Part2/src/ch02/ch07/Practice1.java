package ch02.ch07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

// 카드 섞기
// 1. 가장 위의 카드는 버린다
// 2. 그 다음 위의 카드는 쌓여있는 카드의 가장 아래에 다시 넣는다.
// 3. 한 장이 낭믈 때 까지 반복
public class Practice1 {

    public static int findLastCard(int N) {
        Queue queue = new LinkedList();
        IntStream.range(1, N + 1).forEach( x -> queue.add(x));
        System.out.println(queue);

        while (queue.size() > 1) {
            queue.remove();
            int data = (int)queue.remove();
            queue.add(data);
            System.out.println(queue);
        }

        return (int)queue.remove();
    }

    public static void main(String[] args) {
        System.out.println(findLastCard(7));
    }

}
