package ex_18_OOPs_Constructors;

public class Lab164_Car {
    public static void main(String[] args) {
        Car nexon = new Car();
        nexon.name = "Nexon";
        nexon.year = 2025;
        System.out.println(nexon.name);
        System.out.println(nexon.year);
        System.out.println(nexon.model);

        Car nano = new Car();
        nano.name ="Nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);

        LoginPage l = new LoginPage();
    }
}
