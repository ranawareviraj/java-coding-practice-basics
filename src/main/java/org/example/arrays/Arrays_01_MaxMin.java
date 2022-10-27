package org.example.arrays;

public class Arrays_01_MaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 11, 23, 10, 3, 24, 5,-5};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                arr[i] = arr[i] + max;
                max = arr[i] - max;
                arr[i] = arr[i] - max;
            }
        }
        System.out.println(max);

        System.out.println("******************");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                arr[i] = arr[i] + min;
                min = arr[i] - min;
                arr[i] = arr[i] - min;
            }
        }
        System.out.println(min);
    }

}
