package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com");

        //3-Expected: cydeo
        String expectedInUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();
        driver.manage().window().maximize();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!!!");

        }else{
            System.out.println("URL verification FAILED!!!");
        }
        //4- Title: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }



    driver.close();

    }
}

/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
 */



