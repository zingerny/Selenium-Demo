package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
//1. Navigate to homepage
        driver.get("https://www.instagram.com/");

//2. Verify that the url of the homepage is "https://www.instagram.com/"


        String expectedUrl = "https://www.instagram.com/";
        String actualUrl = driver.getCurrentUrl(); //gets a string

Assert.assertEquals(actualUrl, expectedUrl);

//3.Verify that the  user is on the homepage by checking if the homepage contains text " Don't have an account?"

        String expectedText = "Don't have an account ?";
        //before grabbing the html code of the page, wait 1 sec
        Thread.sleep(1000);
        String pageSourceCode = driver.getPageSource();
Assert.assertTrue(pageSourceCode.contains(expectedText));

// driver.close();//only closes currently open window
driver.quit();// closes all open windows/tabs
    }
}

