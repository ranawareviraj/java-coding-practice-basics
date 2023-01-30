package org.example.java_princeton._01basics;

public class EuclideanDistance {
    public static void main(String[] args) {

        // parse x- and y-coordinates from command-line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
/*
Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).

 */