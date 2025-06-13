package ex_16_Arrays;

import java.util.Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int[] marks = {120, 94, 89, 78, 76, 66};
        boolean[] isMarriedPeople = {true, false, true};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
//        System.out.println(marks[-1]);
//        System.out.println(marks[10]);


        char c = 'A';
        String name = "vidya";
        char[] chars = name.toCharArray();
        System.out.println(Arrays.toString(chars));
//        String[] name_each_element_char = name.split("");
//        System.out.println(Arrays.toString(name_each_element_char));
//        System.out.println(c);
    }
}
