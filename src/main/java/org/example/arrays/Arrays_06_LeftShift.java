package org.example.arrays;

public class Arrays_06_LeftShift {
    public static void main(String[] args) {
        int[] arr = {55, 11, -1, 3, 34, 54, 32, 22, 39, 2, 0 - 5};
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}