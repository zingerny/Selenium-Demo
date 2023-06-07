package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        //1. navigate to homepage instagram

       driver.get("https://www.instagram.com/");
//2. Enter a valid email
       WebElement usernameField =  driver.findElement(By.name("username"));
    //   usernameField.sendKeys("jb@gmail.com");

       driver.findElement(By.name("username")).sendKeys("jj@gmail.com"); // in one line
//3 Enter an invalid password
        driver.findElement(By.name("password")).sendKeys("kedhfl");
        driver.findElement(By.name("_acan _acap _acas _aj1-")).click();
// 4
// 5

    }
}