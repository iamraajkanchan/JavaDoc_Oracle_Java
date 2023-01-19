package basics;

import java.io.IOException;

public class ThrowExceptionExample {
    public static void main(String[] args) {
        throwUncheckedExceptionMethod();
        try {
            throwCheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void throwUncheckedExceptionMethod() throws SecurityException {
        System.out.println("You can put me outside a try catch block");
    }

    public static void throwCheckedException() throws IOException {
        System.out.println("You must put me inside a try catch block");
    }
}
