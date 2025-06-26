//Person Class Implementation
//Create a class "Person" with attributes "name" and "age". Create two instances and print their details.

package Test_OOPs;

public class Challenge1 {
    public static void main(String[] args) {
        Person p = new Person("John",25);
        Person p1 = new Person("Alice", 30);
        p.displayDetails();
        p1.displayDetails();
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayDetails(){
        System.out.println("Name: " + name+ " Age: " + age);
    }
}