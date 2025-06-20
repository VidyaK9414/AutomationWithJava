package ex_22_ENUM;

public class APIURL {
    public static void main(String[] args) {
        System.out.println(APIURLS.katalon.getUrl());
    }
}

enum APIURLS{
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;
    APIURLS(String URL){
        this.url = URL;
    }

    String getUrl(){
        return this.url;
    }
}
