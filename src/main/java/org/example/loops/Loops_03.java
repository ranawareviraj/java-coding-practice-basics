package org.example.loops;

import java.util.Scanner;

public class Loops_03 {
    static int choice = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getChoice(scanner);

        while (choice == 1) {
            System.out.println("Enter Marks 0-100");
            int marks = scanner.nextInt();
            if (marks >= 90) System.out.println("This is Good");
            if (marks >= 60 && marks <= 89) System.out.println("This also is Good");
            if (marks >= 0 && marks <= 59) System.out.println("This also is Good");
            getChoice(scanner);
        }
    }

    private static void getChoice(Scanner scanner) {
        System.out.println("Enter a 1 to find if marks are good, 0 to exit");
        choice = scanner.nextInt();
    }
}

/*
Make a menu-driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
 */
