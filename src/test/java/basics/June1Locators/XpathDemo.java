package basics.June1Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.KeyFactorySpi;

public class XpathDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximizes
        driver.get("https://www.amazon.com/");

        // absolute xpath / and goes through each individual elemnt to locate the necessary lemyn
        // abs xpath can easyly break if a new change added to the page by devs..
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[2]/span/a/div[2]/span[2]")).click();

        //relative xpath uses // and locates an elemnt regardless of its location on the page



        // most common syntax //elementName[@attributeName='attributeValue']
        //span[@id='glow-ingress-line2']
        // span -> matches the first element on the page

 //       driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();

        // you can use more than one attribute if one is not enough to make the expression unique
        // input[@type='text'][placeholder='Search Amazon']

driver.findElement(By.xpath("input[@type='text'][placeholder='Search Amazon']")).
                   sendKeys("Apple Macbook pro", Keys.ENTER);

// if an element does not have any unique attributes, but has a text  you can use text to locate

    }
}
