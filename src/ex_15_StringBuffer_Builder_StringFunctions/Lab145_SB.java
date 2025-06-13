package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Vidya");
        stringBuilder = stringBuilder.append("Keerthi");
        System.out.println(stringBuilder);

        String s1 = "Vidya";
        s1 = s1 +"Keerthi";
        System.out.println(s1);
    }
}
