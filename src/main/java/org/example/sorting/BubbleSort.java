package org.example.sorting;

import static org.example.utils.GeneralUtils.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 4, 5, 3, 23};
        sortArray(arr);
    }

    static int[] sortArray1(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    static int[] sortArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
}