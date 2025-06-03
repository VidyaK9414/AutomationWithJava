package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = false;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c= a || b;
        System.out.println(c);

        boolean c1 = a && b;
        System.out.println(c1);
    }
}
