package com.Eleap.Algorithms.com.Admin.page;

import com.Eleap.Algorithms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainingPathsAdminPage extends BasePage {
    public TrainingPathsAdminPage(WebDriver driver) {
        super(driver);
    }

    String SITE_URL = ("https://largeaccounttest.eleapdev.com/career_paths/");

    @FindBy(css = "[data-target='#addPathModal']")
    private WebElement addTrainingPathButton;

    @FindBy(css = ".modal-body [name='name']")
    private WebElement nameField;

    @FindBy(css = ".modal-body #save-training-path")
    private WebElement addTrainingPath;

    @FindBy(css = "[name='active']")
    private WebElement activeDropdown;

    @FindBy(css = "[name='active'] [value='1']")
    private WebElement chooseYes;

    @FindBy(xpath = "//table/tbody/tr[2]/td[6]/a")
    private WebElement trainingPathToggle;

    @FindBy(xpath = "//a[text()='AutoTrainingPath']")
    private WebElement trainingPathPage;

    @FindBy(css = ".alert.alert-success\"")
    private WebElement success;

    @FindBy(xpath = "//table/tbody/tr[2]/td[7]/a[2]")
    private WebElement deleteTrainingPath;

    @FindBy(xpath = "//a[text()='Manage TRAINING PATH']")
    private WebElement manageTrainingPath;

    @FindBy(css = ".ml-3.btn.btn-primary")
    private WebElement addNewCourseButton;

    @FindBy(css = "[name='name']")
    private WebElement filterNameCourse;

    @FindBy(css = ".filter-btn-sect .btn-default")
    private WebElement filterButton;

    @FindBy(css = "[name='id_course[]']")
    private WebElement chooseCourse;

    @FindBy(css = "#trigger-delete")
    private WebElement addSelectedButton;

    @FindBy(css = ".submenu > li:nth-child(1)")
    private WebElement trainingPathDetails;

    @FindBy(xpath = "//h2[text()='Courses']")
    private WebElement coursesSection;


    public void clickAddTrainingPathButton() {
        addTrainingPathButton.click();
    }

    public void fillNameField(CharSequence param) {
        waitForElementToBeClickable(driver, nameField, 10);
        nameField.sendKeys(param);
    }

    public void addTrainingPath() {
        addTrainingPath.click();
    }

    public void clickActiveDropdown() throws InterruptedException {
        scrollDown(driver);
        activeDropdown.click();
    }


    public void clickChooseYes() {
        waitForElementToBeClickable(driver, chooseYes, 10);
        chooseYes.click();
    }

    public void clickTrainingPathToggle() throws InterruptedException {
        scrollElementDisplayed(driver, trainingPathToggle);
        trainingPathToggle.click();
    }


    public TrainingPathsAdminPage clickDeleteButton() {
        deleteTrainingPath.click();
        alertMethod(driver);
        return this;
    }

    public void clickManageTrainingPath() {
        manageTrainingPath.click();
    }

    public void clickAddNewCourseButton() {
        addNewCourseButton.click();
    }

    public void goToTrainingPathsSection() {
        driver.get(SITE_URL);
    }

    public void fillFilterNameCourse(CharSequence param) {
        filterNameCourse.sendKeys(param);
    }

    public void clickFilterButton() {
        filterButton.click();
    }

    public void clickChooseCourse() {
        chooseCourse.click();
    }

    public void clickTrainingPathDetails() {
        waitForElementToBeClickable(driver, trainingPathDetails, 10);
        trainingPathDetails.click();
    }

    public void clickAddSelectedButton() {
        waitForElementToBeClickable(driver, addSelectedButton, 10);
        addSelectedButton.click();
        alertMethod(driver);
    }


    public TrainingPathsAdminPage createTrainingPath() throws InterruptedException {
        goToTrainingPathsSection();
        clickAddTrainingPathButton();
        fillNameField("AutoTrainingPath");
        clickActiveDropdown();
        clickChooseYes();
        addTrainingPath();
        return this;

    }

    public TrainingPathsAdminPage crateTrainingPathNegativeTest() throws InterruptedException {
        goToTrainingPathsSection();
        clickAddTrainingPathButton();
        clickActiveDropdown();
        clickChooseYes();
        addTrainingPath();
        return this;
    }

    public TrainingPathsAdminPage deactivateTrainingPath() throws InterruptedException {
        clickTrainingPathToggle();
        return this;
    }

    public TrainingPathsAdminPage clickTrainingPath() throws InterruptedException {
        scrollElementDisplayed(driver, trainingPathPage);
        trainingPathPage.click();
        return this;
    }


    public TrainingPathsAdminPage addCourseOnTrainingPath() throws InterruptedException {
        clickManageTrainingPath();
        clickAddNewCourseButton();
        fillFilterNameCourse("AutoCourse");
        clickFilterButton();
        clickChooseCourse();
        clickAddSelectedButton();
        clickTrainingPathDetails();
        scrollElementDisplayed(driver, coursesSection);
        return this;
    }

    public TrainingPathsAdminPage addCourSingedUserTrainingPath() {
        clickTrainingPathDetails();
        clickManageTrainingPath();
        clickAddNewCourseButton();
        fillFilterNameCourse("AutoCourse");
        clickFilterButton();
        clickChooseCourse();
        clickAddSelectedButton();
        return this;
    }

    public TrainingPathsAdminPage checkCompletedTrainingPath() throws InterruptedException {
        goToTrainingPathsSection();
        clickTrainingPath();

        return this;

    }

}