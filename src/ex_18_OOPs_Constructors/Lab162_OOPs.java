package ex_18_OOPs_Constructors;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;

    }
}
class Baby{
    String name;

    Baby(){
        System.out.println("I'm called, when the object is created");
    }
}
