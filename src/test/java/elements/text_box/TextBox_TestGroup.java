package elements.text_box;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TextBox_TestGroup
{
    private TextBox_POM page;

    @BeforeClass
    void init()
    {
        System.out.println("TextBox_TestGroup: Init");
        page = new TextBox_POM();
    }

    @Test(priority = 0)
    void openPage()
    {
        System.out.println("TextBox_TestGroup_OpenPageTest");
        page.navigateToPage();
        Assert.assertEquals(page.getDriverUrl(), page.getExpectedPageUrl());
    }

    @DataProvider
    Object[][] textBoxInfoDataPrivider()
    {
        Faker f = new Faker();
        return new Object[][]
                {
                        {f.name().fullName(), f.internet().emailAddress(), f.address().fullAddress(), f.address().fullAddress()},
                };
    }

    @Test(priority = 1, dataProvider = "textBoxInfoDataPrivider")
    void enterValidInformation(String fullName, String email, String currentAddress, String permanentAddress)
    {
        SoftAssert softAssert = new SoftAssert();

        page.enterFullName(fullName);
        softAssert.assertEquals(page.getFullNameFieldText(), fullName,"Full name: not entered properly");

        page.enterEmail(email);
        softAssert.assertEquals(page.getEmailFieldText(), email,"Email: not entered properly");

        page.enterCurrentAddress(currentAddress);
        softAssert.assertEquals(page.getCurrentAddressFieldText(), currentAddress,"Current address: not entered properly");

        page.clearPermanentAddress();
        page.enterPermanentAddress(permanentAddress);
        softAssert.assertEquals(page.getPermanentAddressFieldText(), permanentAddress,"Permanent address: not entered properly");

        page.clickSubmitButton();
        Assert.assertTrue(page.outputBox_Visible());

        Assert.assertEquals(page.getOutputBoxName(),fullName,"Output box name does not match input name");
        Assert.assertEquals(page.getOutputBoxEmail(),email,"Output box email does not match input name");
        Assert.assertEquals(page.getOutputBoxCurrentAddress(),currentAddress,"Output box current address does not match input name");
        Assert.assertEquals(page.getOutputBoxPermanentAddress(),permanentAddress,"Output box permanent does not match input name");
    }



}
