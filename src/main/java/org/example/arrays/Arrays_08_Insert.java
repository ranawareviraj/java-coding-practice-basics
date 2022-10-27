package org.example.arrays;

public class Arrays_08_Insert {
    public static void main(String[] args) {
        int[] arr = {55, 11, -1, 3, 34, 54, 32, 22, 39, 0, 0, 0};
        System.out.print("\tOriginal Array: ");
        for (int x : arr) System.out.print(x + " ");

        int n = 9;
        int noToInsert = 7;
        int insertIndex = 2;

        //Insert Element
        for (int i = n; i > insertIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[insertIndex] = noToInsert;
        System.out.print("\nArray After insert: ");
        for (int x : arr) System.out.print(x + " ");


        //Delete Element
        for (int i = insertIndex; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n]=0;
        System.out.print("\nArray After Delete: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
