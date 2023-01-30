/******************************************************************************
 *  Compilation:  javac CartesianToPolar.java
 *  Execution:    java CartesianToPolar x y
 *
 *  Read in Cartesian coordinates (x, y) and print out polar coordinates
 *  (r, theta).
 *
 *  %  java CartesianToPolar 3.0 4.0
 *  r     = 5.0
 *  theta = 0.9272952180016122
 *
 ******************************************************************************/
package org.example.java_princeton._01basics;

public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        System.out.println("r     = " + r);
        System.out.println("theta = " + theta);
    }

}
/*
Polar coordinates. Write a program CartesianToPolar.java that converts from Cartesian to polar coordinates. Your program should take two real numbers x and y on the command line and print the polar coordinates r and θ. Use the Java method Math.atan2(y, x), which computes the arctangent value of y/x that is in the range from -π to π.
https://mathworld.wolfram.com/PolarCoordinates.html
 */