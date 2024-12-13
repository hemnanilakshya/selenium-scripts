package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class BookStoreLoginPage {
    WebDriver driver;

    public BookStoreLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h5[text()='Book Store Application']")
    private WebElement bookstoreclick;

    @FindBy(xpath = "//span[text()='Login']")
    private WebElement loginclick;


    @FindBy(id = "userName")
    private WebElement usernameinput;

    @FindBy(id="password")
    private WebElement passwordinput;



    @FindBy(id = "login")
    private WebElement logintry;

    public WebElement getUsernameinput() {
        return usernameinput;
    }

    public WebElement getPasswordinput() {
        return passwordinput;
    }

    public WebElement getLogintry() {
        return logintry;
    }

    public WebElement getBookstoreclick() {
        return bookstoreclick;
    }
    public WebElement getLoginclick() {
        return loginclick;
    }
}
