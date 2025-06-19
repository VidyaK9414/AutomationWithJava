package ex_19_OOPs_Part2.accessModifer.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
        jrCop.canIShoot();
        System.out.println(jrCop.gun);
    }
}
