package ex_19_OOPs_Part2.Poly.methodoverriding;

public class REALExample {
    public static void main(String[] args) {
        TC_Chrome ch = new TC_Chrome();
        ch.openBrowser();
        CommTOAllTC t = new CommTOAllTC();
        t.openBrowser();

    }
}


class CommTOAllTC{
    void openBrowser(){
        System.out.println("Open the Browser");
    }
}


class TC_Chrome extends CommTOAllTC{
    @Override
    void openBrowser(){
        System.out.println("Starting a chrome");
        //new ChromeDriver();
    }
}