package Elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
    private WebDriver driver;
    private WebDriverWait wait;

    public DropDown(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void drop(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }
    public void clickX(){
        drop();
        driver.findElement(By.id("react-burger-cross-btn")).click();
    }
    public void clickAllItems(){
        drop();
        driver.findElement(By.id("inventory_sidebar_link")).click();
    }
    public void clickAbout(){
        drop();
        driver.findElement(By.id("about_sidebar_link")).click();
    }
    public void clickLogout(){
        drop();
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
    public void clickResetAppState(){
        drop();
        driver.findElement(By.id("reset_sidebar_link")).click();
    }

}
