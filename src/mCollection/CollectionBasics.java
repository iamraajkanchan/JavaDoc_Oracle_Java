package mCollection;

import java.util.ArrayList;

public class CollectionBasics {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumber = new ArrayList<>();
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        System.out.println(evenNumber);
        evenNumber.add(0, 2);
        System.out.println(evenNumber);
    }
}
