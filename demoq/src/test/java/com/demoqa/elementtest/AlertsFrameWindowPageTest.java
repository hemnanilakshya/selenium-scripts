package com.demoqa.elementtest;

import baseclassutility.BaseClass;
import com.demoqa.pages.AlertsFrameWindowsPage;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.Set;

public class AlertsFrameWindowPageTest extends BaseClass {


    @Test
        public void alerts() throws InterruptedException {

            AlertsFrameWindowsPage alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver);
            WebElement alertClick = wait.until(ExpectedConditions.visibilityOf(alertsFrameWindowsPage.getAlertClick()));;
            js.executeScript("arguments[0].scrollIntoView(true);", alertClick);
            wait.until(ExpectedConditions.elementToBeClickable(alertsFrameWindowsPage.getAlertClick()));
            alertClick.click();

            alertsFrameWindowsPage.getBrowserwindowclick().click();
            alertsFrameWindowsPage.getNewtabclick().click();


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
            alertsFrameWindowsPage.clickNewWindowBtn();
            windows = driver.getWindowHandles();

            for (String window : windows) {
                driver.switchTo().window(window);
                if (driver.getCurrentUrl().equals("https://demoqa.com/sample")) {
                    break;
                }
            }

            System.out.println(alertsFrameWindowsPage.getSameheadingtext().getText());
            driver.close();

            driver.switchTo().window(originalWindow);

    //        wait.until(ExpectedConditions.elementToBeClickable(alertsFrameWindowsPage.getMessageWindowButton()));
    //        alertsFrameWindowsPage.getMessageWindowButton().click();
    //        driver.switchTo().window(originalWindow);

            alertsFrameWindowsPage.getAlertswich().click();


            WebElement button1 = alertsFrameWindowsPage.getAlertbutton();
            js.executeScript("arguments[0].scrollIntoView(true);", button1);
            button1.click();
            alert = driver.switchTo().alert();
            System.out.println("alertmessage" + alert.getText());
            alert.accept();

            WebElement button2 = alertsFrameWindowsPage.getTimealertbutton();
            button2.click();
            Thread.sleep(5000);
            alert = driver.switchTo().alert();
            System.out.println("alertmessage" + alert.getText());
            alert.accept();

            WebElement button3 = alertsFrameWindowsPage.getConfirmButton();
            button3.click();
            alert = driver.switchTo().alert();
            System.out.println("alert messgae" + alert.getText());
            alert.dismiss();

            WebElement button4 = alertsFrameWindowsPage.getPromtbuttonclick();
            button4.click();
            alert = driver.switchTo().alert();
            alert.sendKeys("lakshya");
            alert.accept();


            alertsFrameWindowsPage.getFramesswitch().click();

            WebElement frame1 = wait.until(ExpectedConditions.elementToBeClickable(alertsFrameWindowsPage.getFrame1()));
            js.executeScript("arguments[0].scrollIntoView(true);", frame1);
            driver.switchTo().frame(frame1);
            System.out.println(  alertsFrameWindowsPage.getGrabtextframe().getText());
            driver.switchTo().defaultContent();

            WebElement frame2=wait.until(ExpectedConditions.visibilityOf( alertsFrameWindowsPage.getFrame2()));
         //   js.executeScript("arguments[0].scrollIntoView(true);", frame2);
            driver.switchTo().frame(frame2);
            System.out.println(alertsFrameWindowsPage.getGrabtextframe2().getText());
            driver.switchTo().defaultContent();



        //WebElement nested1=wait.until(ExpectedConditions.elementToBeClickable(alertsFrameWindowsPage.getNestedframesswitch()));
           // nested1.click();

            //nested click
          /*  alertsFrameWindowsPage.getNestedframesswitch().click();

            WebElement parentFrame = alertsFrameWindowsPage.getParentframe();
            js.executeScript("arguments[0].scrollIntoView(true);", parentFrame);
            driver.switchTo().frame(parentFrame);
            System.out.println("Parent Frame Text: " + alertsFrameWindowsPage.getGrabparenttext().getText());
           // driver.switchTo().defaultContent();
            WebElement childFrame = alertsFrameWindowsPage.getChildframe();
            driver.switchTo().frame(childFrame);
            System.out.println("Child Frame Text: " + alertsFrameWindowsPage.getChildframe().getText());

           */

            alertsFrameWindowsPage.getModaldialogsclick().click();

            WebElement smalldialog=wait.until(ExpectedConditions.visibilityOf(alertsFrameWindowsPage.getSmallmodelclick()));
            js.executeScript("arguments[0].scrollIntoView(true);",smalldialog);
            smalldialog.click();
            Thread.sleep(2000);
            System.out.println( alertsFrameWindowsPage.getModelText().getText());
            alertsFrameWindowsPage.getClosesmallmodel().click();

            WebElement bigdialog=alertsFrameWindowsPage.getLargemodelclick();
            bigdialog.click();
            Thread.sleep(2000);
            System.out.println(alertsFrameWindowsPage.getLargetext().getText());
            alertsFrameWindowsPage.getCloselargetext().click();
















        }
}