package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Deneme {
    public static void main(String[] args) {

        WebDriver driver =  WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

     WebElement search = driver.findElement(By.className("gLFyf"));
    search.sendKeys("رب زدني علما" + Keys.ENTER);

    }
}
