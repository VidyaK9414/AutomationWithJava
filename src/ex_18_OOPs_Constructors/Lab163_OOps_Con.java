package ex_18_OOPs_Constructors;

public class Lab163_OOps_Con {
    public static void main(String[] args) {
        A b = new A();


    }
}

class A{
    A(){
        System.out.println("I want to read csv file");
        System.out.println("Open the page before loading the scrips");
        System.out.println("Can be done anything at the time of object is created");
        //        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}