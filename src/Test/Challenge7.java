
//Find Largest of Three Numbers
//Create a program to find the largest among three numbers using if-else statements.
//
//**Requirements:**
//- Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
package Test;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        // 🔍 Logic to find the largest
        if (a == b && b == c) {
            System.out.println("All three numbers are equal: " + a);
        } else if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }

        scanner.close();
    }
}

