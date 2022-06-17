package Test;

import Base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCart extends Base {
    @AfterMethod
    public void quit() {
        getDriver().quit();
    }

    @Test
    public void testIfCartIsEmpty() {
        getCart().goToCart();
        Assert.assertTrue(getCart().listOfCartItems().isEmpty());
    }

    @Test
    public void isItemAdded() {
        getMainPage().addItem();
        getCart().goToCart();
    }

    @Test
    public void testCheckout() {
        String s = "https://www.saucedemo.com/checkout-step-one.html";
        getCart().checkout();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-one.html"));
    }

    @Test
    public void testBackToShoping() {
        String s = "https://www.saucedemo.com/inventory.html";
        getCart().continueShopping();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"));
    }

    @Test
    public void testCheckoutIfEmptyCart() throws InterruptedException {
        getMainPage().addItem();
        getCart().checkout();
        try {
            Alert alert = getDriver().switchTo().alert();
            Assert.assertTrue(true);
        } catch (NoAlertPresentException ex) {
            Assert.assertTrue(false);
        }
    }
}
