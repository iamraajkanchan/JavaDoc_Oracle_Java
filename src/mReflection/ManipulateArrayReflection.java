package mReflection;

import java.lang.reflect.Array;

public class ManipulateArrayReflection {
    public static void main(String[] args) {
        try {
            int[] dims = new int[]{5, 10, 15};
            Object mArray = Array.newInstance(Integer.TYPE, dims);
            Object mArrayObject = Array.get(mArray, 3);
            Class<?> c = mArrayObject.getClass().getComponentType();
            System.out.println(c);
            mArrayObject = Array.get(mArrayObject, 5);
            Array.setInt(mArrayObject, 10, 37);
            int[][][] mArrayCast = (int[][][]) mArrayObject;
            System.out.println(mArrayCast[3][5][10]);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
