import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
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

        // Checkbox
        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Check Box']")));
        checkBox.click();

        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='rct-checkbox']")));
        checkbox.click();

        System.out.println(driver.findElement(By.id("result")).getText());




        // Radio Button Section
        WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Radio Button']")));
        js.executeScript("arguments[0].scrollIntoView(true);", radioButton);
        radioButton.click();

        WebElement firstRadioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='custom-control-label'][1]")));
        firstRadioButton.click();

        // Links Section
        WebElement linksSection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Links']")));
        js.executeScript("arguments[0].scrollIntoView(true);", linksSection);
        linksSection.click();

        WebElement simpleLink = driver.findElement(By.xpath("//a[@id='simpleLink']"));
        simpleLink.click();


        String originalWindow = driver.getWindowHandle(); // Store the original window handle
        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to new window: " + driver.getCurrentUrl());
                driver.close();
            }
        }

            driver.switchTo().window(originalWindow);

        //broken links
        WebElement brokenlinks = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Broken Links - Images']")));
        brokenlinks.click();
        js.executeScript("arguments[0].scrollIntoView(true);",brokenlinks);
        driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']")).click();
        System.out.println(driver.findElement(By.xpath("(//p[contains(text(),'This page returned a 500 status code.')])[1]")).getText());
        driver.navigate().back();
//upload and download
        WebElement updow=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Upload and Download']")));
        js.executeScript("arguments[0].scrollIntoView(true);",updow);
        updow.click();
        driver.findElement(By.xpath("//a[text()='Download']")).click();
        Thread.sleep(2000);
        //js.executeScript("document.querySelectorAll('[id*=\\\"ad\\\"]').forEach(e1 => e1.remove());");

        WebElement fileupload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='uploadFile']")));

        String filepath ="C:\\Users\\lakshya.hemnani\\Downloads\\sampleFile.jpeg";
        fileupload.sendKeys(filepath);

        WebElement dynamicprop=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Dynamic Properties']")));
        js.executeScript("arguments[0].scrollIntoView(true);",dynamicprop);
        dynamicprop.click();


        driver.findElement(By.xpath("//button[@id='colorChange']")).click();

//forms
        WebElement forms = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='pr-1'])[2]")));
        js.executeScript("arguments[0].scrollIntoView(true);",forms);
        forms.click();

        WebElement pracform=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Practice Form']")));
        js.executeScript("arguments[0].scrollIntoView(true);",pracform);
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();


       driver.findElement(By.id("firstName")).sendKeys("lakshya ");
        driver.findElement(By.id("lastName")).sendKeys("Hemnani");
      WebElement emailforscroll= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userEmail']")));
      js.executeScript("arguments[0].scrollIntoView(true);",emailforscroll);
      emailforscroll.sendKeys("lakshyahemnani@gmail.com");
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9021672867");
        driver.findElement(By.id("dateOfBirthInput")).clear();

        driver.findElement(By.id("dateOfBirthInput")).sendKeys("21 april 2024");
        driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("english");
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();

        WebElement picupload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='uploadPicture']")));
        String picpath="C:\\Users\\lakshya.hemnani\\Downloads\\sampleFile.jpeg";
        picupload.sendKeys(picpath);
        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("mumbai");
        driver.findElement(By.xpath("//div[text()='Select State']")).click();
        driver.findElement(By.xpath("//div[text()='NCR']")).click();





















    }
}
