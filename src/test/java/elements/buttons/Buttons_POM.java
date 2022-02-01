package elements.buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverSetup;
import utils.DriverUtils;

public class Buttons_POM
{
    private final String URL = "https://demoqa.com/buttons";
    private final String LEFT_CLICK_MSG_ID = "dynamicClickMessage";
    private final String RIGHT_CLICK_MSG_ID = "rightClickMessage";
    private final String DOUBLE_CLICK_MSG_ID = "doubleClickMessage";
    private final WebDriver DRIVER;
    private final Actions ACTION;
    private final DriverUtils UTILS;

    public Buttons_POM()
    {
        DRIVER = DriverSetup.getDriver();
        ACTION = new Actions(DRIVER);
        UTILS = new DriverUtils(DRIVER);
        PageFactory.initElements(DRIVER, this);
    }

    private @FindBy(id = "doubleClickBtn")
    WebElement doubleClickButton;
    public void doubleClickButton_DoubleClick()
    {
        ACTION.moveToElement(doubleClickButton).perform();
        ACTION.doubleClick().perform();
    }
    public boolean doubleClickMessage_Visible()
    {
        return UTILS.isElementVisibleNow(DOUBLE_CLICK_MSG_ID);
    }

    private @FindBy(id = "rightClickBtn")
    WebElement rightClickButton;
    public void rightClickButton_RightClick()
    {
        ACTION.moveToElement(rightClickButton).perform();
        ACTION.contextClick().perform();
    }
    public boolean rightClickMessage_Visible()
    {
        return UTILS.isElementVisibleNow(RIGHT_CLICK_MSG_ID);
    }

    private @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]")
    WebElement leftClickButton;
    public void leftClickButton_Click()
    {
        ACTION.moveToElement(leftClickButton).perform();
        ACTION.click().perform();
    }
    public boolean leftClickMessage_Visible()
    {
        return UTILS.isElementVisibleNow(LEFT_CLICK_MSG_ID);
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
