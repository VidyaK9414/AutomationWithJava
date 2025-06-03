package ex_04_Operators;

public class Lab044_BODMAS {
    public static void main(String[] args) {
        System.out.println((9 * 3 / 9 + 1) * 3);

        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12

        /*Elaboration:
Brackets: First, any calculations within brackets are performed. If there are multiple types of brackets (round, curly, square), they are solved from the innermost to the outermost.
Orders: Next, any powers or roots (like square roots) are evaluated.
Division and Multiplication: These operations are performed in order from left to right.
Addition and Subtraction: Finally, these operations are performed from left to right.
Example:
To solve the expression (5 + 3) * 2 - 10 / 2 + 5, you would:
Brackets: (5 + 3) = 8
Multiplication: 8 * 2 = 16
Division: 10 / 2 = 5
Subtraction: 16 - 5 = 11
Addition: 11 + 5 = 16 */
    }
}
