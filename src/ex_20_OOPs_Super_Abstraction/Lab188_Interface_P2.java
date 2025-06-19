package ex_20_OOPs_Super_Abstraction;

public class Lab188_Interface_P2 {
    public static void main(String[] args) {
      P n = new P();
      n.m1();
    }

}

class P implements I1, I2{
    @Override
    public void m1(){

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

interface I1{
    void m1();

}

interface I2{
    void m2();
    void m3();
}