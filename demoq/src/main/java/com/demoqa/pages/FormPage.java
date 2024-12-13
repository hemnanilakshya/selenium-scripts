package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formmaintab;

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement pracform;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement userEmail;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
    private WebElement subjectField;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement hobbyMusic;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement uploadPicture;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    private WebElement currentAddress;

    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement stateDropdown;

    @FindBy(xpath = "//div[text()='NCR']")
    private WebElement stateOption;

    public WebElement getFormmaintab() {

        return formmaintab;
    }

    public WebElement getPracform() {
        return pracform;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getUserEmail() {
        return userEmail;
    }

    public WebElement getGenderMale() {
        return genderMale;
    }

    public WebElement getUserNumber() {
        return userNumber;
    }

    public WebElement getDateOfBirth() {
        return dateOfBirth;
    }

    public WebElement getSubjectField() {
        return subjectField;
    }

    public WebElement getHobbyMusic() {
        return hobbyMusic;
    }

    public WebElement getUploadPicture() {
        return uploadPicture;
    }

    public WebElement getCurrentAddress() {
        return currentAddress;
    }

    public WebElement getStateDropdown() {
        return stateDropdown;
    }

    public WebElement getStateOption() {
        return stateOption;
    }
}
