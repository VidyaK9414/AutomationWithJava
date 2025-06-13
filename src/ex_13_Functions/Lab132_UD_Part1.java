package ex_13_Functions;

import java.util.Scanner;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type

        // 1.Without Argument / Parameters and Without Return Type.
        wr_wa();

        //  2. Without Parameters but With Return Type
        WP_WA();

        //  3. With Parameters and Without Return Type ( 90%)
//         multiply(20, 10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
         multiply(a, b);


        //  4. With Parameters and With Return Type

        int result = sum(8,9);
        System.out.println(result);
    }

    static void wr_wa() {
        System.out.println("Hi, how are you");
    }

   static String WP_WA() {
       System.out.println("Hi, welcome");
       return "Hi, How are you";
   }
 static void multiply(int first, int second){
        int result = first * second;
     System.out.println(result);
 }
 static int sum(int n1, int n2){
        return n1+n2;
 }


}