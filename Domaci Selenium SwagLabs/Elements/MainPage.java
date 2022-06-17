package Elements;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPage  {
    private WebDriver driver;
    private WebDriverWait wait;
    private Random random;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void addItem(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    public List<WebElement> addAllItems(){
        List<WebElement> product = driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
        List<WebElement> product1 = new ArrayList<>();
        for(WebElement e : product){
            product1.add(e);
        }
        for(WebElement e : product){
            e.click();
        }
        return product1;
    }
}
