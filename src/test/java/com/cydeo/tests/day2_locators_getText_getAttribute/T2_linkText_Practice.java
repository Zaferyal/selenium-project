package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkText_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

       // 3- Click to A/B Testing from top of the list.
        driver.findElement(By.linkText("A/B Testing")).click();

        //4- Verify title is:
        String eT = "No A/B Test";
        String aT= driver.getTitle();
        if(aT.equals(eT)){
            System.out.println("Title is Passed");
        }else{
            System.out.println("invalid");
        }
        //5- Go back to home page by using the .back();
        driver.navigate().back();

       // 6- Verify title equals:
        String excT = "Practice";
        String actT= driver.getTitle();
        if(actT.equals(excT)){
            System.out.println("Title is Passed");
        }else{
            System.out.println("invalid");
        }

     driver.close();

        /*
        TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practic
         */
    }
}
