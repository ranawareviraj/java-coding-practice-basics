package org.example.arrays;

public class Arrays_10_Increment {

    public void arrayToUppercase(String[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }
    }

    public void arrayToIncrement(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i]+1;
        }
    }
}