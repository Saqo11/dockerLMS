package com.Eleap.Algorithms.com.Admin.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ManageCategoriesManageEventsTab extends BaseTab {
    public ManageCategoriesManageEventsTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='submenu']//li[4]")
    private WebElement manageCategorySection;

    @FindBy(xpath = "//button[text()=' Add new category']")
    private WebElement addNewCategory;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement fillName;

    @FindBy(xpath = "//*[@id='add-new-category-btn']")
    private WebElement addButton;

    @FindBy(xpath = "//div[3]/div[2]/div/table/tbody/tr[2]/td[4]/a[1]")
    private WebElement editManage;

    @FindBy(xpath = "//tbody//tr[2]//a[@class='ml destructive']")
    private WebElement deleteCategory;

    @FindBy(xpath = "//span[text()='3']")
    private WebElement assignedUserSection;

    @FindBy(xpath = "//a[text()='click here']")
    private WebElement clickHere;

    @FindBy(xpath = "//ul[@class='submenu']//li[5]")
    private WebElement ManageEvents;

    @FindBy(xpath = "//a[text()='add new event']")
    private WebElement addNewEvent;

    @FindBy(xpath = "//span[text()='Select course']")
    private WebElement selectCourse;

    @FindBy(xpath = "//li[text()='AutoCourse']")
    private WebElement autCourseClick;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement nameDescription;

    @FindBy(xpath = "//input[@name='location']")
    private WebElement location;

    @FindBy(xpath = "//input[@name='seats']")
    private WebElement seats;

    @FindBy(xpath = "//select[@name='starting']")
    private WebElement starting;

    @FindBy(xpath = "//select[@name='starting']//option[text()='Fixed time:']")
    private WebElement optionFixTime;

    @FindBy(xpath = "//select[@name=\"start_hour\"]")
    private WebElement startHour;

    @FindBy(xpath = "//select[@name=\"start_minute\"]")
    private WebElement startMinute;

    @FindBy(xpath = "//select[@name='finishing']//option[text()='Fixed time:']")
    private WebElement finishing;

    @FindBy(xpath = "//option[text()='Fixed time:']")
    private WebElement fixTime;

    @FindBy(xpath = "//select[@name=\"finish_hour\"]")
    private WebElement finishHour;

    @FindBy(xpath = "//select[@name=\"finish_minute\"]")
    private WebElement finishMinute;

    @FindBy(xpath = "//label[@class=\"toggle_checkbox\"]")
    private WebElement labelToggle;

    @FindBy(xpath = "//button[@id=\"add-event-btn\"]")
    private WebElement addEvent;

    @FindBy(xpath = "//div[text()='The Event has been added. Click on the Event below to continue.']")
    private WebElement eventHasBeenAdded;

    @FindBy(xpath = "//button[text()='Apply Filters']")
    private WebElement applyFilter;

    @FindBy(xpath = " //div[@class='alert alert-success']")
    private WebElement displayedEventMessage;

    @FindBy(xpath = "//label[text()='Starting']")
    private WebElement displayedStarting;


    public void clickManegeCategory() {
        manageCategorySection.click();
    }

    public void clickAddNewCategory() {
        addNewCategory.click();
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void fillNameField(CharSequence param) {
        waitForElementToVisibilityOfElement(driver, fillName, 10);
        fillName.sendKeys(param);
    }

    public void clickEditButton() {
        editManage.click();
    }

    public void clickDeleteButton() {
        deleteCategory.click();
    }

    public void clickAssignUserSection() {
        assignedUserSection.click();

    }

    public void clickHereButton() {
        clickHere.click();
    }

    public void clickManageEventsSection() {
        ManageEvents.click();
    }

    public void clickNewEventButton() {
        addNewEvent.click();
    }

    public void clickSelectCourseButton() {
        selectCourse.click();
    }

    public void clickAutCourseButton() {
        autCourseClick.click();
    }

    public void fillNameFields(CharSequence param) {
        name.sendKeys(param);
    }

    public void fillSeatsField(CharSequence param) {
        seats.sendKeys(param);
    }

    public void fillNameDescriptionField(CharSequence param) {
        nameDescription.sendKeys(param);
    }

    public void fillLocationField(CharSequence param) {
        location.sendKeys(param);
    }


    public void clickStarting() {
        starting.click();
    }

    public void clickOptionFixTime() {
        optionFixTime.click();
    }

    public void fillStartHour(CharSequence param) {
        startHour.sendKeys(param);
    }

    public void fillStartMinute(CharSequence param) {
        startMinute.sendKeys(param);
    }

    public void fillFinishHour(CharSequence param) {
        finishHour.sendKeys(param);
    }

    public void fillFinishMinute(CharSequence param) {
        finishMinute.sendKeys(param);
    }

    public void clickFinishing() {
        finishing.click();
    }

    public void clickFixTime() {
        fixTime.click();
    }

    public void clickAddEvent() {
        addEvent.click();
    }

    public void clickLabelToggle() {
        labelToggle.click();
    }

    public void clickApplyFilter() {
        applyFilter.click();
    }

    public void ifDisplayedEventMessage() {
        displayedEventMessage.isDisplayed();
    }


    public ManageCategoriesManageEventsTab manageCategoriesAddNewCategoryButton() {
        clickManegeCategory();
        clickAddNewCategory();
        fillNameField("NewFiled");
        clickAddButton();
        clickEditButton();
        fillNameField("NewFiled1");
        clickAddButton();
        clickDeleteButton();
        alertMethod(driver);
        return this;

    }

    public ManageCategoriesManageEventsTab manage_Events_Add_New_Event_Name_Filter() throws InterruptedException {
        clickAssignUserSection();
        clickHereButton();
        clickManageEventsSection();
        clickNewEventButton();
        clickSelectCourseButton();
        clickAutCourseButton();
        fillNameFields("name");
        fillSeatsField("120");
        scrollElementDisplayed(driver, displayedStarting);
        fillNameDescriptionField("Ok");
        fillLocationField("ok");
        clickStarting();
        clickOptionFixTime();
        fillStartHour("4");
        fillStartMinute("30");
        clickFinishing();
        clickFixTime();
        fillFinishHour("5");
        fillFinishMinute("30");
        clickLabelToggle();
        clickAddEvent();
        fillNameFields("name");
        clickApplyFilter();
        clickDeleteButton();
        alertMethod(driver);
        return this;
    }


}
