package mReflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodReflection {

    /**
     * getInteger is a Proxy method created for learning purpose.
     * */
    public int getInteger(Object b, int x) throws NullPointerException {
        if (b == null) {
            throw new NullPointerException();
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("mReflection.MethodReflection");
            Method[] classMethods = c.getDeclaredMethods();
            System.out.println("-----------------------------------------");
            for (Method method : classMethods) {
                System.out.println("Method Name: " + method.getName());
                System.out.println("Class Name: " + method.getDeclaringClass());
                Class<?>[] methodParameters = method.getParameterTypes();
                for (Class<?> parameter : methodParameters) {
                    System.out.println("Parameter Name: " + parameter.getName());
                }
                Class<?>[] methodExceptions = method.getExceptionTypes();
                for (Class<?> exceptionType : methodExceptions) {
                    System.out.println(exceptionType.getName());
                    System.out.println("Exception Type: " + Arrays.toString(exceptionType.getDeclaredMethods()));
                }
                System.out.println("Return Type: " + method.getReturnType());
                System.out.println("-----------------------------------------");
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
