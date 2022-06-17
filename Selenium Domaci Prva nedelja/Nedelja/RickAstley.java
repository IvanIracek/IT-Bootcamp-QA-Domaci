import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RickAstley {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager wdm = new ChromeDriverManager();
        wdm.setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("Rick astley");
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.cssSelector("button[id='search-icon-legacy'] yt-icon[class='style-scope ytd-searchbox']"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement video = driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)"));
        video.click();
        Thread.sleep(2000);
        WebElement add = driver.findElement(By.id("ad-text:g"));
        add.click();
        Thread.sleep(2000);
        WebElement next = driver.findElement(By.cssSelector("a[title='Next (SHIFT+n)']"));
        next.click();
    }
}
