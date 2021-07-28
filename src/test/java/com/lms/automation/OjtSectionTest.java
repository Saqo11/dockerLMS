package com.lms.automation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class OjtSectionTest extends MainTest {


    @BeforeEach
    public void singIn() throws InterruptedException {
        loginAdminPage
                .goTo()
                .fillEmailField("saqo21harutyunyan+19@gmail.com")
                .fillPassField("7rujd12f")
                .clickLoginButton()
                .ifDisplayedText();
        ojtSectionPage
                .goToOjtSection();
    }


    @Test
    public void newFieldForOJT() throws InterruptedException {
        ojtSectionPage
                .createOjtField();
    }

    @Test
    public void addNewOjtTraining() throws InterruptedException {
        ojtSectionPage
                .addOjtTraining();

        boolean addOjtSuccess = driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed();
        assertTrue(addOjtSuccess);
    }

    @Test
    public void leaveEmptyAllField() throws InterruptedException {
        ojtSectionPage
                .leaveEmptyAllField();

        boolean addOjtSuccess = driver.findElement(By.xpath("//small[text()='This field is required, or format is invalid.']")).isDisplayed();
        assertTrue(addOjtSuccess);
    }

    @Test
    public void uploadBulk() throws InterruptedException {
        ojtSectionPage
                .addBulk();

        boolean addBulkFile = driver.findElement(By.cssSelector("a.text-nowrap")).isDisplayed();
        assertTrue(addBulkFile);
    }

    @Test
    public void editOjtSection() throws InterruptedException {
        ojtSectionPage
                .addOjtTraining()
                .editOjt();

        boolean editPage = driver.findElement(By.xpath("//tr//td[2]")).isDisplayed();
        assertTrue(editPage);
    }

    @Test
    public void  displayUserOjt() throws InterruptedException {

        ojtSectionPage
                .addOjtTraining()
                .chooseUserOjt();
        boolean getText = driver.findElement(By.xpath("//div[text()='total ojt hours']")).isDisplayed();
        assertTrue(getText);

    }


    @AfterEach
    public void deleteOjt() {
        ojtSectionPage
                .deleteOjt();
        try {
            boolean addOjtSuccess = driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed();
            assertTrue(addOjtSuccess);
        } catch (Exception e) {

        }

    }


}
