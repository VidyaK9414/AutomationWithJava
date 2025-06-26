//Employee Encapsulation
//Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
package Test_OOPs;

public class Challenge3 {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Jhon Doe", 50000);
        System.out.println("Id:" + e.getId()+ " Employee Name: "+ e.getName() + " Salary: "+ e.getSal());
    }
}

class Employee{
    private int id;
    private String name;
    private long salary;
    public Employee(int id, String empName, long sal){
        this.id = id;
        this.name = empName;
        this.salary = sal;
    }

    public int getId(){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getSal(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }
}