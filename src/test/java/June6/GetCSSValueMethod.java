package June6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetCSSValueMethod {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
}
