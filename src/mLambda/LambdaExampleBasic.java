package mLambda;

import java.util.Locale;
import java.util.Scanner;

interface GenerateRandomString {
    String convertToUpperCase(Scanner sc);
}

public class LambdaExampleBasic {

    public static void handleRandomString(GenerateRandomString paragraph) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(paragraph.convertToUpperCase(sc).toUpperCase(Locale.US));
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Please enter a valid String");
            main(null);
        }
    }

    public static void main(String[] args) {
        GenerateRandomString randomString = Scanner::nextLine;
        handleRandomString(randomString);
    }

}
