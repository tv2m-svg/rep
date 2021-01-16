
package javaapplication3;


public class Mylib {

    public static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                --i;
            }
            array[i + 1] = key;
        }

    }

    public static void insertionSortDown(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] < key) {
                array[i + 1] = array[i];
                --i;
            }
            array[i + 1] = key;
        }

    }

    public static boolean isFind(int[] ar, int key) {
        for (int elem : ar) {
            if (elem == key) {
                return true;
            }
        }
        return false;
    }

    public static int[] intersectionOfArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        int sizeC = 0;
        for (int elem : a) {
            if (isFind(b, elem)) {
                c[sizeC++] = elem;
            }
        }
        int[] d = new int[sizeC];
        for (int i = 0; i < sizeC; ++i) {
            d[i] = c[i];
        }
        return d;
    }

    public static int[] unionOfArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int sizeC = a.length;
        for (int i = 0; i < sizeC; ++i) {
            c[i] = a[i];
        }
        for (int elem : b) {
            if(!isFind(a,elem)){
                c[sizeC++] = elem;
            }
        }
        int[] d = new int[sizeC];
        for (int i = 0; i < sizeC; ++i) {
            d[i] = c[i];
        }
        return d;
        
    }
}
