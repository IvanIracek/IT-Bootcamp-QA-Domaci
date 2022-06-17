import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestTest {

    private static final WebDriverManager wdm = new ChromeDriverManager();
    private static WebDriver driver;
    private static String s ="http://localhost:3001/";

    @BeforeTest
    public void beforeTest(){
        wdm.setup();
        //driver = new ChromeDriver();
    }
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testudjiNaStranu() {
        assertEquals(Main.udjiNaStranu(driver, s), s);
    }
    @Test
    public void udjiNaLogin() {
        assertEquals(Main.udjiNaLogin(driver), "http://localhost:3001/signup");
    }

    @Test
    public void testRegister() {
        assertEquals(Main.testRegister(driver), "User ivanivanovich1 is created");
    }

    @Test
    public void testLogin() {
        assertEquals(Main.Login(driver), "ivanivanovich1's Notes");
    }
}
