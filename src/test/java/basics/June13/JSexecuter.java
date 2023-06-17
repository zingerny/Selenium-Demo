package basics.June13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecuter {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click()", driver.findElement(By.xpath(""));

 // sendkeys
 JavascriptExecutor js =(JavascriptExecutor)driver;
 js.executeScript("alert, ('hello kitty');");

 

    }
}
