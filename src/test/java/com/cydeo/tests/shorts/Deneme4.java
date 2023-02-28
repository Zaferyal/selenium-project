package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Deneme4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://bestbuy.com");

       // sayfada kaç tane button tag bulunduğunu yazdırın
        List<WebElement> buttonList =driver.findElements(By.tagName("button"));

       // her bir button üzerindeki yazıları yazdırın.
        System.out.println(buttonList.size());
        for (WebElement each: buttonList) {
            System.out.println(each.getText());

        }


    }
}
/*
bestbuy sayfasına gidin


 */