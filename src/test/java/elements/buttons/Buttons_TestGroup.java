package elements.buttons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Buttons_TestGroup
{
    private Buttons_POM page;

    @BeforeClass
    void init()
    {
        System.out.println();
        page = new Buttons_POM();
        System.out.println("button");

    }

    @Test(priority = 0)
    void openPage()
    {
        System.out.println("Buttons_TestGroup: Open page test");
        page.navigateToPage();
        Assert.assertEquals(page.getDriverUrl(), page.getExpectedPageUrl());
    }

    @Test(priority = 1)
    void doubleClickButton()
    {
        System.out.println("Buttons_TestGroup: Double click test");
        page.doubleClickButton_DoubleClick();
        Assert.assertTrue(page.doubleClickMessage_Visible());
    }

    @Test(priority = 2)
    void rightClickButton()
    {
        System.out.println("Buttons_TestGroup: Right click test");
        page.rightClickButton_RightClick();
        Assert.assertTrue(page.rightClickMessage_Visible());
    }

    @Test(priority = 3)
    void leftClickButton()
    {
        System.out.println("Buttons_TestGroup: Left click test");
        page.leftClickButton_Click();
        Assert.assertTrue(page.leftClickMessage_Visible());
    }

}
