package day47_Abstraction;

import java.net.URL;

public class DriverObject {
    public static void main(String[] args) {

        String URL ="https://www.google.com";

        ChromeDriver driver =new ChromeDriver();
        driver.get(URL);


    }
}
