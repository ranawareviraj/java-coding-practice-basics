package org.example.sorting;

import static org.example.utils.GeneralUtils.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 4, 5, 3, 23};
        sortArray(arr);
    }

    static int[] sortArray(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(arr, i, minIndex);
            }
        }
        return arr;
    }
}

/* SELECTION SORT
         A  : array of items
         n  : size of list

         for i = 0 to A.length-2
            minIndex = i
            for j = i+1 to n
               if A[j] < A[minIndex] then
                   minIndex = j;
            if indexMin != i
                swap A[minIndex] and A[i]
*/