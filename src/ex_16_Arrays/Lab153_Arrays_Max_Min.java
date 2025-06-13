package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] array = {40, 79, 90, 120, 56, 45, 12};
        int max = array[0];
        int min = array[0];

        for (int i =0; i < array.length; i++){
            if (array[i]<min){
                min = array [i];

            }
        }
        System.out.println("Min is " + min);

        for (int i = 0; i < array.length; i++){
            if (array[i]>max){
                max = array[i];

            }
        }
        System.out.println("Max is "+ max);
    }
}

//int[] array = {40, 79, 90, 120, 56, 45, 12};
//int max = array[0];
//
//for (int num : array) {
//        if (num > max) {
//max = num;
//    }
//            }
//
//            System.out.println("Max is " + max);