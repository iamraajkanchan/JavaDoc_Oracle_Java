package mStatic;

public class StaticDestinationClass {
    public static void main(String[] a) {
        System.out.println(StaticSourceClass.myName("Surya Shukla"));
        StaticAlternateSource staticAlternateSource = new StaticAlternateSource();
    }
}
