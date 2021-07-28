package com.lms.automation;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAdminTest extends MainTest {
    @Test
    public void dsdsd() {
        loginAdminPage.goTo();
        WebElement displayedCourse = driver.findElement(By.xpath("//h1[text()='Login into your account']"));
       boolean courseDisplay = displayedCourse.isDisplayed();
       assertEquals(true, courseDisplay);

    }
//    public void SingInPositiveTest() {
//        loginAdminPage.goTo()
//                .fillEmailField("hermineadamyan.dev@gmail.com")
//                .fillPassField("testtest1")
//                .clickLoginButton()
//                .ifDisplayedText();
//        System.out.println("All is good!!!!");
//
//    }
//
//    @Test
//    public void SingInNegativeTest() {
//        loginAdminPage.goTo()
//                .fillEmailField("saqo21harustyunyan+19@gmail.com")
//                .fillPassField("7rujds12f")
//                .clickLoginButton()
//                .ifDisplayedAnErrorMessage();
//
//
//
//    }


}
