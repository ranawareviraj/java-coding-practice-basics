package org.example.sorting;


import java.util.Arrays;

public class MergeSort {

    private static int[] merge(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        int index;
        int[] combinedArray = new int[array1.length + array2.length];
        for (index = 0; i < array1.length && j < array2.length; index++) {
            if (array1[i] < array2[j]) {
                combinedArray[index] = array1[i++];
            } else if (array2[j] < array1[i]) {
                combinedArray[index] = array2[j++];
            }
        }

        while (i < array1.length) {
            combinedArray[index++] = array1[i++];
        }
        while (j < array2.length) {
            combinedArray[index++] = array2[j++];
        }

        return combinedArray;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 7, 8, 9};
        int[] array2 = {2, 4, 5, 6,10,11};

        System.out.println(Arrays.toString(merge(array1, array2)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */

    }


}