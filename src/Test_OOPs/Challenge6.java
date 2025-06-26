
//Vehicle Inheritance Hierarchy
//Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.

package Test_OOPs;

public class Challenge6 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};
        vehicles[0].start();
        vehicles[1].start();

    }
}

class Vehicle {
   void start(){

    }
}
class Car extends Vehicle {
    void start(){
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike engine starts with a purr!");
    }
}
