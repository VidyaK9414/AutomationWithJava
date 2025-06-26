//Bank Account Encapsulation
//Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods with proper validation.

package Test_OOPs;

public class Challenge4 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);
        ba.deposit(500);
        ba.withdraw(200);

    }
}

class BankAccount{
    private long balance;


    public BankAccount(long bal){
        this.balance = bal;
        System.out.println("Initial balance: "+ bal);

    }

 void deposit(int depo){
        if(depo <= 0){
            System.out.println("Negative deposit");
        } else {
            balance += depo;
            System.out.println("Balance after deposit: "+ balance);
        }
 }

  void withdraw (int withdraw){
        if(balance <= 0){
            System.out.println("insufficient balance: " + balance);
        }
        else{
            balance -= withdraw;
            System.out.println("Balance after withdraw: " + balance);
        }

  }

}