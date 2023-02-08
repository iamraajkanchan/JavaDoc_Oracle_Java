package mStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsIterateAndGenerate {
    public static void main(String[] args) {
        Stream<String> wordsStream = Stream.of("Hello World", "Hello Brother", "Hello Dear");
        List<String[]> uniqueWordStream = wordsStream.map(words -> words.split(" ")).collect(Collectors.toList());
        uniqueWordStream.forEach(System.out::println);
    }
}
