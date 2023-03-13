package basics;

public class StringsSimulation {
    public static void main(String[] a) {
        String testString = ".231";
        if (testString.indexOf('.') != 0) {
            System.out.println("You are in range");
        } else {
            System.out.println("You are out of range");
        }
    }
}
