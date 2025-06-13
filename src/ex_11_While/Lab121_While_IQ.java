package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        // Factorial Program

        // The logic building formula we are discussing.
        // Step number one, you have to figure out what is the data type for input and output.
        // Step number two, write a rough logic around this.
        // Step number three, write a proper logic around this.
        // Step number four, optimize.
        // Step number five, which is edge cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program");
        System.out.println("Enter the number to find the factorial");
        if(!scanner.hasNextInt()){
            System.out.println("Enter only the integer number");
        }

        int num = scanner.nextInt();
        long fact = 1L;

        if (num == 0){
            System.out.println("Factorial ->" + fact);
        }

        if (num > Integer.MAX_VALUE){
            System.out.println("You have entered the number which is out of range");
        }

        int i = 1;
        while (i <= num){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
