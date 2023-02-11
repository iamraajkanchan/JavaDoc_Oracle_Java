package mCollection;

import java.io.StringReader;
import java.util.*;

public class CollectionBasics {

    public static void main(String[] args) {
        ArrayList<Integer> evenNumber = new ArrayList<>();
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        System.out.println("ArrayList :: " + evenNumber);
        evenNumber.add(0, 2);
        System.out.println(evenNumber);
        LinkedList<Integer> oddNumber = new LinkedList<>();
        oddNumber.add(3);
        oddNumber.add(5);
        oddNumber.add(7);
        System.out.println("LinkedList :: " + oddNumber);
        oddNumber.add(0, 1);
        int[] integerArray = new int[5];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 4;
        StringBuffer myBuffer = new StringBuffer("1,3,4");
        System.out.println("Original Value for StringBuffer: " + myBuffer);
        StringBuffer reverseBuffer = myBuffer.reverse();
        System.out.println("Reversed Value for StringBuffer: " + reverseBuffer);

        StringBuilder myBuilder = new StringBuilder("1,2,3");
        System.out.println("Original Value for StringBuilder: " + myBuilder);
        StringBuilder reverseBuilder = myBuilder.reverse();
        System.out.println("Reversed Value for StringBuilder: " + reverseBuilder);
    }
}
