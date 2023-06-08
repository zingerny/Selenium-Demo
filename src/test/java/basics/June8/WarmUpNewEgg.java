package basics.June8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class WarmUpNewEgg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().
                maximize();

        driver.manage().timeouts().implicitlyWait();

        List<WebElement> prices = driver.findElements(By.xpath("//li[@class='price-current']"));
        List <Double> pricesAsDouble = driver.findElement()
        for (WebElement price : prices){
            String priceFixed = price.getText().replaceAll("[$,]","");
            if ( priceFixed.contains(" ")){
                 priceFixed = priceFixed.substring(0, priceFixed.indexOf(" "));
            }
            pricesAsDouble.add(Double.valueOf());

        }
    }
}
