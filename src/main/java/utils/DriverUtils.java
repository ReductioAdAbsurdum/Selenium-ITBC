package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class DriverUtils
{
    private final WebDriver DRIVER;

    public DriverUtils(WebDriver driver)
    {
        this.DRIVER = driver;
    }

    public boolean isElementVisibleNow(WebElement element)
    {
        Duration originalDuration = DRIVER.manage().timeouts().getImplicitWaitTimeout();
        DRIVER.manage().timeouts().implicitlyWait(Duration.ZERO);

        boolean result = !ExpectedConditions.invisibilityOf(element).apply(DRIVER);

        DRIVER.manage().timeouts().implicitlyWait(originalDuration);
        return result;
    }

    public boolean isElementVisibleNowId(String elementId)
    {
        Duration originalDuration = DRIVER.manage().timeouts().getImplicitWaitTimeout();
        DRIVER.manage().timeouts().implicitlyWait(Duration.ZERO);

        boolean result = !ExpectedConditions.invisibilityOfElementLocated(By.id(elementId)).apply(DRIVER);

        DRIVER.manage().timeouts().implicitlyWait(originalDuration);
        return result;
    }

    public boolean isElementVisibleNowPath(String elementPath)
    {
        Duration originalDuration = DRIVER.manage().timeouts().getImplicitWaitTimeout();
        DRIVER.manage().timeouts().implicitlyWait(Duration.ZERO);

        boolean result = !ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementPath)).apply(DRIVER);

        DRIVER.manage().timeouts().implicitlyWait(originalDuration);
        return result;
    }
}
