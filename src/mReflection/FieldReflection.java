package mReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldReflection {
    private double d;
    public static final int i = 36;
    String s = "testing";

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("mReflection.FieldReflection");
            Field[] classFields = c.getFields();
            System.out.println("---------------------------------------");
            for (Field classField: classFields) {
                System.out.println("Field Name: " + classField.getName());
                System.out.println("Declaring Class: " + classField.getDeclaringClass());
                System.out.println("Field Type: " + classField.getType());
                int fieldModifiers = classField.getModifiers();
                System.out.println("Field Modifier: " + Modifier.toString(fieldModifiers));
                System.out.println("---------------------------------------");
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
