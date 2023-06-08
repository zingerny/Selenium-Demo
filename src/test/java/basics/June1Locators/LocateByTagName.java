package basics.June1Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByTagName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximizes
        driver.get("https://www.duotech.io/");



        System.out.println( driver.findElement(By.tagName("h1")).getText());

        List<WebElement> links =   driver.findElements(By.tagName("a"));
        System.out.println(links.size() + " links on the page");
        links.forEach(s-> System.out.println(s.getText()));
        //  taskkill /f /im chrome.exe


    }
}



