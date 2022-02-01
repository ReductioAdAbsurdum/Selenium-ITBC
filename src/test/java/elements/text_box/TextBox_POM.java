package elements.text_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverSetup;
import utils.DriverUtils;

public class TextBox_POM
{
    private final String URL = "https://demoqa.com/text-box";
    private final String OUTPUT_ID = "output";
    private final String NAME_ID = "name";
    private final String EMAIL_ID = "email";
    private final String CURRENT_ADDRESS_ID = "currentAddress";
    private final String PERMANENT_ADDRESS_ID = "permanentAddress";
    private final WebDriver DRIVER;
    private final DriverUtils UTILS;

    public TextBox_POM()
    {
        DRIVER = DriverSetup.getDriver();
        UTILS = new DriverUtils(DRIVER);
        PageFactory.initElements(DRIVER,this);
    }

    @FindBy(id = "userName")
    private WebElement fullNameField;
    public void enterFullName(String fullName)
    {
        fullNameField.clear();
        fullNameField.sendKeys(fullName);
    }
    public String getFullNameFieldText()
    {
        return fullNameField.getText();
    }

    @FindBy(id = "userEmail")
    private WebElement emailField;
    public void enterEmail(String email)
    {
        emailField.clear();
        emailField.sendKeys(email);
    }
    public String getEmailFieldText()
    {
        return emailField.getText();
    }

    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;
    public void enterCurrentAddress(String currentAddress)
    {
        currentAddressField.clear();
        currentAddressField.sendKeys(currentAddress);
    }
    public String getCurrentAddressFieldText()
    {
        return currentAddressField.getText();
    }

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;
    public void enterPermanentAddress(String permanentAddress)
    {
        permanentAddressField.sendKeys(permanentAddress);
    }
    public void clearPermanentAddress()
    {
        permanentAddressField.clear();
    }
    public String getPermanentAddressFieldText()
    {
        return permanentAddressField.getText();
    }

    @FindBy(id = "submit")
    private WebElement submitButton;
    public void clickSubmitButton()
    {
        submitButton.click();
    }

    public boolean outputBox_Visible()
    {
        return UTILS.isElementVisibleNowId(OUTPUT_ID);
    }

    public String getOutputBoxName()
    {
        String rawText =DRIVER.findElement(By.id(OUTPUT_ID)).findElement(By.id(NAME_ID)).getText();
        return rawText.split(":")[1];
    }
    public String getOutputBoxEmail()
    {
        String rawText =DRIVER.findElement(By.id(OUTPUT_ID)).findElement(By.id(EMAIL_ID)).getText();
        return rawText.split(":")[1];
    }
    public String getOutputBoxCurrentAddress()
    {
        String rawText =DRIVER.findElement(By.id(OUTPUT_ID)).findElement(By.id(CURRENT_ADDRESS_ID)).getText();
        return rawText.split(":")[1];
    }
    public String getOutputBoxPermanentAddress()
    {
        String rawText =DRIVER.findElement(By.id(OUTPUT_ID)).findElement(By.id(PERMANENT_ADDRESS_ID)).getText();
        return rawText.split(":")[1];
    }

    public void navigateToPage()
    {
        DRIVER.navigate().to(URL);
    }

    public String getDriverUrl()
    {
        return  DRIVER.getCurrentUrl();
    }

    public String getExpectedPageUrl()
    {
        return URL;
    }
}
