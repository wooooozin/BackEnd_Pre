package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // 1. Stream 생성
        // 1-1. 배열 스트림
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("== 배열 스트림==");
        System.out.println("for문");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(String str : arr) {
            System.out.print(str + " ");
        }

        System.out.println("to Stream");
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach((s -> System.out.print(s + " ")));

        // 1-2. 컬렉션 스트림
        System.out.println("== 컬렉션 스트림 ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println(list1);

        Stream stream2 = list1.stream();
//        stream2.forEach(System.out::println);
        stream2.forEach(num -> System.out.println("num -> " + num));

        // 1-3. 스트림 builder
        System.out.println("==스트림 빌더==");
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build();
        streamBuilder.forEach(System.out::println);

        // 1-4. 스트림 generate
        System.out.println("== 스트림 generate ==");
        Stream streamGenerate = Stream.generate( () -> "abc").limit(3);
        streamGenerate.forEach(System.out::println);

        // 1-5. 스트리 iterate
        System.out.println("== 스트림 iterate ==");
        Stream streamIterate = Stream.iterate(10, n -> n * 2).limit(4);
        streamIterate.forEach(System.out::println);

        // 1-6. 기본 타입 스트림
        System.out.println("== 기본타입 스트림==");
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(System.out::println);


        // 2. 스트림 중개 연산
        System.out.println("== 스트림 중개 연산 ==");
        // 2-1. filtering
        System.out.println("Filter Stream");
        IntStream intStream2 = IntStream.range(1, 10).filter(n -> n % 2 == 0);
        intStream2.forEach(System.out::println);

        // 2-2. mapping
        System.out.println("== mapping Stream ==");
        IntStream intStream3 = IntStream.range(1, 10).map(n -> n + 1);
        intStream3.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 2-3. Sorting
        System.out.println("== Sorting Stream ==");
        IntStream intStream1 = IntStream.builder().add(1).add(19).add(20).add(4).build();
        IntStream intSortStream = intStream1.sorted();
        intSortStream.forEach(System.out::println);

        // 3. 최종연산
        System.out.println("최종연산");
        // 3-1. Sum, Average
        System.out.println("sum, average");
        int sum = IntStream.range(1, 5).sum();
        double average = IntStream.range(1, 5).average().getAsDouble();
        System.out.println("sum " + sum + " average " + average);

        // 3-2. Min, Max
        System.out.println("min, max");
        int min = IntStream.range(1, 5).min().getAsInt();
        int max = IntStream.range(1, 5).max().getAsInt();
        System.out.println("min " + min + " max " + max);

        // 3-3. reduce
        System.out.println("reduce");
        Stream<Integer> stream5 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)).stream();
        System.out.println(stream5.reduce((x, y) -> x + y).get()); // 15

        // 3-4. forEach
        System.out.println("forEach");
        IntStream.range(1, 10).filter(n -> n == 5).forEach(System.out::println);
    }

}
