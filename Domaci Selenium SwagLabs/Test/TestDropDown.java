package Test;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestDropDown extends Base {

    @AfterMethod
    public void quit(){
        getDriver().quit();
    }
    @Test
    public void testAllItems(){
        String s = "https://www.saucedemo.com/inventory.html";
        getDropDown().clickAllItems();
        Assert.assertEquals(getDriver().getCurrentUrl(), s);
    }
    @Test
    public void testAbout(){
        String s = "https://saucelabs.com/";
        getDropDown().clickAbout();
        Assert.assertEquals(getDriver().getCurrentUrl(), s);
    }
    @Test
    public void testLogOut()  {
        String s = "https://www.saucedemo.com/";
        getDropDown().clickLogout();
        Assert.assertEquals(getDriver().getCurrentUrl(), s);
    }
    @Test
    public void testResetAppState()  {
        String s = "https://www.saucedemo.com/inventory.html";
        getDropDown().clickResetAppState();
        Assert.assertTrue((getDriver().getCurrentUrl().equals(s)) && getCart().listOfCartItems().isEmpty());
    }
    @Test
    public void testXbuttonIfisClosed() throws InterruptedException {
        getDropDown().clickX();
        WebElement button = getDriver().findElement(By.id("react-burger-cross-btn"));
        Assert.assertTrue(button.getAttribute("tabindex").equals("-1"));
    }
}
