package ex_19_OOPs_Part2.Encap;

public class Lab176 {
    public static void main(String[] args) {
//        VWOLogin log = new VWOLogin("admin", "adf@098");
//        System.out.println(log.pwd);
//        log.pwd = "pdf0@123";
//        System.out.println(log.pwd);

        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("admin", "Gfg#1234");
//        System.out.println(goodVWOLogin.pwd);
//        System.out.println(goodVWOLogin.username);
//        System.out.println(goodVWOLogin.getUsername());
//        System.out.println(goodVWOLogin.getPassword());

      goodVWOLogin.setUsername("Vidya");
      System.out.println(goodVWOLogin.getUsername());
      goodVWOLogin.setPassword("Fei&7654", true );
        System.out.println(goodVWOLogin.getPassword());


    }
}

class VWOLogin{

    public String username;
    public String pwd;

    public VWOLogin(String username, String pwd){
        this.username = username;
        this.pwd = pwd;
    }
}

class GoodVWOLogin{
    private String username;
    String pwd;

    public GoodVWOLogin( String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

        public String getPassword() {
            return pwd;
        }

        public void setPassword(String pwd, boolean isAdmin){
        if (isAdmin) this.pwd =pwd;
         else System.out.println("Not allowed to to set the password");
        }

        public String getUsername(){
        return username;
        }

        public void setUsername(String username){
         this.username = username;
        }

}