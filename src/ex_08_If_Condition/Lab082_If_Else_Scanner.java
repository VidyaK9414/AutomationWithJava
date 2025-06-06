package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {

        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age>18) {
            System.out.println("You can vote!");
        }
        else {
            System.out.println("You can't vote!");
        }
        }
    }

