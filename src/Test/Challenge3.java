//Comparison and Logical Operators
//Write a program that demonstrates comparison and logical operators.
//
//**Requirements:**
//- Use comparison operators (==, !=, <, >, <=, >=)
//- Use logical operators (&&, ||, !)
//- Print boolean results with explanatory messages

package Test;

public class Challenge3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));


        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));

        //  Logical OR (||)
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));

        //  Logical NOT (!)
        System.out.println("!(a > b): " + (!(a > b)));


    }
}
