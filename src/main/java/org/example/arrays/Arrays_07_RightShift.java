package org.example.arrays;

public class Arrays_07_RightShift {
    public static void main(String[] args) {
        int[] arr = {55, 11, -1, 3, 34, 54, 32, 22, 39, 2, 0, -5};
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
