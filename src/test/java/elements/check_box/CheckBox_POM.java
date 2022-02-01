package elements.check_box;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
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

    //region Home
    private final String HOME_CB_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]";
    @FindBy(xpath = HOME_CB_PATH)
    private WebElement homeCheckBox;
    public void homeCheckBox_Select()
    {
        homeCheckBox.click();
    }

    private final String HOME_TOGGLE_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]";
    @FindBy(xpath = HOME_TOGGLE_PATH)
    private WebElement homeToggle;
    public void homeToggle_click()
    {
        homeToggle.click();
    }
    // endregion

    //region Desktop
    private final String DESKTOP_CB_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]";
    @FindBy(xpath = DESKTOP_CB_PATH)
    private WebElement desktopCheckBox;
    public void desktopCheckBox_Select()
    {
        homeCheckBox.click();
    }
    public boolean desktopCheckBox_Visible()
    {
        return UTILS.isElementVisibleNow(desktopCheckBox);
    }

    private final String DESKTOP_TOGGLE_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[1]";
    @FindBy(xpath = DESKTOP_TOGGLE_PATH)
    private WebElement desktopToggle;
    public void desktopToggle_click()
    {
        desktopToggle.click();
    }
    //endregion

    //region Document
    private final String DOCUMENT_CB_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]";
    @FindBy(xpath = DOCUMENT_CB_PATH)
    private WebElement documentCheckBox;
    public void documentCheckBox_Select()
    {
        documentCheckBox.click();
    }
    public boolean documentCheckBox_Visible()
    {
        return UTILS.isElementVisibleNow(documentCheckBox);
    }

    private final String DOCUMENT_TOGGLE_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]";
    @FindBy(xpath = DOCUMENT_TOGGLE_PATH)
    private WebElement documentToggle;
    public void documentToggle_click()
    {
        documentToggle.click();
    }
    //endregion

    //region Downloads
    private final String DOWNLOADS_CB_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[1]";
    @FindBy(xpath = DOWNLOADS_CB_PATH)
    private WebElement downloadsCheckBox;
    public void downloadsCheckBox_Select()
    {
        downloadsCheckBox.click();
    }
    public boolean downloadsCheckBox_Visible()
    {
        return UTILS.isElementVisibleNow(downloadsCheckBox);
    }

    private final String DOWNLOADS_TOGGLE_PATH = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[1]";
    @FindBy(xpath = DOWNLOADS_TOGGLE_PATH)
    private WebElement downloadsToggle;
    public void downloadsToggle_click()
    {
        downloadsToggle.click();
    }
    //endregion

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
