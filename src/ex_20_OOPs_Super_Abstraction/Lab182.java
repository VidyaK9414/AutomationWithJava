package ex_20_OOPs_Super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
      Vehicle v = new Car();
      v.display();
      Car c = new Car();
      c.display();
    }
}

class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }

    Vehicle(){
        System.out.println("DC");
    }

    Vehicle(int a){
        System.out.println("Param cons");
    }

    Vehicle(int a, int b){
        System.out.println("Param cons");
    }

//    Method overloading same name function with different arguments.

    void message(){
        System.out.println("No return, no args");
    }

    void message(int a){
        System.out.println("PC - args");
    }

    void display(){
        System.out.println("Vehicle - parent");
    }
}


class Car extends Vehicle{
    private int maxSpeed = 280;

    Car(){
        super();
    }

    void test(){}

    Car(int a){
        System.out.println("PC car");
    }
    @Override
    void display(){
        System.out.println("Overriding the method of Vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}
