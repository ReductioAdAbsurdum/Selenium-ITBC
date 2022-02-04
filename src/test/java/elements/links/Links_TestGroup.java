package elements.links;

import elements.check_box.CheckBox_POM;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Links_TestGroup
{
    private Links_POM page;

    @BeforeClass
    void init()
    {
        page = new Links_POM();
    }


    @Test(priority = 0)
    void openPage()
    {
        page.navigateToPage();
        Assert.assertEquals(page.getDriverUrl(), page.getExpectedPageUrl());
    }

    @Test(priority = 10)
    void HomeLink()
    {
        page.navigateToPage();
        page.Home_Link_Click();
        Assert.assertEquals(page.getDriverUrl(), page.getExpectedPageUrl());;
    }

    @Test(priority = 20)
    void Home46Link()
    {
        page.navigateToPage();
        page.Home460rf_Link_Click();
        Assert.assertEquals(page.getDriverUrl(), page.getExpectedPageUrl());;
    }

    @Test(priority = 30)
    void CreatedAPI()
    {page.navigateToPage();
       page.Created_API_Click();
       Assert.assertTrue(page.Created_API_MsgExist());
    }

    @Test(priority = 40)
    void NoContentAPI()
    {
        page.navigateToPage();
        page.NoContent_API_Click();
        Assert.assertTrue(page.NoContent_API_MsgExist());
    }

    @Test(priority = 50)
    void MovedAPI()
    {
        page.navigateToPage();
        page.Moved_API_Click();
        Assert.assertTrue(true);
    }

    @Test(priority = 60)
    void badRequestAPI()
    {
        page.navigateToPage();
        page.BadRequest_API_Click();
        Assert.assertTrue(page.BadRequest_API_MsgExist());
    }

    @Test(priority = 70)
    void unauthorizedAPI()
    {
        page.navigateToPage();
        page.Unauthorized_API_Click();
        Assert.assertTrue(page.Unauthorized_API_MsgExist());
    }

    @Test(priority = 80)
    void forbiddenAPI()
    {
        page.navigateToPage();
        page.Forbidden_API_Click();
        Assert.assertTrue(page.Forbidden_API_MsgExist());
    }

    @Test(priority = 90)
    void notFoundAPI()
    {
        page.navigateToPage();
        page.NotFound_API_Click();
        Assert.assertTrue(page.NotFound_API_MsgExist());
    }
}
