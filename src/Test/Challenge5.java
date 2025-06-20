
//Operator Precedence and Type Casting
//Write a program that demonstrates operator precedence and type casting in Java.
//
//**Requirements:**
//- Show operator precedence with complex expressions
//- Demonstrate implicit and explicit type casting
//- Print results with explanations
package Test;

public class Challenge5 {
    public static void main(String[] args) {
        int result = 5 + 2 * 3 + 6 / 2;

        int expressionResult = 5 + 2 * 3 + (8 / 2) * 2;
        expressionResult = 5 + 6 * 3 - 4 + 8 / 2;

        int intVal = 13;
        double implicitCast = intVal + 0.5;

        double doubleVal = 13.5;
        int explicitCast = (int) doubleVal;

        System.out.println("Expression result: " + expressionResult);
        System.out.println("Implicit casting: " + implicitCast);
        System.out.println("Explicit casting: " + explicitCast);
    }
}
