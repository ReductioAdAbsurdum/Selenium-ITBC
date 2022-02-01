package elements.check_box;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import setup.DriverSetup;
import utils.DriverUtils;

public class CheckBox_POM
{
    private final String URL = "https://demoqa.com/checkbox";

    private final WebDriver DRIVER;
    private final Actions ACTION;
    private final DriverUtils UTILS;

    public CheckBox_POM()
    {
        DRIVER = DriverSetup.getDriver();
        ACTION = new Actions(DRIVER);
        UTILS = new DriverUtils(DRIVER);
        PageFactory.initElements(DRIVER, this);
    }



    public void navigateToPage()
    {
        DRIVER.navigate().to(URL);
    }

    public String getExpectedPageUrl()
    {
        return URL;
    }

    public String getDriverUrl()
    {
        return DRIVER.getCurrentUrl();
    }
}
