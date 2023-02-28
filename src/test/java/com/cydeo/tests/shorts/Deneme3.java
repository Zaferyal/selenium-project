package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Deneme3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://facebook.com");
       WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("zaferyalcin@hotmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("124");
        WebElement logIn= driver.findElement(By.xpath("//button[@value='1']"));
        logIn.click();
        WebElement result = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        System.out.println(result.getText());
        driver.close();
    }
}
