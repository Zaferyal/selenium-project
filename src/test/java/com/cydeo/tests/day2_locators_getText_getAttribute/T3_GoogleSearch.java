package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        // 3- Write “apple” in search box
        // a. Locate search box
        // b. enter "apple" key, and press ENTER.

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
       // 4- Press ENTER to search
       // googleSearchBox.sendKeys(Keys.ENTER);


        if(driver.getTitle().contains("apple")){ // startWith() metodunu da kullanabiliriz.
            System.out.println("Passed");
        }else{
            System.out.println("invalid");
        }

        //drive.close();
    }
}
/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word

 */
