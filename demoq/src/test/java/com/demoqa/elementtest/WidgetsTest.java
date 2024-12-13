package com.demoqa.elementtest;

import baseclassutility.BaseClass;
import com.demoqa.pages.WidgetsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WidgetsTest extends BaseClass {

    public WidgetsPage widgetsPage;

@BeforeClass
public void init(){
    widgetsPage = new WidgetsPage(driver);
}
    @Test
    public void accordian() throws InterruptedException {

//        WidgetsPage widgetsPage = new WidgetsPage(driver);
        WebElement acordian = widgetsPage.getMainWidgetsclick();
        js.executeScript("arguments[0].scrollIntoView(true);", acordian);
        acordian.click();
        widgetsPage.getAccordianclick().click();


        WebElement section1 = widgetsPage.getSection1text();
        js.executeScript("arguments[0].scrollIntoView(true);", section1);
        System.out.println(section1.getText());
        widgetsPage.getSectionw1Heading().click();

        WebElement section2 = widgetsPage.getSectionw2Heading();
        section2.click();
        Thread.sleep(3000);
        section2.click();

        Thread.sleep(2000);
        WebElement section3 = widgetsPage.getSectionw3Heading();
        section3.click();
        Thread.sleep(3000);
        section3.click();

//        System.out.println(widgetsPage.getSection3text().getText());
        //      section3.click();
    }
        @Test
        public void autoComplete() throws InterruptedException {
            WebElement auto = widgetsPage.getMainWidgetsclick();
            js.executeScript("arguments[0].scrollIntoView(true);", auto);
            auto.click();
            widgetsPage.getAutocompleteclick().click();


            WebElement multext=widgetsPage.getMultipletext();
            js.executeScript("arguments[0].scrollIntoView(true);", multext);
            multext.sendKeys("lakshya","hemnani");
            widgetsPage.getSingletext().sendKeys("laksh");

        }

        @Test
        public void datePicker() {
            WebElement date = widgetsPage.getMainWidgetsclick();
            js.executeScript("arguments[0].scrollIntoView(true);", date);
            date.click();
            widgetsPage.getDatePicker().click();

            WebElement clickdate = widgetsPage.getClickdate();
            js.executeScript("arguments[0].scrollIntoView(true);", clickdate);
            clickdate.clear();

            WebElement selectmonth = widgetsPage.getMonthpicker();
            selectmonth.click();

            WebElement selectyear = widgetsPage.getYearpicker();
            selectyear.click();

            WebElement normalClick = widgetsPage.getNormalclicks();
            normalClick.click();
        }
            @Test
             public void slider(){
                WebElement slider= widgetsPage.getMainWidgetsclick();
                js.executeScript("arguments[0].scrollIntoView(true);",slider);
                slider.click();
                widgetsPage.getSliderclick().click();

                WebElement raceslider= widgetsPage.getRangeslider();

               actions.clickAndHold(raceslider).moveByOffset(100,0).release().perform();

            }

            @Test
            public void progressbar() throws InterruptedException {
                WebElement bar = widgetsPage.getMainWidgetsclick();
                js.executeScript("arguments[0].scrollIntoView(true);", bar);
                bar.click();

                widgetsPage.getProgressBar().click();
                widgetsPage.getStartbutton().click();
                Thread.sleep(5000);
                widgetsPage.getStartbutton().click();
                widgetsPage.getStartbutton().click();
                Thread.sleep(2000);
                widgetsPage.getResetbutton().click();
                Thread.sleep(3000);
                widgetsPage.getStartbutton().click();
                Thread.sleep(3000);
                widgetsPage.getStartbutton().click();

            }

            @Test
            public void tabs() throws InterruptedException {
            WebElement tab= widgetsPage.getMainWidgetsclick();
            js.executeScript("arguments[0].scrollIntoView(true);",tab);
            tab.click();
            widgetsPage.getTabsmain().click();
            widgetsPage.getOriginclick().click();
            Thread.sleep(2000);
            widgetsPage.getUseclick().click();
            }

            @Test
            public void toolTips(){
                WebElement tooltip= widgetsPage.getMainWidgetsclick();
                js.executeScript("arguments[0].scrollIntoView(true);",tooltip);
                        tooltip.click();
                    widgetsPage.getTooltipsmain().click();

            }





















}
