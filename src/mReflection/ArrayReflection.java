package mReflection;

import java.lang.reflect.Array;

public class ArrayReflection {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.lang.String");
            Object arr = Array.newInstance(c, 4);
            Array.set(arr, 1, "This is a test");
            String arrayElement = (String) Array.get(arr, 1);
            System.out.println(arrayElement);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
