package ex_17_OOPs;

public class Lab159 {
    public static void main(String[] args) {
        ATBx vidya = new ATBx();
        // Class - ATBx
        // Object Ref - amit
        // Object -> new ATBx();
        vidya.gender = "F";
        vidya.doAssignment();

        ATBx keerthi = new ATBx();
        keerthi.name = "Keerthi";
        keerthi.speak();
    }
}
