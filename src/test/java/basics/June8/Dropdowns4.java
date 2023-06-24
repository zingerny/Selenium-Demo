package basics.June8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dropdowns4 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.southwest.com/");

        // Verify

     driver.findElement(By.xpath("//div[@class='calendar-month']//span[.='17']/parent::button")).click();



    }
}