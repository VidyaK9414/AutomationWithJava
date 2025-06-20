package ex_23_Wrapper_Class;

public class Lab203_Wrapper_Conversion {
    public static void main(String[] args) {
        String num ="10";
        int a = 19;


//        String -> Wrapper conversion
        Integer a1 = Integer.parseInt(num);//parseX()
//        Double.parseDouble(), Float.parseFloat();

//        String to primitive data types
        int a2 = Integer.parseInt(num);

//        String to Integer wrapper class
        Integer aa = Integer.valueOf(num);
        System.out.println(aa);


        Integer wi = 20;
        String s = wi.toString();
        System.out.println(s);
        System.out.println(s instanceof String);

    }
}
