package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO3_GettingPageTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://cydeo.com");

        System.out.println(driver.getTitle());

       //Check if title of the page is Cydeo or Not.
        if(driver.getTitle().equalsIgnoreCase("cydeo")){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");

        }
        }
    }

