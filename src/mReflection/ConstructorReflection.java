package mReflection;

import java.lang.reflect.Constructor;

public class ConstructorReflection {
    public ConstructorReflection() {
    }

    public ConstructorReflection(int i, double d) {

    }

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("mReflection.ConstructorReflection");
            Constructor<?>[] classConstructors = c.getDeclaredConstructors();
            System.out.println("------------------------------------------");
            for (Constructor<?> cConstructor : classConstructors) {
                System.out.println("Constructor Name: " + cConstructor.getName());
                Class<?>[] parameterTypes = cConstructor.getParameterTypes();
                for (Class<?> parameterType : parameterTypes) {
                    System.out.println("Parameter Name: " + parameterType.getName());
                    System.out.println("Parameter Type: " + parameterType.getTypeName());
                }
                Class<?>[] exceptionTypes = cConstructor.getExceptionTypes();
                for (Class<?> exceptionType : exceptionTypes) {
                    System.out.println("Exception Name: " + exceptionType.getName());
                    System.out.println("Exception Type: " + exceptionType.getTypeName());
                }
                System.out.println("------------------------------------------");
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
