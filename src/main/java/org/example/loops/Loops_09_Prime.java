package org.example.loops;

public class Loops_09_Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }

    static boolean isPrime(int n) {
        if(n==2) return true;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

