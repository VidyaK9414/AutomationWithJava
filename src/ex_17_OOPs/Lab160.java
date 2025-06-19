package ex_17_OOPs;

public class Lab160 {
    public static void main(String[] args) {
        Student std = new Student();
        //1. Student - Class Loading
        //2. s1 - Object Ref.
        //3. new Student() -> Object creation
        std.name = "vidya";
        std.rollNo = 2428;
        std.sleep();

    }
}

class Student{
    String name;
    int rollNo;

    void sleep(){
        System.out.println("Sleep method");
    }
}