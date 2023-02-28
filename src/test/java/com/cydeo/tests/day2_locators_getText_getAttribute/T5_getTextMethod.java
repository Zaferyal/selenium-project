package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getTextMethod {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com/registration_form");

       WebElement header= driver.findElement(By.tagName("h2"));

       String expectedHeaderText = "Registration form";
       String actualHeaderText = header.getText();
       if(actualHeaderText.equals(expectedHeaderText)){
           System.out.println("Passed");
       }

       //4
        WebElement firstNameInput = driver.findElement(By.className("form-control"));
       //5
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
        System.out.println("actualPlaceHolder = " + actualPlaceHolder);

        if (actualPlaceHolder.equals(expectedPlaceHolder)) {

            System.out.println("PlaceHolder attribute verification passed"  );
        }else{
            System.out.println(" Failed");
        }



    }
    /*
    TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first nam
     */
}
