package elements.links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverSetup;
import utils.DriverUtils;

public class Links_POM
{
    private final String URL = "https://demoqa.com/links";
    private final String HOME_URL = "https://demoqa.com/";


    private final String CREATED_MSG = "Created";
    private final String NO_CONTENT_MSG = "No Content";
    private final String MOVED_MSG = "Moved Permanently";
    private final String BAD_REQUEST_MSG = "Bad Request";
    private final String UNAUTHORIZED_MSG = "Unauthorized";
    private final String FORBIDDEN_MSG = "Forbidden";
    private final String NOT_FOUND_MSG = "Not Found";


    private final WebDriver DRIVER;
    private final Actions ACTION;
    private final DriverUtils UTILS;

    public Links_POM()
    {
        DRIVER = DriverSetup.getDriver();
        ACTION = new Actions(DRIVER);
        UTILS = new DriverUtils(DRIVER);
        PageFactory.initElements(DRIVER, this);
    }

    //#region HOME
    private final String HOME_LINK_ID = "simpleLink";
    @FindBy(id = HOME_LINK_ID)
    WebElement Home_Link;
    public void Home_Link_Click()
    {
        Home_Link.click();
    }
    //endregion

    //#region HOME46
    private final String HOME46ORF_LINK_ID = "dynamicLink";
    @FindBy(id = HOME46ORF_LINK_ID)
    WebElement Home46orf_Link;
    public void Home460rf_Link_Click()
    {
        Home46orf_Link.click();
    }
    //endregion

    //#region CREATED
    private final String CREATED_API_ID = "created";
    @FindBy(id = CREATED_API_ID)
    WebElement Created_API;
    public void Created_API_Click()
    {
        Created_API.click();
    }
    public boolean Created_API_MsgExist()
    {
        return foundTextOnPage(CREATED_MSG);
    }
    //endregion

    //#region NO_CONTENT
    private final String NO_CONTENT_API_ID = "no-content";
    @FindBy(id = NO_CONTENT_API_ID)
    WebElement NoContent_API;
    public void NoContent_API_Click()
    {
        NoContent_API.click();
    }
    public boolean NoContent_API_MsgExist()
    {
        return foundTextOnPage(NO_CONTENT_MSG);
    }
    //endregion

    //#region MOVED
    private final String MOVED_API_ID = "moved";
    @FindBy(id = MOVED_API_ID)
    WebElement Moved_API;
    public void Moved_API_Click()
    {
        Moved_API.click();
    }
    public boolean Moved_API_MsgExist()
    {
        return foundTextOnPage(MOVED_MSG);
    }
    //endregion

    //#region HOME
    private final String BAD_REQUEST_API_ID = "bad-request";
    @FindBy(id = BAD_REQUEST_API_ID)
    WebElement BadRequest_API;
    public void BadRequest_API_Click()
    {
        BadRequest_API.click();
    }
    public boolean BadRequest_API_MsgExist()
    {
        return foundTextOnPage(BAD_REQUEST_MSG);
    }
    //endregion

    //#region UNAUTHORIZED
    private final String UNAUTHORIZED_API_ID = "unauthorized";
    @FindBy(id = UNAUTHORIZED_API_ID)
    WebElement Unauthorized_API;
    public void Unauthorized_API_Click()
    {
        Unauthorized_API.click();
    }
    public boolean Unauthorized_API_MsgExist()
    {
        return foundTextOnPage(UNAUTHORIZED_MSG);
    }
    //endregion

    //#region FORBIDDEN

    private final String FORBIDDEN_API_ID = "forbidden";
    @FindBy(id = FORBIDDEN_API_ID)
    WebElement Forbidden_API;
    public void Forbidden_API_Click()
    {
        Forbidden_API.click();
    }
    public boolean Forbidden_API_MsgExist()
    {
        return foundTextOnPage(FORBIDDEN_MSG);
    }
    //endregion

    //#region NOT_FOUND
    private final String NOT_FOUND_API_ID = "invalid-url";
    @FindBy(id = NOT_FOUND_API_ID)
    WebElement NotFound_API;
    public void NotFound_API_Click()
    {
        NotFound_API.click();
    }
    public boolean NotFound_API_MsgExist()
    {
        return foundTextOnPage(NOT_FOUND_MSG);
    }
    //endregion


    private boolean foundTextOnPage(String text)
    {
       return DRIVER.getPageSource().contains(text);
    }

    public void navigateToPage()
    {
        DRIVER.navigate().to(URL);
    }

    public String getExpectedPageUrl()
    {
        return URL;
    }
    public String getHomePageUrl()
    {
        return HOME_URL;
    }

    public String getDriverUrl()
    {
        return DRIVER.getCurrentUrl();
    }
}
