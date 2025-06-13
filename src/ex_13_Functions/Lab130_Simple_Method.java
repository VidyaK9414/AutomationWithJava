package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_return();
       String a = return_type();
       System.out.println(a);

    }

    // void return type function does not return anything, only printing.

    static void non_return(){
        System.out.println("Hi, Non Return Type");
    }

    // Return type function, it will return a particular data type.

    static String return_type(){
        System.out.println("Hi, return the value");
        return "Vidya";
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float()
    {
        return 31.14f;
    }

    static long return_long(){
        return 45670L;
    }

    static byte return_byte(){
        return 127;
    }
}
