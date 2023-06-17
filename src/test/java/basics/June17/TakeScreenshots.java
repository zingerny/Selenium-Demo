package basics.June17;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TakeScreenshots {
    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        try {
            driver.get("https://www.amazon.com/");


            driver.findElement(By.id("jhieu")).sendKeys("jelly");

            Assert.assertEquals(driver.getTitle(), "kf");
        } catch (NoSuchElementException e) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          //  FileUtils.copyFile(screenshotFile, new File("src/test/java/basics/June17/Screenshot.png"));
            FileUtils.copyFile(screenshotFile, new File("target/screenshots/"+ System.currentTimeMillis()+" .png")); // adds multiple files
            //right click on folder and copy file path, rename path to create folder to save files. like reports and screenshots


            System.out.println("Catch block");
            throw e;

        }finally{
            driver.quit();
        }
    }
}
