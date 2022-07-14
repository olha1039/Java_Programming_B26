package day24_05_04_2022.browserTask;

public class BrowserObjects {
    public static void main(String[] args) {

        System.out.println("======= CHROME =======");

        Chrome chrome = new Chrome();
        chrome.open();
        chrome.navigate("www.google.com");
        chrome.refresh();
        chrome.close();

        System.out.println("======= SAFARI =======");

        Chrome safari = new Chrome();
        safari.open();
        safari.navigate("www.google.com");
        safari.refresh();
        safari.close();

    }
}
