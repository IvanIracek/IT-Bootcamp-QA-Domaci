package Base;

import Elements.Cart;
import Elements.DropDown;
import Elements.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;


public class Base {
    private WebDriverManager wdm;
    private WebDriver driver;
    private WebDriverWait wait;
    private MainPage mainPage;
    private DropDown dropDown;
    /*private Items items;*/
    private Cart cart;

    @BeforeMethod
    public void setUp() {
        this.wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.dropDown = new DropDown(this.driver, this.wait);
        this.mainPage = new MainPage(this.driver, this.wait);
        /*this.items = new Items(driver, wait);*/
        this.cart = new Cart(driver, wait);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public DropDown getDropDown() {
        return dropDown;
    }

    public Cart getCart() {
        return cart;
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
