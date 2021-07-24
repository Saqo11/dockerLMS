package com.lms.automation;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAdminTest extends MainTest {
    @Test
    public void SingInPositiveTest() {
        loginAdminPage.goTo()
                .fillEmailField("saqo21harutyunyan+19@gmail.com")
                .fillPassField("7rujd12f")
                .clickLoginButton()
                .ifDisplayedText();
        System.out.println("All is good!!!!");

    }

    @Test
    public void SingInNegativeTest() {
        loginAdminPage.goTo()
                .fillEmailField("saqo21harustyunyan+19@gmail.com")
                .fillPassField("7rujds12f")
                .clickLoginButton()
                .ifDisplayedAnErrorMessage();


        WebElement success = driver.findElement(By.cssSelector(".alert.alert-success"));
        boolean userWasAdded = success.isDisplayed();
        assertEquals(true, userWasAdded);


    }


}
