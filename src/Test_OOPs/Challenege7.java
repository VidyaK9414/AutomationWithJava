//Employee Hierarchy with Salary Calculation
//Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.

package Test_OOPs;

public class Challenege7 {
    public static void main(String[] args) {
        Employee1[] emps = {new Manager(), new Developer()};
        emps[0].salCal(60000, 10000);
        emps[1].salCal(50,160);

    }
}

class Employee1{
    void salCal(int a, int b){

    };
}

class Manager extends Employee1{

@Override
    void salCal(int base, int bonus){
    int total = base + bonus;
    System.out.println("Manager Salary: "+ total);

    }
}

class Developer extends Employee1{

    @Override
    void salCal(int r, int h)
    {
        int total = r * h;
        System.out.println("Developer Salary: "+ total);
    }
}

