package org.example.java_princeton._01basics;

import org.jetbrains.annotations.NotNull;

public class SumOfSines {
    public static void main(String @NotNull [] args) {
        double degrees = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degrees);
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);
    }
}
/*
Write a program SumOfSines.java that takes a double command-line argument t (in degrees) and prints the value of sin(2t) + sin(3t).
 */