import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BookStore {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://139.59.27.246:3000/");
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        //for register
     /*   driver.findElement(By.className("nav-link")).click();
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lakshyahemnani21");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("lakshya");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshyahemnani2222@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("lakshya123");
        driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("lakshya123");
        driver.findElement(By.xpath("//button[@type='submit']")).click(); */

    //for login
        driver.findElement(By.className("nav-link")).click();
        driver.findElement(By.xpath("//input[@id='userNameOrEmail']")).sendKeys("lakshyahemnani21");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("lakshya123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='active']")));
        driver.findElement(By.xpath("//a[@class='active']")).click();
        //System.out.println(driver.findElement(By.xpath("//div[@class='row']")).getText());

        //for fetching
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-title']")));
        Thread.sleep(2000);
        List<WebElement> bookTitles = driver.findElements(By.xpath("//div[@class='card-title']"));
        System.out.println(bookTitles.size());
        for (WebElement title : bookTitles) {
            System.out.println(title.getText());


        }


        driver.findElement(By.xpath("//a[@href=\"/product/1\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']")));
        driver.findElement(By.xpath("//select[@class='form-control']")).click();
        driver.findElement(By.xpath("//option[@value='3']")).click();
        driver.findElement(By.xpath("//button[@id='cart']")).click();

        driver.findElement(By.xpath("//a[@class='active']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/product/12\"]")));
        driver.findElement(By.xpath("//a[@href=\"/product/12\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']")));
        driver.findElement(By.xpath("//select[@class='form-control']")).click();
        driver.findElement(By.xpath("//option[@value='3']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='cart']")));
        driver.findElement(By.xpath("//button[@id='cart']")).click();

        System.out.println(driver.findElement(By.xpath("//a[text()='Modern Indian Literature: Poems and Short Stories']")).getText());
        System.out.println(driver.findElement(By.xpath("//a[text()='Core Python Programming']")).getText());
        driver.findElement(By.xpath("//button[@class='btn-block btn btn-primary']")).click();

        driver.findElement(By.xpath("//input[@id='addressLine1']")).sendKeys("btm");
        driver.findElement(By.xpath("//input[@id='addressLine2']")).sendKeys("stage1");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("bangalore");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("karnataka");
        driver.findElement(By.xpath("//select[@id='country']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()='Australia']")));
        driver.findElement(By.xpath("//option[text()='Australia']")).click();
        driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("421501");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9021672867");
        driver.findElement(By.xpath("//button[text()='Add New Address']")).click();
       // driver.findElement(By.xpath("//input[@name='billingAddress']")).click();
        //driver.findElement(By.xpath("((//div[@class='form-check'])[2]")).click();
        driver.findElement(By.xpath("//a[@href='/cart']")).click();
//Proceed To Checkout
        driver.findElement(By.xpath("//button[text()='Proceed To Checkout']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed to Payment']")).click();
        //cardNumber
        driver.findElement(By.xpath("//input[@id='cardNumber']")).clear();
        driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("4242 4242 4242 4242");

        driver.findElement(By.xpath("//input[@id='expirationMonth']")).clear();
        driver.findElement(By.xpath("//input[@id='expirationMonth']")).sendKeys("12");

        driver.findElement(By.xpath("//input[@id='expirationYear']")).clear();
        driver.findElement(By.xpath("//input[@id='expirationYear']")).sendKeys("23");

    //driver.findElement(By.xpath("//button[text()='Add Card']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='paymentMethod']")));
        driver.findElement(By.xpath("//input[@name='paymentMethod']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed to PlaceOrder']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']")));
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'https://pay.stripe.com/receipts/payment')]")));
        driver.findElement(By.xpath("//a[contains(text(),'https://pay.stripe.com/receipts/payment')]")).click();











































    }


}
