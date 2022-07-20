import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalbutton = driver.findElement(By.id("modal-button"));
        modalbutton.click();

        WebElement closebutton = driver.findElement(By.name("btn btn-info"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeAsyncScript("arguments[0].click();",closebutton);

        driver.quit();
    }
}
