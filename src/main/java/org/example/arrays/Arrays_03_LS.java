package org.example.arrays;

import java.util.Scanner;

public class Arrays_03_LS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to search: ");
        int key = scanner.nextInt();

        int[] arr = {12, 11, -1, 3, 34, 54, 32, 22, 39, 2, 0 - 5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found key at index: " + i);
                System.exit(0);
            }
        }
        System.out.println("Key not found..!");
    }
}
