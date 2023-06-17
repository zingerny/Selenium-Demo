package basics.June13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // implicit wait is usually added once at the beginning of the script
        // and it is implicitly applicable to all findElement/s method call

        driver.get("https://www.cars.com/");

        WebElement usedNewDropdown = driver.findElement(By.id("make-model-search-stocktype1"));
        //If the element is not found right away, WebDriver tries to locate the elemnt within the indicated wait time




    }
}
