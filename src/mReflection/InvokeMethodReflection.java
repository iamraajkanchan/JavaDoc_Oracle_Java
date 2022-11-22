package mReflection;

import java.lang.reflect.Method;

public class InvokeMethodReflection {
    public int addParameters(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("mReflection.InvokeMethodReflection");
            Class<?>[] methodParameterTypes = new Class<?>[2];
            methodParameterTypes[0] = Integer.TYPE;
            methodParameterTypes[1] = Integer.TYPE;
            Method addMethod = c.getMethod("addParameters", methodParameterTypes);
            Object[] argumentList = new Object[2];
            argumentList[0] = 12;
            argumentList[1] = 24;
            /**
             * This instance is used to bind the method with the class.
             * */
            InvokeMethodReflection invokeMethodReflection = new InvokeMethodReflection();
            Object returnValue = addMethod.invoke(invokeMethodReflection, argumentList);
            System.out.println( returnValue);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
