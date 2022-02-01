package elements.check_box;

import com.github.javafaker.Faker;
import elements.text_box.TextBox_POM;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBox_TestGroup
{
    private CheckBox_POM page;

    @BeforeClass
    void init()
    {
        System.out.println("CheckBox_TestGroup: Init");
        page = new CheckBox_POM();
    }

    @Test(priority = 0)
    void openPage()
    {
        System.out.println("CheckBox_TestGroup_OpenPageTest");
        page.navigateToPage();
        Assert.assertEquals(page.getDriverUrl(), page.getExpectedPageUrl());
    }
    



}
