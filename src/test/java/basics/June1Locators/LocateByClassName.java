package basics.June1Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximizes

        driver.get("https://www.duotech.io/");

        WebElement element = driver.findElement(By.className("link-4"));

        // class name method can only use one class time

        System.out.println(element.getText());

        List<WebElement> elements = driver.findElements(By.className("link-4"));

        for (WebElement webElement : elements) {
            System.out.println(webElement.getText());
        }

        // Q.What is the difference between findElement and findElements ?
        //   findElement throws noSuchElementException if element is not found
        //   findElements return an empty list if elements are not found

    }
}