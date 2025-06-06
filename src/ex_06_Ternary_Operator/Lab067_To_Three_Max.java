package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 12;
        int n3 = 11;

        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(max);
    }


}