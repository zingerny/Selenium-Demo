package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver(); // initiates a browser session

        driver.get("https://www.duotech.io/"); // navigates to specific URL

        String expected = "Software QA Automation Engineer program | SDET | QA School | Software Testing";

        String actualTitle = driver.getTitle();

//        if(actualTitle.equalsIgnoreCase(expected)){
//            System.out.println("Test Passed");
//        }else{
//            System.out.println("Test failed");
//            System.out.println("expected: " + expected);
//            System.out.println("actual: "+actualTitle);
//        }
// instead of using If loop use asserted
 Assert.assertEquals(actualTitle, expected); // always have actual, then expected. not other way around!

    }
}
