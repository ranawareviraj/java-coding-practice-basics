package org.example.loops;

public class Loops_06_Power {
    public static void main(String[] args) {
        int n = 2;
        int mult = 1;
        for (int i = 1; i <= 5; i++) {
            mult = n * mult;
        }
        System.out.println(mult);
    }
}
