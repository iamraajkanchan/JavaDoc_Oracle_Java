package mStatic;

public class StaticDestinationClass {
    public static void main(String[] a) {
        System.out.println(StaticSourceClass.myName("Surya Shukla"));
        StaticAlternateSource staticAlternateSource = new StaticAlternateSource();
        // An object of a class can access a static method, it is not recommended, and it is also not mentioned in the list of recommendations by a lint.
        System.out.println(staticAlternateSource.getClassName());;
    }
}
