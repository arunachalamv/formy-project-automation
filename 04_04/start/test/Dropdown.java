import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownmenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownmenu.click();

        Thread.sleep(2222);

        WebElement menuclick = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
        menuclick.click();

        Thread.sleep(2222);

        driver.quit();
    }
}
