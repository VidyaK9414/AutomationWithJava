package ex_19_OOPs_Part2.Poly.methodoverloading;

public class Lab174_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3,4);
        System.out.println(r1);
        int r2 = m1.add(5, 6,10);
        System.out.println(r2);
       double r3 =  m1.add(43.89, 34.90);
        System.out.println(r3);
    }
}
