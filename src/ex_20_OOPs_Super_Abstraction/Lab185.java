package ex_20_OOPs_Super_Abstraction;

public class Lab185 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50();
    }
}



abstract class Father{
    abstract void loan50();
}

class Son extends Father{
    @Override
    void loan50() {
        System.out.println("Loan given");
    }
}