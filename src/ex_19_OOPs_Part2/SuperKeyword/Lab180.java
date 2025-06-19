package ex_19_OOPs_Part2.SuperKeyword;

import java.util.BitSet;

public class Lab180 {}

    class BaseClass{
        private String browser;

        public BaseClass(String browser){
            this.browser = browser;
        }
        public String getBrowser(){
            return browser;
        }

        public void setBrowser(String browser, boolean isAdmin){
            if(isAdmin) this.browser = browser;
            else System.out.println("Change browser isn't allowed");
        }

        void openBrowser(){
            System.out.println("Opening the browser");
        }
        void openBrowser(String browser){
            System.out.println("Open Browser"+ browser);
        }

        void closeBrowser(){
            System.out.println("Close Browser!");
        }
        void bhk3(){}
    }

    class TestCase extends BaseClass{

    public void tc(){}

        public TestCase(String browser){
        super(browser);
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();
        super.bhk3();

        this.tc();
        }
    }



