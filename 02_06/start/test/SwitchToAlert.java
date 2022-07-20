import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertbutton = driver.findElement(By.id("alert-button"));
        Thread.sleep(5555);
        alertbutton.click();
        Thread.sleep(5555);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5555);
        driver.quit();
    }
}
