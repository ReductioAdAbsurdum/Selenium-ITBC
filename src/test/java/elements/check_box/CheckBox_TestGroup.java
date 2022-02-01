package elements.check_box;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

    @Test(priority = 1)
    void desktopCheckBox_Visible_Happy()
    {
        page.navigateToPage();
        page.homeToggle_click();
        Assert.assertTrue(page.desktopCheckBox_Visible());
    }

    @Test(priority = 2)
    void desktopCheckBox_Visible_UnHappy()
    {
        page.navigateToPage();
        Assert.assertFalse(page.desktopCheckBox_Visible());
    }


    @Test(priority = 3)
    void documentCheckBox_Visible_Happy()
    {
        page.navigateToPage();
        page.homeToggle_click();
        Assert.assertTrue(page.documentCheckBox_Visible());
    }

    @Test(priority = 4)
    void documentCheckBox_Visible_UnHappy()
    {
        page.navigateToPage();
        Assert.assertFalse(page.documentCheckBox_Visible());
    }

    @Test(priority = 5)
    void downloadsCheckBox_Visible_Happy()
    {
        page.navigateToPage();
        page.homeToggle_click();
        Assert.assertTrue(page.downloadsCheckBox_Visible());
    }

    @Test(priority = 6)
    void downloadsCheckBox_Visible_UnHappy()
    {
        page.navigateToPage();
        Assert.assertFalse(page.downloadsCheckBox_Visible());
    }


}
