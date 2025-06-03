package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int vidya_sal = 12;
        boolean result =(!(vidya_sal > 10 || vidya_sal < 5));
        System.out.println(result);


        // A - vidya_Sal > 10 -> 12 > 10 -> true
        // B -> vidya_sal < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
