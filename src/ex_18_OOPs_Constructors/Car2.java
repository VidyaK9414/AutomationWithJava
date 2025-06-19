package ex_18_OOPs_Constructors;

public class Car2 {
    String model;
    int year;

    Car2(){
        model = "XXX";
        year = 2025;
        System.out.println("DC");
    }

    Car2( String m_name, int y){
        this.model = m_name;
        this.year = y;
    }

    Car2( String model_name){
        this.model = model_name;
    }
}
