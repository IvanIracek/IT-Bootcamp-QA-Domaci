import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demoblaze {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager wdm = new ChromeDriverManager();
        wdm.setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.linkText("Monitors")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("ASUS Full HD")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Delete")).click();
    }
}
