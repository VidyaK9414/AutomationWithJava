package ex_20_OOPs_Super_Abstraction;

public class Lab189_Multiple_Inheritance_Solved {
    public static void main(String[] args) {
        Daughter d =new Daughter();
        d.m1();
        d.money();
        d.df();



    }
}

class Daughter implements Father1, Mother1{
    @Override
    public void money(){
        System.out.println("Money from child");
    }

    @Override
    public void f1(){
        System.out.println("f1");
    }

    @Override
    public void df() {
        Father1.super.df();
        Mother1.super.df();
    }

    @Override
    public void m1() {
        System.out.println("m1");

    }

}

interface Father1{
    void money();
    void f1();

    default void df(){
        System.out.println("Father - df");
    }
}

interface Mother1{
    void money();
    void m1();

    default void df() {
        System.out.println("Mother - df");
    }
        static void displayI(){
            System.out.println("I love you ma ");
        }
    }
