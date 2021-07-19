package com.Eleap.Algorithms.com.Admin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObservationChecklistTab extends BaseTab {
    public ObservationChecklistTab(WebDriver driver) {
        super(driver);
    }

    String SITE_URL = ("https://largeaccounttest.eleapdev.com/courses/");

    public ObservationChecklistTab goToCourses() {
        driver.get(SITE_URL);
        return this;

    }

    @FindBy(xpath = "//a[@class='mb btn btn-primary']")
    private WebElement addNewCourse;

    @FindBy(css = "#select2-type-selector-container")
    private WebElement courseType;

    @FindBy(xpath = "//option[text()='Observation Checklist']")
    private WebElement observationChecklist;

    @FindBy(css = "[name='name']")
    private WebElement nameField;

    @FindBy(xpath = "//*[@id='add-new-course-form']/div/div[1]/div/div[2]/span/span[1]/span/span[2]")
    private WebElement presentationButton;

    @FindBy(xpath = "//li[text()='Users']")
    private WebElement category;

    @FindBy(css = ".btn.btn-primary")
    private WebElement saveButton;

    @FindBy(css = "div .col-lg-6 .btn-primary")
    private WebElement addStatement;

    @FindBy(css = ".badge.badge-pill")
    private WebElement displayedObservationChecklist;

    @FindBy(css = "[name='statement']")
    private WebElement statement;

    @FindBy(css = "[name='grading_type']")
    private WebElement chooseGradingType;

    @FindBy(css = "[value='0']")
    private WebElement chooseYesNo;

    @FindBy(css = "[title='Stats']")
    private WebElement stats;

    @FindBy(css = ".btn.btn-default  i")
    private WebElement start;

    @FindBy(css = ".observation_list  #slide_go_there")
    private WebElement displayedObserChecklist;

    @FindBy(css = "[data-value='1']")
    private WebElement chooseYes;

    @FindBy(css = "[name='observer_comments']")
    private WebElement commentsText;

    @FindBy(css = ".btn.btn-primary.mb")
    private WebElement saveAssessment;

    @FindBy(css = ".progress-bar-status ")
    private WebElement displayedCompleted;


    public void clickAddNewCourseButton() {
        waitForElementToBeClickable(driver, addNewCourse, 15);
        addNewCourse.click();
    }

    public void clickCourseType() {
        waitForElementToBeClickable(driver, courseType, 15);
        courseType.click();
    }

    public void chooseObservationChecklist() {
        waitForElementToBeClickable(driver, observationChecklist, 15);
        observationChecklist.click();
    }

    public void fillNameField(CharSequence param) {
        nameField.sendKeys(param);
    }

    public void clickPresentationButton() {
        presentationButton.click();
    }

    public void chooseCategory() {
        category.click();
    }

    public void clickSaveButton() {
        waitForElementToBeClickable(driver, saveButton, 10);
        saveButton.click();
    }

    public void ifDisplayedObservationChecklist() {
        displayedObservationChecklist.isDisplayed();
    }

    public void fillStatement(CharSequence param) {
        statement.sendKeys(param);
    }

    public void clickChooseGradingType() {
        chooseGradingType.click();
    }

    public void clickChooseYesNo() {
        waitForElementToBeClickable(driver, chooseYesNo, 10);
        chooseYesNo.click();
    }

    public void clickStats() {
        stats.click();
    }

    public void clickAddStatement() {
        addStatement.click();
    }

    public void clickStartButton() {
        start.click();
    }

    public  void clickChooseYes(){
        chooseYes.click();
    }

    public  void fillText(CharSequence param){
        commentsText.sendKeys(param);
    }

    public  void clickSaveAssessmentButton(){
        waitForElementToBeClickable(driver,saveAssessment,15);
        saveAssessment.click();
    }

    public  void ifDisplayedCompleted() throws InterruptedException {
        waitForElementToBeClickable(driver,displayedCompleted,15);
        displayedCompleted.isDisplayed();
    }


    public ObservationChecklistTab addObservationLesson() throws InterruptedException {
        clickAddNewCourseButton();
        clickCourseType();
        chooseObservationChecklist();
        scrollElementDisplayed(driver, courseType);
        fillNameField("AutoCourse");
        clickPresentationButton();
        chooseCategory();
        scrollDown(driver);
        clickSaveButton();

        return this;
    }

    public ObservationChecklistTab createObservation() throws InterruptedException {
        scrollDown(driver);
        fillStatement("Good");
        clickChooseGradingType();
        clickChooseYesNo();
        clickAddStatement();
        return this;
    }

    public ObservationChecklistTab estimateUser() throws InterruptedException {
        clickStats();
        scrollDown(driver);
        clickStartButton();
        scrollElementDisplayed(driver,displayedObserChecklist);
        clickChooseYes();
        fillText("All is good");
        clickSaveAssessmentButton();
        return this;
    }

}
