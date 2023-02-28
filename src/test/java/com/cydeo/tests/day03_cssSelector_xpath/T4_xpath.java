package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_xpath {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        String expectedLoginText = "Log In";

        //                    //tagName[@attribute='value']
        WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log In']"));
        String actualLoginText= loginbutton.getAttribute("value");
        if (actualLoginText.equals(expectedLoginText)) {
            System.out.println("Passet");
        }else{
            System.out.println("Failed");
        }


    }
}
