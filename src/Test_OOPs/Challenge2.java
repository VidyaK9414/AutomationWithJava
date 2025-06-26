
//Student Management System
//Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.

package Test_OOPs;
public class Challenge2 {
    public static void main(String[] args) {
        Student s = new Student("Bob", 101, 'A');
        s.stdDetails();

    }
}

 class Student{

    String name;
    int rollNo;
    char section;

    public Student(String name, int rollNo, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void stdDetails(){
        System.out.println("Student: "+ name + ", RollNo: "+rollNo + ",Section "+ section);
    }
}
