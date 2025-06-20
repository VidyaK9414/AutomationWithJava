package ex_22_ENUM;

public class Lab198_ENUM_P2 {
    public static void main(String[] args) {
        System.out.println(URLs.google);
        if(URLs.google.equals("google")){
            System.out.println("I want to do something");
        }
    }
}

enum URLs{
    google, restAssured, katalon, vwo
}