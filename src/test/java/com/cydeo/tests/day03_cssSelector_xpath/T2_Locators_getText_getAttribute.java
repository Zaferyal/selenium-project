package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_Locators_getText_getAttribute {
    /*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
    Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
    Expected: Forgot your password?
 5- Verify “forgot password” href attribute’s value contains expected:
    Expected: forgot_password=yes
    PS: Inspect and decide which locator you should be using to locate web
    elements

     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

     // 3- Verify “remember me” label text is as expected:
        //    Expected: Remember me on this computer
        String expectedLabelText = "Remember me on this computer";
        String actualLabelText = driver.findElement(By.className("login-item-checkbox-label")).getText();

        if(actualLabelText.equals(expectedLabelText)) {
            System.out.println("Passed");

        }else{
            System.out.println("Failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        String expectedForgotPasswordText = "FORGOT YOUR PASSWORD?";
        WebElement forgotPasswordLink =driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPasswordText=forgotPasswordLink.getText();


        if(actualForgotPasswordText.equals(expectedForgotPasswordText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        // 5- Verify “forgot password” href attribute’s value contains expected:
        //    Expected: forgot_password=yes

        String expectedHrefAttribute = "forgot_password=yes";
        String actualHrefAttribute = forgotPasswordLink.getAttribute("href");
        if(actualHrefAttribute.contains(expectedHrefAttribute)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }




    }
}
