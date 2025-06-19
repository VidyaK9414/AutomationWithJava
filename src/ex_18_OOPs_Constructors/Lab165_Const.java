package ex_18_OOPs_Constructors;

public class Lab165_Const {
    public static void main(String[] args) {
//        Default constructor will be called
        Car2 nano = new Car2();
        System.out.println(nano.model);
        System.out.println(nano.year);

        Car2 tesla = new Car2("Tesla", 2024 );
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car2 mghector = new Car2("mghector");
        System.out.println(mghector.model);

    }
}
