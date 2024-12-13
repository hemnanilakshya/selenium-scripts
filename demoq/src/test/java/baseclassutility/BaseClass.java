package baseclassutility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    public Alert alert;
    public Actions actions;


    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelectorAll('[id*=\\\"ad\\\"]').forEach(e1 => e1.remove());");
        actions=new Actions(driver);


    }

    @AfterClass
    public void closebrowser() {
    }
}
