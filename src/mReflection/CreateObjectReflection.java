package mReflection;

import java.lang.reflect.Constructor;

public class CreateObjectReflection {
    public CreateObjectReflection() {
    }

    public CreateObjectReflection(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("mReflection.CreateObjectReflection");
            Class<?>[] parameterTypes = new Class<?>[2];
            parameterTypes[0] = Integer.TYPE;
            parameterTypes[1] = Integer.TYPE;
            Constructor<?> classConstructor = c.getConstructor(parameterTypes);
            Object[] argumentList = new Object[2];
            argumentList[0] = 10;
            argumentList[1] = 20;
            Object returnedObject = classConstructor.newInstance(argumentList);
            System.out.println(returnedObject);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
