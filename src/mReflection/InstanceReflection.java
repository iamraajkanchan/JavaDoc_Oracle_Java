package mReflection;

class InstanceReflectionA {
}

/**
 * InstanceReflection is used to check if the class declared has its instance.
 * */
public class InstanceReflection {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("mReflection.InstanceReflectionA");
            boolean b1 = c.isInstance(35);
            System.out.println(b1); // Because c is not a class of
            boolean b2 = c.isInstance(new InstanceReflectionA());
            System.out.println(b2);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
