package basics.June8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WarmUP {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.newegg.com/");
driver.findElement(By.xpath("//input[@title='Search Site']")).sendKeys("rtx", Keys.ENTER);

Thread.sleep(2000);

List<WebElement> elements =  driver.findElements(By.xpath("//a[@class='item-title']"));
        System.out.println(elements.size());

        for (WebElement element:elements
             ) {
            System.out.println(element.getText());
            //Assert.assertTrue(element.getText().toLowerCase().contains("rtx"));
        }

List<WebElement>  prices = driver.findElements(By.xpath("//li[@class='price-current']"));
        System.out.println(prices);
        List <Double> priceAsDouble = new ArrayList<>();
        for (WebElement price : prices
             ) {
            String priceFixed = price.getText().replaceAll("[$,]", "");
            priceFixed = priceFixed.replaceAll("\\s+", "");
            System.out.println(price);

            if (priceFixed.contains("\\u0020")) {
                priceFixed = priceFixed.substring(0, priceFixed.indexOf("\\u0020"));
            }
         priceAsDouble.add(Double.valueOf(priceFixed));
        }


//        System.out.println(priceAsDouble);
//        priceAsDouble.sort(Comparator.naturalOrder());
//
//        System.out.println("the lowest price is: " + priceAsDouble.get(0));
    }
}
