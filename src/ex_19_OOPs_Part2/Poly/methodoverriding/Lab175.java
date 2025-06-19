package ex_19_OOPs_Part2.Poly.methodoverriding;

public class Lab175 {
    public static void main(String[] args) {
        Vidya v = new Vidya();
        v.home();
        v.v1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Vidya();
        f2.home();
    }
}
