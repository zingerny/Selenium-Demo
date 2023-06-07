package June6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class WarmUp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        1. Navigate to webstaurant.com

        driver.get("https://www.webstaurantstore.com/");

//        2. Search for a table

        String searchTerm = "table";
        driver.findElement(By.name("searchval")).sendKeys(searchTerm, Keys.ENTER);

//        3. Verify that all search results contain 'table'

        List<WebElement> searchResults = driver.findElements(By.xpath("//"));







//        4. Click on the last search result
        searchResults.get(searchResults.size()-1).click();

//        5. Verify the default quantity of a product is 1

        String actualQty = driver.findElement(By.id("qty")).getAttribute("value");
        Assert.assertEquals(Integer.parseInt(actualQty), 1);

        //5a verify price is 194.99

        double expPrice =194.99;
        double actualPrice = Double.parseDouble(driver.findElement(By.xpath("//")).getText().replace("$", ""));
        Assert.assertEquals(actualPrice, expPrice);
//        6. Click add to cart

driver.findElement(By.id("buyButton")).click();



//        7. Verify 1 item added to your cart is on the page

      Assert.assertTrue(driver.findElement(By.xpath("//")).isDisplayed());


//        8. Empty the cart and verify the cart is empty



    }

}
