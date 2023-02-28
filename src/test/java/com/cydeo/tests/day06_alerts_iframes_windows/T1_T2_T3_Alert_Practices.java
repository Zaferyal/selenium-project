package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }

    @Test
    public void information_alert_test1(){
        //TC #1: Information alert practice

        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();

        //Thread.sleep(1000);
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed if assertion fails:
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed!");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void confirmation_alert_test2(){
        //TC #2: Confirmation alert practice

        //3. Click to “Click for JS Confirm” button
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmationAlert.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        //Thread.sleep(1000);
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());


    }
   @Test
    public void promt_alert_test3() throws InterruptedException {

       // 3. Click to “Click for JS Prompt” button
        //4. Send “hello” text to alert
        //5. Click to OK button from the alert
       //6. Verify “You entered: hello” text is displayed.

       WebElement JsPromtAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        JsPromtAlertBtn.click();
        Alert alert = driver.switchTo().alert();


        alert.sendKeys("hello"+Keys.ENTER);
       Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);


        WebElement helloText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(helloText.isDisplayed());






   }
}

