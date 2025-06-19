package ex_21_Static;

import ex_19_OOPs_Part2.Poly.methodoverriding.Vidya;

public class Lab193_Static_P2 {
    public static void main(String[] args) {
        ATB vidya = new ATB(8978654350L,"Vidya" );
        ATB satya = new ATB(9909786655L, "Satya");
        System.out.println(vidya.phone_no);
        System.out.println(satya.phone_no);
        System.out.println(ATB.course_name);
        System.out.println(vidya.course_name);
        ATB.markAttendance();

    }
}

class ATB{
    long phone_no;
    String std_name;
    static String course_name = "ATB";

    public ATB(long phoneNo, String stdName){
        this.phone_no = phoneNo;
        this.std_name = stdName;
    }

    void display(){
        System.out.println(phone_no + std_name + course_name);
    }

    static void markAttendance(){
        System.out.println("Mark the attendance");
    }
}
