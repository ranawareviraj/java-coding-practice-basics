package org.example.utils;

public class GeneralUtils {
    public static void swap(int[] arr, int i, int k) {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }
}