package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 003,004,006 -> System.out.println("all of them are electric gadget");
            case 002,005,007 -> System.out.println("This is mech");
            default -> System.out.println("none");
        }
    }
}
