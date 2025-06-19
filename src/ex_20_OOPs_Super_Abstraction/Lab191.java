package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Vidya v = new Satya(); // Dynamic Dispatch with Interface
        v.display();
        Satya s = new Satya();

    }


}


//Dynamic dispatch only works for overridden methods — methods that are declared in the parent class and overridden in the child class.
//
//If a method exists only in the child class, you cannot call it using a parent-type reference.


class Satya implements Vidya{
    @Override
    public void display(){
        System.out.println(a);
    }
}
interface Vidya{
    int a = 10;
    void display();
}