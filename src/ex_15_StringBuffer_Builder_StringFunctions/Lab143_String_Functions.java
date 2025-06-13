package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String str = "Vidya";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
//        System.out.println(str.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 out

        // 2. concat()
        System.out.println(str.concat("Keerthi"));

        // 3. contains()
        System.out.println(str.contains("id"));

        // 4. equals()
        System.out.println(str.equals("Vidya"));

        // 5. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("vidya"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(str.indexOf("i"));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(str.length());

        // 8. replace( , )
        System.out.println(str.replace('a', 'A'));

        // 10. substring( , )
        System.out.println(str.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("VIDYA".toLowerCase());

        // 12. toUpperCase()
        System.out.println("vidya".toUpperCase());

        // 14. startsWith()
        System.out.println(str.startsWith("i"));

        // 15. endsWith()
        System.out.println(str.endsWith("a"));

        // 16. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(str.compareTo("Vidya"));


        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Pramod";
        String s21 = s11.concat("Dutta");
        System.out.println(s21);

    }
}
