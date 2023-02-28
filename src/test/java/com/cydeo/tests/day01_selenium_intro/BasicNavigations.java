package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.tesla.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //.get() ile .navigate().to() aynı işi gören metodlardır. farkları yok.
       String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        driver.navigate().back();
        Thread.sleep(10000); //10 saniye burada bekleyecek sonra bir sonraki adıma geçecek.

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.amazon.com"); // this method accept String argument for URL

        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.manage().window().maximize(); // This line will maximize the currently opened browser.

        driver.close();//closes only the currently focused window.
        driver.quit();//closes all-of-the opened browser.



    }
}
