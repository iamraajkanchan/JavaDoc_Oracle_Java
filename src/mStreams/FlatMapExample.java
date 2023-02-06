package mStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> avengers = Arrays.asList("Iron Man", "Hulk", "Captain America", "Black Widow", "Black Panther", "Falcon", "Spider Man");
        List<Integer> lengthCount = avengers.stream().map(String::length).toList();
        System.out.println(lengthCount);
        List<String> avengerAlphabets = avengers.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().toList();
        System.out.println(avengerAlphabets);
        List<Integer> firstElementList = Arrays.asList(1, 2, 3);
        List<Integer> secondElementList = Arrays.asList(3, 4);
        firstElementList.forEach(System.out::print);
        System.out.println();
        secondElementList.forEach(System.out::print);
        System.out.println();
        List<int[]> composeList = firstElementList.stream().flatMap(i -> secondElementList.stream().map(j -> new int[]{i, j})).toList();
        composeList.forEach(System.out::println);
        IntStream numbersTo99 = IntStream.range(1, 100);
        System.out.println();
        IntStream numbersTo100 = IntStream.rangeClosed(1, 100);
        numbersTo100.forEach(i -> System.out.print(" " + i));
    }
}
