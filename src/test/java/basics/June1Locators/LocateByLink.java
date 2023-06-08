package basics.June1Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLink {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximizes

        driver.get("https://www.duotech.io/");

        //driver.findElement(By.linkText("LMS")).click();
        driver.findElement(By.partialLinkText("Cont")).click();


    }
}



