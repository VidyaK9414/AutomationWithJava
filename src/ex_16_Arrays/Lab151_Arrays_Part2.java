package ex_16_Arrays;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String[] names = {"Vidya", "Keerthi", "satya"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] v_names = new String[3];
        v_names[0] = "C++";
        v_names[1] = "Java";
        v_names[2] = "Python";
        System.out.println(v_names.length);
        System.out.println(v_names[0]);
        System.out.println(v_names[1]);
        System.out.println(v_names[2]);

        boolean[] b = new boolean[2];
        b[0] = true;
        b[1] = false;

    }
}
