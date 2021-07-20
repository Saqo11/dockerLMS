package com.Eleap.Algorithms.com.Admin.page;

import com.Eleap.Algorithms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAdminPage extends BasePage {

    String SITE_URL = ("https://maven.apache.org/surefire/maven-failsafe-plugin/examples/inclusion-exclusion.html");


    public LoginAdminPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "Email")
    private WebElement fillEmail;

    @FindBy(name = "Pass")
    private WebElement fillPass;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement logInButton;

    @FindBy(xpath = "//h5[text()='Training Path completion']")
    private WebElement displayedText;

    @FindBy(xpath = "//div[text()='Login failed! Please try again.']")
    private WebElement displayedAnErrorMessage;


    public LoginAdminPage goTo() {
        driver.get(SITE_URL);
        return this;
    }

    public LoginAdminPage fillEmailField (String email) {
        fillEmail.sendKeys(email);
        return this;
    }

    public LoginAdminPage fillPassField (String pass) {
        fillPass.sendKeys(pass);
        return this;
    }

    public LoginAdminPage clickLoginButton() {
        logInButton.click();
        return this;
    }

    public LoginAdminPage ifDisplayedText() {
        displayedText.isDisplayed();

        return this;
    }

    public LoginAdminPage ifDisplayedAnErrorMessage() {
        displayedAnErrorMessage.isDisplayed();
        return this;
    }
}
