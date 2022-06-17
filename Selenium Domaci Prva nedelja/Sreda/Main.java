import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static String udjiNaStranu(WebDriver driver, String s){
        driver.navigate().to(s);
        return driver.getCurrentUrl();
    }
    public static String udjiNaLogin(WebDriver driver){
        driver.navigate().to("http://localhost:3001/");
        WebElement register = driver.findElement(By.id("signup-link"));
        register.click();
        return driver.getCurrentUrl();
    }
    public static String testRegister(WebDriver driver){
        driver.navigate().to("http://localhost:3001/");
        WebElement register = driver.findElement(By.id("signup-link"));
        register.click();
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Ivan");
        WebElement secondName = driver.findElement(By.id("lastName"));
        secondName.sendKeys("Ivanovic");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Ivanovic1@gmail.com");
        WebElement userName = driver.findElement(By.id("uniqueId"));
        userName.sendKeys("ivanivanovich1");
        WebElement Password = driver.findElement(By.id("pwdPlaintext"));
        Password.sendKeys("ivan1235");
        WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/button"));
        submit.click();
        WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/span"));
        return message.getText();
    }
    public static String Login(WebDriver driver){
        driver.navigate().to("http://localhost:3001/login");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ivanivanovich1");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("ivan1235");
        WebElement signIn = driver.findElement(By.xpath("/html/body/div/form/button"));
        signIn.click();
        WebElement account = driver.findElement(By.id("user-note-link"));
        return account.getText();
    }

}
