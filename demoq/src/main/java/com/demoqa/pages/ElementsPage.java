package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementsPage {
    WebDriver driver;

  public ElementsPage(WebDriver driver){
        this.driver=driver;
      PageFactory.initElements(driver,this);

    }
    @FindBy(xpath ="//div[@class='card-body'][1]")
    private WebElement elementclick;

    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement textboxclick;


    @FindBy(id = "userName")
    private WebElement fullname;

    @FindBy(id="userEmail")
    private WebElement useremail;

    @FindBy(id="currentAddress")
    private WebElement currentaddress;

    @FindBy(id="permanentAddress")
    private WebElement permanentaddress;

    @FindBy(id="submit")
    private WebElement submit;


    @FindBy(xpath = "//span[text()='Check Box']")
    private WebElement opencheckbox;

    @FindBy(xpath = "//span[@class='rct-checkbox']")
    private WebElement clickcheckbox;

    @FindBy(xpath = "//span[text()='Radio Button']")
    private WebElement openradiobutton;

    @FindBy(xpath = "//label[@class='custom-control-label'][1]")
    private WebElement getclickradiobutton;

    @FindBy(xpath = "//span[text()='Links']")
    private  WebElement openlinks;

    @FindBy(xpath = "//a[@id='simpleLink']")
    private  WebElement clicksimplelink;

    @FindBy(xpath = "//span[text()='Broken Links - Images']")
    private WebElement brokenlinkclick;

    @FindBy(xpath = "//a[text()='Click Here for Broken Link']")
    private WebElement getBrokenlinkclick;

    @FindBy(xpath = "//span[text()='Upload and Download']")
    private WebElement getudopen;

    @FindBy(xpath = "//a[text()='Download']")
    private WebElement download;





    public WebElement getFullname() {
        return fullname;
    }

    public WebElement getUseremail() {
        return useremail;
    }

    public WebElement getCurrentaddress() {
        return currentaddress;
    }

    public WebElement getPermanentaddress() {
        return permanentaddress;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getElementclick() {
        return elementclick;
    }

    public WebElement getTextboxclick() {
        return textboxclick;
    }
    public WebElement getOpencheckbox() {
        return opencheckbox;
    }

    public WebElement getClickcheckbox() {
        return clickcheckbox;
    }

    public WebElement getOpenradiobutton() {
        return openradiobutton;
    }


    public WebElement getGetclickradiobutton() {
        return getclickradiobutton;
    }

    public WebElement getOpenlinks() {
        return openlinks;
    }

    public WebElement getClicksimplelink() {
        return clicksimplelink;
    }

    public WebElement getBrokenlinkclick() {
        return brokenlinkclick;
    }

    public WebElement getGetBrokenlinkclick() {
        return getBrokenlinkclick;
    }

    public WebElement getGetudopen() {
        return getudopen;
    }

    public WebElement getDownload() {
        return download;
    }
}
