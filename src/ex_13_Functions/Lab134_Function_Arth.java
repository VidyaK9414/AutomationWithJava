package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)


        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the number1");
        int b= readInt(scanner, "Enter the number2");
        int result_sum = sum(a, b);
        System.out.println("Sum of the 2 number "+ a + " and " + b + " is " + result_sum);

        int result_sub = sub(a, b);
        System.out.println("Subtraction of the 2 numbers "+ a + " and " + b + " is " + result_sub);

        int result_multi = multiply(a, b);
        System.out.println("Multiplication of the 2 numbers "+ a + " and " + b + " is " + result_multi);

        int result_div = div(a, b);
        System.out.println("Division of the 2 numbers "+ a + " and " + b + " is " + result_div);

        int result_mod = mod(a, b);
        System.out.println("Mod of the 2 numbers "+ a + " and " + b + " is " + result_mod);
    }


    static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter Int only");
            System.exit(0);
            return -1; // Unreachable, but required for compilation
        }
    }

    static int sum(int n1, int n2){
        return n1+n2;
    }

    static int sub(int n1, int n2){
        return n1 - n2;
    }

    static int multiply(int n1, int n2){
        return n1 * n2;
    }

    static int div(int n1, int n2){
        if(n2 == 0){
            throw new ArithmeticException("Division by zero isn't allowed");
        }
        return n1/ n2;
    }

    static int mod(int n1, int n2){
        return n1 % n2;
    }
}
