package mStatic;

public class StaticAlternateSource {
    StaticAlternateSource() {
        System.out.println(StaticSourceClass.myName("Raj Kanchan"));;
    }

    public static String getClassName() {
        return "StaticAlternateSource";
    }
}
