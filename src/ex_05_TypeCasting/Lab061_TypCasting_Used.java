package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 3.14f;
//        int total = course + GST; // Narrowing - Implicit
        int total1 = course + (int)GST; // Narrowing - Explicit
        System.out.println(total1);

//        float total2 = course+ GST; //widening - implicit
        float total3 = (float)course+GST;
        System.out.println(total3);

    }
}
