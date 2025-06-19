package ex_20_OOPs_Super_Abstraction;

public class New {
    public static void main(String[] args) {
        Vehicle1 v = new Car1();

        v.display();
//        Car1 c = (Car1) v;
//        c.speed();
    }
}


    class Vehicle1 {
        void display() {
            System.out.println("Vehicle display");
        }
    }

    class Car1 extends Vehicle1 {
        @Override
        void display() {
            System.out.println("Car display");
        }

        void speed() {
            System.out.println("Speed: 280");
        }
    }


