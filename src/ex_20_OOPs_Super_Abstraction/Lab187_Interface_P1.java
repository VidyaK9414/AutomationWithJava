package ex_20_OOPs_Super_Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
       Car2 c2 = new Car2();
       c2.display();
    }
}

class Car2 implements Breaks,Engine1{

    void display(){
        startEngine();
        applyBreak();
        testEngine();
        stopEngine();
    }

    @Override
    public void applyBreak(){
        System.out.println("Apply break");
    }

    @Override
    public void startEngine(){
        System.out.println("Start the engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stop the engine");
    }

    @Override
    public void testEngine() {
        System.out.println("Method overridden by Car2");
    }
}

interface Breaks{
    void applyBreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("concreate ");
    }
}