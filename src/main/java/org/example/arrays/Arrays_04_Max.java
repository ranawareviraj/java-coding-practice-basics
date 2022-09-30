package org.example.arrays;

public class Arrays_04_Max {
    public static void main(String[] args) {
        int[] arr = {55, 11, -1, 3, 34, 54, 32, 22, 39, 2, 0 - 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is: " + max);
    }
}
