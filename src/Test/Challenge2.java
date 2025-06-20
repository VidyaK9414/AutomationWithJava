
//Arithmetic and Assignment Operators
//Create a Java program that demonstrates various arithmetic and assignment operators.
//
//**Requirements:**
//- Use +, -, *, /, % operators
//- Demonstrate assignment operators (=, +=, -=, *=, /=)
//- Show the results of each operation
package Test;

public class Challenge2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = 0;

        result = a + b;
        System.out.println("Addition:" +result);

        result = a - b;
        System.out.println("Subtraction: "+ result);

        result = a * b;
        System.out.println("Multiplication: "+result);

        result = a / b;
        System.out.println("Division: "+ result);

        result = a % b;
        System.out.println("Modulus: "+result);
    }
}
