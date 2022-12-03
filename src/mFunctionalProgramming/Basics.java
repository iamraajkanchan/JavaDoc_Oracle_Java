package mFunctionalProgramming;

import java.util.List;

public class Basics {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("=================================================");
        System.out.println("Example of Imperative Programming");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number * 2);
            }
        }
        System.out.println();
        System.out.println("=================================================");
        System.out.println("Example of Functional Programming");
        numbers.stream().filter(number -> number % 2 == 0).map(number -> number * 2).forEach(System.out::print);
        System.out.println();
        System.out.println("=================================================");
    }
}
