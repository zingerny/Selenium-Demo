package June10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WebTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        driver.findElement(By.linkText("View all products")).click();

// verify table headers

   //     List<WebElement> expected =  List.of("Product name", "Price", "Discount");






//        // verify data is stored properly in the table
//        driver.findElement(By.linkText("View all orders")).click();
//        String actualFull = driver.findElement(By.xpath("//table[@class='SampleTable']//tr[2]//td[2]")).getText();
//        Assert.assertEquals(actualFull, full);
//
//        Assert.assertEquals(getCellText);
    }
}
