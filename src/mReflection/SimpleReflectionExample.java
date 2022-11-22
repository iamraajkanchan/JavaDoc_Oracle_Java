package mReflection;

import java.lang.reflect.*;

public class SimpleReflectionExample {

    /**
     * printClassName method is not required at the moment.
     * */
    public void printClassName() {
        System.out.println("Class Name " + this.getClass().getSimpleName());
    }

    /**
     * Use terminal to run the main method. Follow the below steps
     * 1. Open Terminal
     * 2. Go to file Location.
     * 3. Run ### javac SimpleReflectionExample.java ### to compile the code
     * 4. Run ### java SimpleReflectionExample.java java.util.Stack ### to run the java compiled file.
     * */
    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] m = c.getDeclaredMethods();
            for (Method method : m) {
                System.out.println(method.toString());
            }
        } catch (Throwable e) {
            System.out.println(e);
        }
    }
}
