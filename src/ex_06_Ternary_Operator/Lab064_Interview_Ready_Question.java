package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int age = 26;
        // max  = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        String result = age > 21 ? (age >  25 ? "You can drink": "You can't drink") : "You can't goto GOA";
        System.out.println(result);
    }
}
