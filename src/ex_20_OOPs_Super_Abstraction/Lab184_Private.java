package ex_20_OOPs_Super_Abstraction;

public class Lab184_Private {
}

class XYZ{
    protected int m_gold = 100;

}
class ABC extends XYZ{
    void display(){
        System.out.println(super.m_gold);
    }
}