package org.example.loops;

public class Loops_07_Patterns {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
//                System.out.print(i+j + " ");
//                System.out.format("%02d ", (i + j));
                System.out.format("%02d ", count++);
            }
            System.out.println();
        }
    }
}
