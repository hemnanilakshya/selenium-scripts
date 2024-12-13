package com.demoqa.elementtest;

import baseclassutility.BaseClass;
import com.demoqa.pages.FormPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Set;


public class FormTest extends BaseClass {

    @Test
    public void forms(){

        FormPage formPage =  new FormPage(driver);


        WebElement formsclick = wait.until(ExpectedConditions.visibilityOf(formPage.getFormmaintab()));

        js.executeScript("arguments[0].scrollIntoView(true);", formsclick);

        wait.until(ExpectedConditions.elementToBeClickable(formsclick));

        formsclick.click();

        WebElement pracform=wait.until(ExpectedConditions.elementToBeClickable(formPage.getPracform()));
        js.executeScript("arguments[0].scrollIntoView(true);",pracform);
        pracform.click();

         formPage.getFirstName().sendKeys("lakshya");
         formPage.getLastName().sendKeys("hemnani");
        WebElement email=wait.until(ExpectedConditions.elementToBeClickable(formPage.getUserEmail()))  ;
        js.executeScript("arguments[0].scrollIntoView(true);",email);
        email.sendKeys("lakshya@123");
        formPage.getGenderMale().click();
         formPage.getUserNumber().sendKeys("9021672867");
        WebElement subjectField = wait.until(ExpectedConditions.visibilityOf(formPage.getSubjectField()));
        subjectField.sendKeys("english");
         formPage.getHobbyMusic().click();









    }




}
