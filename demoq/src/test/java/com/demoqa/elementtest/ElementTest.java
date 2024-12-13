package com.demoqa.elementtest;

import baseclassutility.BaseClass;
import com.demoqa.pages.ElementsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.Set;

public class ElementTest extends BaseClass {

    @Test
    public void element() {
        ElementsPage elementsPage = new ElementsPage(driver);
        WebElement elementClick = wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getElementclick()));
        js.executeScript("arguments[0].scrollIntoView(true);", elementClick);
        elementClick.click();
        WebElement textBoxClick = wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getTextboxclick()));
        js.executeScript("arguments[0].scrollIntoView(true);", textBoxClick);
        textBoxClick.click();
        elementsPage.getFullname().sendKeys("lakshya hemnani");
        elementsPage.getUseremail().sendKeys("lakshyahemnani4@gmail.com");
        elementsPage.getCurrentaddress().sendKeys("btm");
        elementsPage.getPermanentaddress().sendKeys("mumbai");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getSubmit()));
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();

        //checkbox
       WebElement chkboxopen= wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getOpencheckbox()));
        chkboxopen.click();

        WebElement checkboxclick=wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getClickcheckbox()));
        js.executeScript("arguments[0].scrollIntoView(true);",checkboxclick);
        checkboxclick.click();

        //radiobutton
        WebElement openradio=wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getOpenradiobutton()));
        js.executeScript("arguments[0].scrollIntoView(true);",openradio);
        openradio.click();

        WebElement checkradio=wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getGetclickradiobutton()));
        checkradio.click();

        //linksection
        WebElement openlinks=wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getOpenlinks()));
        js.executeScript("arguments[0].scrollIntoView(true);",openlinks);
        openlinks.click();

        WebElement simpleclick = wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getClicksimplelink()));
        simpleclick.click();

        String originalWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                driver.getCurrentUrl();
                driver.close();
            }
        }

        if (windows.contains(originalWindow)) {
            driver.switchTo().window(originalWindow);
        }


    //broken links
    WebElement brokelinkopen=wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getBrokenlinkclick()));
    js.executeScript("arguments[0].scrollIntoView(true);",brokelinkopen);
    brokelinkopen.click();

        WebElement clickopen=wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getGetBrokenlinkclick()));
        clickopen.click();
        driver.navigate().back();
        //upload and download


        WebElement updow=wait.until(ExpectedConditions.elementToBeClickable(elementsPage.getGetudopen()));
        js.executeScript("arguments[0].scrollIntoView(true);",updow);
        updow.click();
        elementsPage.getGetudopen();
        WebElement fileupload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='uploadFile']")));

        String filepath ="C:\\Users\\lakshya.hemnani\\Downloads\\sampleFile.jpeg";
        fileupload.sendKeys(filepath);






















    }
}
