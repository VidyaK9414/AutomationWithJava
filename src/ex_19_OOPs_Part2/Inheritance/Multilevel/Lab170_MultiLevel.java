package ex_19_OOPs_Part2.Inheritance.Multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son s = new Son();
        Father f = new Father();
        GF grandfather = new GF();

        Son s1 = new Son();
//        Son s2 = new Father();
        Father f2 = new Son(); //Dynamic Dispatch
        GF gf1 = new Son();
        GF gf2 = new Father();
//      Son s3 = new GrandFather();

    }
}
