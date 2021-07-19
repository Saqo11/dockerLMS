package com.Eleap.Algorithms.user.page;

import com.Eleap.Algorithms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDashboardPage extends BasePage {
    public UserDashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-0")
    private WebElement myAssignedTraining;

    @FindBy(css = ".fa-info-circle ")
    private WebElement hoverTopDash;

    @FindBy(css = ".item-name-link")
    private WebElement trainingPath;

    @FindBy(xpath = "//a[text()='AutoCourse']")
    private WebElement course;

    @FindBy(css = ".btn.btn-primary")
    private WebElement startCourse;

    @FindBy(xpath = "//label[1]//input")
    private WebElement radiobutton;

    @FindBy(xpath = "//a[text()='Finish']")
    private WebElement finishButton;

    @FindBy(xpath = "//h2[text()='My Assigned Courses']")
    private WebElement scrollToMyAssignedCourse;

    @FindBy(xpath = "//h3[text()='AutoCourse']")
    private WebElement clickOnCourse;

    @FindBy(css = ".mt-5 ")
    private WebElement startYourQuiz;

    @FindBy(xpath = "//a[text()='Start quiz'] ")
    private WebElement startQuiz;

    @FindBy(css = ".test-navigator #finalize")
    private WebElement submitYourQuizAnswerButton;

    @FindBy(xpath = "//button[text()='Yes']")
    private WebElement yesButton;

    @FindBy(xpath = "//h4[text()='Quiz']")
    private WebElement scrollQuiz;

    @FindBy(xpath = "//a[text()='Retake quiz']")
    private WebElement retakeQuiz;

    @FindBy(css = ".btn.btn-primary")
    private WebElement startCourseQuiz;

    @FindBy(xpath = "//a[text()='Back to the course']")
    private WebElement backToTheCourse;


    public void clickTrainingPath() {
        trainingPath.click();
    }

    public void clickCourse() {
        waitForElementToBeClickable(driver, course, 10);
        course.click();
    }

    public void clickStartCourse() {
        startCourse.click();
    }

    public void clickFinishButton() {
        finishButton.click();
    }

    public void clickRadiobutton() {
        radiobutton.click();
    }

    public void chooseCourse() throws InterruptedException {
        scrollElementDisplayed(driver, scrollToMyAssignedCourse);
        clickOnCourse.click();

    }

    public void clickStartYourQuiz() {
        startYourQuiz.click();

    }

    public void clickStartQuiz() {
        startQuiz.click();
    }

    public void clickSubmitYourQuizAnswerButton() {
        submitYourQuizAnswerButton.click();
    }

    public void clickStartCourseQuiz () {
        startCourseQuiz.click();
    }

    public void clickYesButton() {
        waitForElementToBeClickable(driver, yesButton, 10);
        yesButton.click();
    }

    public void clickRetakeQuiz() throws InterruptedException {
        scrollElementDisplayed(driver, scrollQuiz);
        retakeQuiz.click();
        alertMethod(driver);
    }
    public void clickBackToTheCourse() throws InterruptedException {
        scrollElementDisplayed(driver, scrollQuiz);
        backToTheCourse.click();
    }

    public UserDashboardPage hoverMyAssignedTraining() throws InterruptedException {
        scrollElementDisplayed(driver, myAssignedTraining);
        return this;
    }

    public UserDashboardPage hoverTiVisitableTop() throws InterruptedException {
        scrollElementDisplayed(driver, hoverTopDash);
        return this;
    }


    public UserDashboardPage finishCourse() throws InterruptedException {
        clickTrainingPath();
        clickCourse();
        clickStartCourse();
        scrollDown(driver);
        clickRadiobutton();
        clickFinishButton();
        return this;
    }

    public UserDashboardPage revertQuiz() throws InterruptedException {
        chooseCourse();
        clickStartCourseQuiz();
        clickStartYourQuiz();
        clickStartQuiz();
        clickRadiobutton();
        clickSubmitYourQuizAnswerButton();
        clickYesButton();
        clickRetakeQuiz();
        return this;
    }
    public UserDashboardPage backToCourse() throws InterruptedException {
        clickRadiobutton();
        clickSubmitYourQuizAnswerButton();
        clickYesButton();
        clickBackToTheCourse();
        return this;
    }


}

