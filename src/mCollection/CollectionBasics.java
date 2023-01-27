package mCollection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

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
    }
}
