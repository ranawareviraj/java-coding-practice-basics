package org.example.recursion;

public class Fibonacci {
    static long[] cache;

    public static void main(String[] args) {
        int n = 5;
        cache = new long[n + 1];
        System.out.println(fibonacciOptimized(n));
        System.out.println(fibonacci(n));

    }

    static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static long fibonacciOptimized(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (cache[n] != 0) {
            return cache[n];
        }

        long result = fibonacciOptimized(n - 1) + fibonacciOptimized(n - 2);
        cache[n] = result;
        return result;
    }
}