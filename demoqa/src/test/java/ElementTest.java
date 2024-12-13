import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementTest {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Test
    public void textBoxOperation() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelectorAll('[id*=\\\"ad\\\"]').forEach(e1 => e1.remove());");

        // Elements section
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card-body'][1]")));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        // Text Box Section
        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Text Box']")));
        textBox.click();

        WebElement fullName = wait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
        fullName.sendKeys("Lakshya Hemnani");

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("userEmail")));
        email.sendKeys("lakshya.hemnani@qapitol.com");

        driver.findElement(By.id("currentAddress")).sendKeys("Bangalore btm stage 1");
        driver.findElement(By.id("permanentAddress")).sendKeys("aamchi mumbai");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();

        System.out.println(driver.findElement(By.id("name")).getText());
        System.out.println(driver.findElement(By.id("email")).getText());

    }

    @Test
    public void checkbox(){



        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Check Box']")));
        checkBox.click();

        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='rct-checkbox']")));
        checkbox.click();

        System.out.println(driver.findElement(By.id("result")).getText());
    }
}