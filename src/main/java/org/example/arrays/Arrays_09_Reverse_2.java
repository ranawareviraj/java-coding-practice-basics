package org.example.arrays;

import org.example.utils.GeneralUtils;

import java.util.Arrays;

public class Arrays_09_Reverse_2 {

    public static void main(String[] args) {
        int myArray[] = {8, 6, 10, 9, 2};

        int j = myArray.length - 1;
        for (int i = 0; i < myArray.length / 2; i++) {
            GeneralUtils.swap(myArray, i, j);
            j--;
        }
        System.out.println(Arrays.toString(myArray));
    }
}