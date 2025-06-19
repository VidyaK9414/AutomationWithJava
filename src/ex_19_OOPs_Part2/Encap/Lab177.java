package ex_19_OOPs_Part2.Encap;

public class Lab177 {
    public static void main(String[] args) {
  ICICI b = new ICICI("Vidya", 1000);
        System.out.println(b.getBal());
        b.setBal(2000, false);
        System.out.println(b.getBal());
        System.out.println(b.bankName);

    }
}

class ICICI{
    private String name;
    private long bal;
    public String bankName = "ICICI";

  ICICI(String n, long b){
      this.name = n;
      this.bal = b;
  }
  public String getName(){
      return name;
  }

  public void setName(String name){
      this.name = name;
  }

  public long getBal(){
      return bal;
  }

  public void setBal(long bal, boolean isCashier){
      if(isCashier) this.bal = bal;
      else System.out.println("Not allowed to change the bal");
  }
}