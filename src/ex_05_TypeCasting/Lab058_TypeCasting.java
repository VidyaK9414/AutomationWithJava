package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte a = 10;
        int  b = a; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int)a; // Widening Explicit Casting (int) - optional
    }
}
