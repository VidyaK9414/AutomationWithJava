package ex_20_OOPs_Super_Abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.display();

    }
}

class WagonR extends Engine implements Tyre,Gear{
    void display(){
        startEngine();
        rubberTyre();
        blackColourDoToTyre();
        changeGear();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting the Engine");

    }
     @Override
     public void rubberTyre(){
         System.out.println("rubber tyre");
     }

    @Override
    public void blackColourDoToTyre() {
        System.out.println("black colour");
    }
    @Override
    public void changeGear(){
        System.out.println("Change Gear");
    }

    @Override
    void stopEngine() {
        super.stopEngine();
    }
}

abstract class Engine{
    abstract void startEngine();

    void stopEngine(){
        System.out.println("Stop Engine");
    }
}

interface Tyre{
    void rubberTyre();
    void blackColourDoToTyre();

    // JDK >11 This feature
    default void m2(){

    }

    default void m3(){

    }

    static void m4(){

    }
}

interface Gear{
    void changeGear();
}
