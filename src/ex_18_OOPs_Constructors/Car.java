package ex_18_OOPs_Constructors;

public class Car {
    String name;
    int year;
    String model;

//    Default constructor
    Car(){
        name = "unknown";
        year = 0;
        model = "XXX";
        System.out.println("DC");
    }
}
