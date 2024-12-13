package com.demoqa.elementtest;

import baseclassutility.BaseClass;
import com.demoqa.pages.BookStoreLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class BookStoreLoginTest   {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //       driver.get("https://demoqa.com/");
        driver.get("https://demoqa.com/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
    }
    @DataProvider(name = "logincredentials")
    public Object[][] provideLoginData() {
        return new Object[][]{
                {"validuser", "invalidpassword"},
                {"invaliduser", "validpassword"},
                {"",""},
                {"lakshya", "Lakshya@123"},
        };
    }

    @Test(dataProvider = "logincredentials")
    public void testlogin(String username, String password) {
        js.executeScript("window.scrollBy(0, 300)", "");
        System.out.println("username "+username+" Password "+password);
        BookStoreLoginPage bookStoreLoginPage = new BookStoreLoginPage(driver);
   //     bookStoreLoginPage.getBookstoreclick().click();
     //   bookStoreLoginPage.getLoginclick().click();

        js.executeScript("window.scrollBy(0, 300)", "");

        WebElement element1 = bookStoreLoginPage.getUsernameinput();
        element1.clear();
        element1.sendKeys(username);
        WebElement element2 = bookStoreLoginPage.getPasswordinput();
        element2.clear();
        element2.sendKeys(password);
        bookStoreLoginPage.getLogintry().click();
    }
}
