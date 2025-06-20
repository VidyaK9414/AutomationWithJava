//Increment and Decrement Operators
//Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//
//**Requirements:**
//- Show the difference between ++i and i++
//- Show the difference between --i and i--
//- Print values before and after operations

package Test;

public class Challenge4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Original: "+ a);
//        increment
        System.out.println("Pre -increment: "+ ++a);
        System.out.println("Post-increment: "+ a++);
//        decrement

        System.out.println("Pre-decrement:"+ --b);
        System.out.println("Post-decrement:"+ b--);
    }
}
