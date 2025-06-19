package ex_19_OOPs_Part2.Inheritance.SingleInheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son vidya = new Son();
        System.out.println(vidya.gold_f);
        vidya.bhk2();
        vidya.bhk3();

        Cousin c = new Cousin();
        // c.bhk3();
//        System.out.println(c.gold_f);

    }
}
