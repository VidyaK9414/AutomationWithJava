package ex_19_OOPs_Part2.accessModifer.Police;

public class Cop {
    protected int gun;
    String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, you can shoot");
    }
}
