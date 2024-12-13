package com.demoqa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage {


    public WidgetsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h5[text()='Widgets']")
    private WebElement mainWidgetsclick;

    @FindBy(xpath = "//span[text()='Accordian']")
    private WebElement Accordianclick;

    @FindBy(id = "section1Content")
    private WebElement section1text;

    @FindBy(id = "section1Heading")
    private WebElement sectionw1Heading;


    @FindBy(id = "section2Heading")
    private WebElement sectionw2Heading;  //phele click krna fir text() fir vapas click

    @FindBy(id = "section2Content")
    private WebElement section2text;

    @FindBy(id = "section3Heading")
    private WebElement sectionw3Heading;

    @FindBy(id = "section3Content")
    private WebElement section3text;


    //autocomplete

    @FindBy(xpath = "//span[text()='Auto Complete']")
    private WebElement autocompleteclick;

    @FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
    private WebElement multipletext;

    @FindBy(id = "autoCompleteSingleInput")
    private WebElement singletext;

    //datepicker

    @FindBy(xpath = "//span[text()='Date Picker']")
    private WebElement DatePicker;

    @FindBy(id = "datePickerMonthYearInput")
    private WebElement clickdate;

    @FindBy(xpath = "//option[text()='April']")
    private WebElement monthpicker;

    @FindBy(xpath = "//option[text()='2004']")
    private WebElement yearpicker;

    @FindBy(id = "datePickerContainer")
    private WebElement normalclicks;


    //slider

    @FindBy(xpath = "//span[text()='Slider']")
    private WebElement Sliderclick;

    @FindBy(xpath = "//input[@type='range']")
    private WebElement rangeslider;


    //progressbar

    @FindBy(xpath = "//span[text()='Progress Bar']")
    private WebElement ProgressBar;

    @FindBy(id = "startStopButton")
    private WebElement startbutton;

    @FindBy(id = "resetButton")
    private WebElement resetbutton;


    //tabs
    @FindBy(xpath = "//span[text()='Tabs']")
    private WebElement Tabsmain;

    @FindBy(xpath = "//a[text()='Origin']")
    private WebElement originclick;

    @FindBy(xpath = "//a[text()='Use']")
    private WebElement useclick;

    //tooltips

    @FindBy(xpath = "//span[text()='Tool Tips']")
    private WebElement Tooltipsmain;

    @FindBy(id = "toolTipButton")
    private  WebElement tooltipbutton;









    public WebElement getMainWidgetsclick() {
        return mainWidgetsclick;
    }

    public WebElement getAccordianclick() {
        return Accordianclick;
    }

    public WebElement getSection1text() {
        return section1text;
    }

    public WebElement getSectionw1Heading() {
        return sectionw1Heading;
    }

    public WebElement getSectionw2Heading() {
        return sectionw2Heading;
    }

    public WebElement getSection2text() {
        return section2text;
    }

    public WebElement getSectionw3Heading() {
        return sectionw3Heading;
    }

    public WebElement getSection3text() {
        return section3text;
    }

    //auto


    public WebElement getAutocompleteclick() {
        return autocompleteclick;
    }

    public WebElement getMultipletext() {
        return multipletext;
    }

    public WebElement getSingletext() {
        return singletext;
    }

    public WebElement getDatePicker() {
        return DatePicker;
    }

    public WebElement getClickdate() {
        return clickdate;
    }

    public WebElement getMonthpicker() {
        return monthpicker;
    }

    public WebElement getYearpicker() {
        return yearpicker;
    }

    public WebElement getNormalclicks() {
        return normalclicks;
    }

    public WebElement getSliderclick() {
        return Sliderclick;
    }

    public WebElement getRangeslider() {
        return rangeslider;
    }

    public WebElement getProgressBar() {
        return ProgressBar;
    }

    public WebElement getStartbutton() {
        return startbutton;
    }

    public WebElement getResetbutton() {
        return resetbutton;
    }

    public WebElement getTabsmain() {
        return Tabsmain;
    }

    public WebElement getOriginclick() {
        return originclick;
    }

    public WebElement getUseclick() {
        return useclick;
    }

    public WebElement getTooltipsmain() {
        return Tooltipsmain;
    }

    public WebElement getTooltipbutton() {
        return tooltipbutton;
    }
}
