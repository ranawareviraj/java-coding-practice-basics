package org.example.loops;

public class Loops_05_PyramidR {
    public static void main(String[] args) {

        //Solution 1
        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------");

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Pattern to print:
 ****
 ***
 **
 *
 */