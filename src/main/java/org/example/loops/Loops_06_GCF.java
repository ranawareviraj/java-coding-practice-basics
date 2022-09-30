package org.example.loops;

public class Loops_06_GCF {
    public static void main(String[] args) {
        int n1 = 48;
        int n2 = 64;
        int temp = 0;

        if (n1 > n2) {
            temp = n2;
        } else {
            temp = n1;
        }

        while (!((n1 % temp == 0) && (n2 % temp == 0))) {
            temp--;
        }
        System.out.println(temp);

    }
}
