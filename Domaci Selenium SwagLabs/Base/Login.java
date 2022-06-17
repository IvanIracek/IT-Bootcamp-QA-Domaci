package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Login {
    private List<String> userName = new ArrayList<>();
    private String password;

    public Login() {
        this.userName.add("standard_user");
        this.userName.add("locked_out_user");
        this.userName.add("problem_user");
        this.userName.add("performance_glitch_user");
        this.password = "secret_sauce";
    }

    public static String logIn(String u, String p){
        WebDriverManager wdm = new ChromeDriverManager();
        wdm.setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(u);
        driver.findElement(By.id("password")).sendKeys(p);
        driver.findElement(By.id("login-button")).click();
        String s = driver.getCurrentUrl();
        driver.quit();
        return s;
    }
}
