package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) {

        //1-Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2-Create the instance of Chrome browser driver
        WebDriver driver = new ChromeDriver();

        //3- test if driver and browser are working as expected
        driver.get("https://www.google.com");

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();
    }
}

