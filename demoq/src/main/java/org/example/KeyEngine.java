package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;  // Correct import for Row
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyEngine {

    public static WebDriver driver = null;

    public static XSSFSheet readExcelSheet(String path) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Login");
        return sheet;
    }

    public static WebElement getElement(String locatorType, String locatorValue) {
        WebElement element = null;

        switch (locatorType) {
            case "id":
                element = driver.findElement(By.id(locatorValue));
                break;
            case "name":
                element = driver.findElement(By.name(locatorValue));
                break;
            case "xpath":
                element = driver.findElement(By.xpath(locatorValue));
                break;  // Added break here
            case "NA":
                break;
            default:
                System.out.println("Invalid Locator Type");
                break;
        }
        return element;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        String path = "C:\\Users\\lakshya.hemnani\\Downloads\\Book.xlsx";

        XSSFSheet sheet = readExcelSheet(path);
        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);

            String keyword = row.getCell(0).getStringCellValue();
            String locatorType = row.getCell(1).getStringCellValue();
            String locatorValue = row.getCell(2).getStringCellValue();
            String data = row.getCell(3).getStringCellValue();

            switch (keyword) {
                case "OpenBrowser":
                    if (data.equalsIgnoreCase("chrome")) {
                        driver = new ChromeDriver();
                    } else if (data.equalsIgnoreCase("firefox")) {
                        driver = new FirefoxDriver();
                    } else {
                        System.out.println("invalid Browser");
                    }
                    break;
                case "navigate":
                    driver.get(data);
                    break;
                case "enterText":
                    WebElement element = getElement(locatorType, locatorValue);
                    element.sendKeys(data);
                    break;
                case "click":
                    getElement(locatorType, locatorValue).click();
                    break;
                default:
                    System.out.println("Invalid Keyword");
                    break;
            }
        }
    }
}
