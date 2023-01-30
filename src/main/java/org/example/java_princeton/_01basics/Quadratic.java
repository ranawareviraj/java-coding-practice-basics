package org.example.java_princeton._01basics;

public class Quadratic {

    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b * b - 4.0 * c;
        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        System.out.println(root1);
        System.out.println(root2);
    }
}
/*
ax^2 + bx + c = 0
x = (-b ± √ (b^2 - 4ac) )/2a
 */

/*
Explain how to use Quadratic.java to find the square root of a number.
Solution: to find the square root of c, find the roots of x^2 + 0x - c.
 */