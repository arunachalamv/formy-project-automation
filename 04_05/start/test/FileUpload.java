import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement chooseoption = driver.findElement(By.id("file-upload-field"));
        chooseoption.sendKeys("file-to-upload.png");
        Thread.sleep(3333);

        driver.quit();
    }
}
