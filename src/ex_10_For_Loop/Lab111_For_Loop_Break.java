package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
          System.out.println(i);
            if (i==5){
              System.out.println(i);
                break;
            }
//       System.out.println(i);
        }
    }
}
