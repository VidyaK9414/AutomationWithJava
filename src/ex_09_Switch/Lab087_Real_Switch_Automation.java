package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab087_Real_Switch_Automation {

    // Web Automation
    // I will ask the user to give me the input from browser which he wants to
    // use to I will start the automation in that browser.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // computer is ready to take the input from the user via keyboard
        System.out.println("Enter the browser"); // asks user to provide the input
        String browser = scanner.next(); //read the input entered by the user and store it into 'browser' variable
        browser = browser.toLowerCase(); //converts the string values to lower case

        switch (browser){

            case ("chrome"):
                System.out.println("chrome related code will be executed");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case ("edge"):
                System.out.println("edge related TCs");
                break;
            case ("firefox"):
                System.out.println("Execute the firebox");
                break;
            default:
                System.out.println("I have no idea which browser is this");
        }
    }
}
