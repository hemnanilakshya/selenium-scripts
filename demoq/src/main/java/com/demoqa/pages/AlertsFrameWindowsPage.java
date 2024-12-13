package com.demoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

public class AlertsFrameWindowsPage {
    WebDriver driver;
    WebDriverWait wait;
     JavascriptExecutor js;


    public AlertsFrameWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertClick;


    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserwindowclick;

    @FindBy(id = "tabButton")
    private WebElement newtabclick;

    @FindBy(id = "windowButton")
    private WebElement windowbuttonclick;

    @FindBy(id = "sampleHeading")
    private WebElement sameheadingtext;

//    @FindBy(id = "messageWindowButton")
//    private WebElement messageWindowButton;
//
//    @FindBy(xpath = "//body[contains(text(),'Knowledge increases by')]")
//    private WebElement grabtext;


    @FindBy(xpath="//span[text()='Alerts']")
    private WebElement alertswich;

    @FindBy(id = "alertButton")
    private WebElement alertbutton;

    @FindBy(id = "timerAlertButton")
    private WebElement timealertbutton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButtonclick;

    @FindBy(id = "promtButton")
    private WebElement promtbuttonclick;


    @FindBy(xpath="//span[text()='Frames']")
    private WebElement framesswitch;

    @FindBy(id = "frame1")
    private WebElement frame1;

    @FindBy(id = "sampleHeading")
    private WebElement grabtextframe;


    @FindBy(id = "frame2")
    private WebElement frame2;

    @FindBy(id = "sampleHeading")
    private WebElement grabtextframe2;



    @FindBy(xpath="//span[text()='Nested Frames']")
    private WebElement nestedframesswitch;

    @FindBy(id = "frame1Wrapper")
    private WebElement parentframe;

    @FindBy(xpath = "//body[text()='Parent frame']")
    private WebElement grabparenttext;

    @FindBy(xpath = "//p[text()='Child Iframe']")
    private WebElement childframe;

    @FindBy(xpath="//span[text()='Modal Dialogs']")
    private WebElement Modaldialogsclick;

    @FindBy(id ="showSmallModal")
    private WebElement smallmodelclick;

    @FindBy(className = "modal-body")
    private WebElement modelText;

    @FindBy(id = "closeSmallModal")
    private WebElement closesmallmodel;

    @FindBy(id ="showLargeModal")
    private WebElement largemodelclick;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement largetext;

    @FindBy(xpath = "//button[text()='Close']")
    private WebElement Closelargetext;




    public WebElement getAlertClick() {
        return alertClick;
    }

    public WebElement getBrowserwindowclick() {
        return browserwindowclick;
    }

    public WebElement getNewtabclick() {
        return newtabclick;
    }

    public WebElement getSameheadingtext() {
        return sameheadingtext;
    }

    public void clickNewWindowBtn() {
        windowbuttonclick.click();
    }

    public WebElement getWindowbuttonclick() {
        return windowbuttonclick;
    }

//    public WebElement getMessageWindowButton() {
//        return messageWindowButton;
//    }
//
//    public WebElement getGrabtext() {
//        return grabtext;

//    }


    public WebElement getAlertswich() {
        return alertswich;
    }

    public WebElement getAlertbutton() {
        return alertbutton;
    }

    public WebElement getTimealertbutton() {
        return timealertbutton;
    }

    public WebElement getConfirmButton() {
        return confirmButtonclick;
    }
    public WebElement getPromtbuttonclick() {
        return promtbuttonclick;
    }

    public WebElement getFramesswitch() {
        return framesswitch;
    }

    public WebElement getFrame1() {
        return frame1;
    }

    public WebElement getGrabtextframe() {
        return grabtextframe;
    }

    public WebElement getFrame2() {
        return frame2;
    }

    public WebElement getGrabtextframe2() {
        return grabtextframe2;
    }

    public WebElement getNestedframesswitch() {
        return nestedframesswitch;
    }

    public WebElement getParentframe() {
        return parentframe;
    }

    public WebElement getGrabparenttext() {
        return grabparenttext;
    }

    public WebElement getChildframe() {
        return childframe;
    }

    public WebElement getModaldialogsclick() {
        return Modaldialogsclick;
    }

    public WebElement getSmallmodelclick() {
        return smallmodelclick;
    }

    public WebElement getModelText() {
        return modelText;
    }

    public WebElement getClosesmallmodel() {
        return closesmallmodel;
    }

    public WebElement getLargemodelclick() {
        return largemodelclick;
    }

    public WebElement getLargetext() {
        return largetext;
    }

    public WebElement getCloselargetext() {
        return Closelargetext;
    }
}

