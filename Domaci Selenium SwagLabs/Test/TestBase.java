package Test;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestBase extends Base {
    @AfterMethod
    public void quit() {
        getDriver().quit();
    }

    @Test
    public void test(){
        getDriver().quit();
    }
    @Test
    public void testAdd() {
        Assert.assertTrue(getMainPage().addAllItems().size() == getCart().numberOfItems().size());
    }
}
