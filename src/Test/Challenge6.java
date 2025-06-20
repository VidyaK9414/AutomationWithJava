//Number Classification
//Write a program to check if a number is positive, negative, or zero.
//
//**Requirements:**
//- Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case

package Test;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        if(scanner.hasNext()){
            System.out.println("Enter only Integer");
        }
        int input = scanner.nextInt();

        if(input > 0){
            System.out.println(input + " is positive");
        } else if (input < 0) {
            System.out.println(input + " is negative");
        } else {
            System.out.println(input + " is zero");
        }
    }
}
