package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Deneme2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://amazon.com");
        WebElement searchNutella =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchNutella.sendKeys("Nutella"+ Keys.ENTER);
       // searchNutella.submit(); Keys.Enter yerine bu metod da aynı sonucu verir.
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(result.getText());
        driver.close();


    }
}
