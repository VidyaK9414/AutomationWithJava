package ex_19_OOPs_Part2.Poly.methodoverriding;



public class Vidya extends Father{
    @Override
    void home(){
        System.out.println("Vidya - 3bhk");

    }
    void v1(){
        System.out.println("Vidya - v1");
    }
}
