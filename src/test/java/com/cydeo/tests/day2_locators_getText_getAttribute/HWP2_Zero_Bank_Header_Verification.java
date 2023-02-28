package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Zero_Bank_Header_Verification {
    /*
    1-Open Chrome Browser
    2-Go to http://zero.webappsecurity.com/login.html
    3-Verify header text
    Expected: "Log in to ZeroBank"

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://zero.webappsecurity.com/login.html");
        WebElement headerText = driver.findElement(By.tagName("h3"));

        String expectedHeader ="Log in to ZeroBank";
        String actualHeader=headerText.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");

    }
    }
}
