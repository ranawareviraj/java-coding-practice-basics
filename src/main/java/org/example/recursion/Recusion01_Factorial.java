package org.example.recursion;

public class Recusion01_Factorial {
    public static void main(String[] args) {
        System.out.println(computeFactorial(4));
    }

    static int computeFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }
}