package basics.June17;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowSize {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



            driver.get("https://www.duotech.io/");

        System.out.println(driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(1000,250));

        WebElement contacts = driver.findElement(By.linkText("Contacts"));

        Assert.assertTrue(!contacts.isDisplayed());

    }
}
