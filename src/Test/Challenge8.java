//Leap Year Checker
//Write a program to check if a given year is a leap year.
//
//**Requirements:**
//- A year is leap if it's divisible by 4
//- Exception: if divisible by 100, it's not leap unless also divisible by 400
//- Use logical operators in conditions

package Test;
import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Input the year
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                // Check leap year using logical operators
                boolean isLeap = (year % 4 == 0) && ( (year % 100 != 0) || (year % 400 == 0) );

                // Print result
                if (isLeap) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is NOT a Leap Year.");
                }

                scanner.close();
            }
        }


