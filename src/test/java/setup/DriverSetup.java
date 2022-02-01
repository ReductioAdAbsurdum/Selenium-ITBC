package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup
{
    private static WebDriver driver;

    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("setup.DriverSetup - before suite");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterSuite
    void afterSuite() throws InterruptedException
    {
        Thread.sleep(3000);
        System.out.println("setup.DriverSetup - after suit");
        driver.quit();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
