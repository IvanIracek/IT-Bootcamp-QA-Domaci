package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Cart {
    private WebDriver driver;
    private WebDriverWait wait;

    public Cart(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goToCart(){
        driver.findElement(By.className("shopping_cart_link")).click();
    }
    public List<WebElement> listOfCartItems(){
        goToCart();
        List<WebElement> li = driver.findElements(By.className("cart_item"));
        return li;
    }
    public void checkout(){
        goToCart();
        driver.findElement(By.cssSelector("#checkout")).click();
    }
    public void continueShopping(){
        goToCart();
        driver.findElement(By.id("continue-shopping")).click();
    }
    public List<WebElement> numberOfItems(){
        goToCart();
        List<WebElement> li = driver.findElements(By.className("cart_item"));
        return li;
    }

}
