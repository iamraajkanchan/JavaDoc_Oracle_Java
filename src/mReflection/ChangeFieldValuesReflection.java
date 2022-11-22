package mReflection;

import java.lang.reflect.Field;
/**
 * Reference:
 * https://www.oracle.com/technical-resources/articles/java/javareflection.html#:~:text=Reflection%20is%20a%20feature%20in,its%20members%20and%20display%20them.
 * */


public class ChangeFieldValuesReflection {
    public double d;

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("mReflection.ChangeFieldValuesReflection");
            Field classField = c.getDeclaredField("d");
            ChangeFieldValuesReflection changeFieldValuesReflection = new ChangeFieldValuesReflection();
            System.out.println("d = " + changeFieldValuesReflection.d);
            classField.setDouble(changeFieldValuesReflection, 12.23);
            System.out.println("d = " + changeFieldValuesReflection.d);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
