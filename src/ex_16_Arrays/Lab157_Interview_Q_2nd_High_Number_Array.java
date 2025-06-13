package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int num[] = {34, 12, 56, 78, 100, 90};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
        System.out.println(num[num.length-3]);
        System.out.println(num[num.length-4]);
    }
}
