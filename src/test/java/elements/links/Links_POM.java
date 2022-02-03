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


    private final String NO_CONTENT_MSG = "No Content";
    private final String MOVED_MSG = "Moved Permanently";
    private final String CREATED_CONTENT_MSG = "Created";
    private final String BAD_REQUEST_CONTENT_MSG = "Bad Request";
    private final String UNAUTHORIZED_CONTENT_MSG = "Unauthorized";
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

    private final String HOME_LINK_ID = "simpleLink";
    @FindBy(id = HOME_LINK_ID)
    WebElement Home_Link;

    private final String HOME46ORF_LINK_ID = "dynamicLink";
    @FindBy(id = HOME46ORF_LINK_ID)
    WebElement Home46orf_Link;

    private final String CREATED_API_ID = "created";
    @FindBy(id = CREATED_API_ID)
    WebElement Created_API;

    private final String NO_CONTENT_API_ID = "no-content";
    @FindBy(id = NO_CONTENT_API_ID)
    WebElement NoContent_API;

    private final String MOVED_API_ID = "moved";
    @FindBy(id = MOVED_API_ID)
    WebElement Moved_API;

    private final String BAD_REQUEST_API_ID = "bad-request";
    @FindBy(id = BAD_REQUEST_API_ID)
    WebElement BadRequest_API;

    private final String UNAUTHORIZED_API_ID = "unauthorized";
    @FindBy(id = UNAUTHORIZED_API_ID)
    WebElement Unauthorized_API;

    private final String FORBIDDEN_API_ID = "forbidden";
    @FindBy(id = FORBIDDEN_API_ID)
    WebElement Forbidden_API;

    private final String NOT_FOUND_API_ID = "invalid-url";
    @FindBy(id = NOT_FOUND_API_ID)
    WebElement NotFound_API;

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

    public String getDriverUrl()
    {
        return DRIVER.getCurrentUrl();
    }
}
