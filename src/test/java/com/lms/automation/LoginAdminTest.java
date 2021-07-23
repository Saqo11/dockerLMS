package com.lms.automation;

import org.junit.jupiter.api.Test;

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


    }


}
