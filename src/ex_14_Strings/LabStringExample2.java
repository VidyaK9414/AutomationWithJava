package ex_14_Strings;

public class LabStringExample2 {
    public static void main(String[] args) {
// CharSequence is an interface used to extract the substring from the string
       CharSequence str2 = "Keerthi";
       System.out.println(str2.subSequence(1,5));

//      By using String we need to add the toString()
        String str3 = "Keerthi";
        System.out.println(str3.subSequence(1,5).toString());

// By using subString()
        String str4 = "Vaishali";
        System.out.println(str4.substring(1, 4));
    }
}
