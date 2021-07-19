package com.Eleap.Algorithms.com.Admin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAssignedSelfEnrollmentTab extends BaseTab {

    public MyAssignedSelfEnrollmentTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/ul/li[2]")
    private WebElement myAssignCourses;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
    private WebElement courseField;

    @FindBy(xpath = "//li[text()='Users']")
    private WebElement userCategory;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[text()='AutoCourse']")
    private WebElement ifAutoCourse;

    @FindBy(xpath = "//input[@placeholder='Search by Course Name'] ")
    private WebElement fillCourseName;

    @FindBy(xpath = "//a[@title=\"AutoCourse\"]")
    private WebElement displayedCourse;

    @FindBy(xpath = "//ul[@class=\"submenu\"]//li[3]//a")
    private WebElement selfEnrollmentCourses;

    @FindBy(xpath = "//button[@class=\"btn ml-2 edit_btn\"]")
    private WebElement editEnrolment;

    public void ClickOnMyAssignedCourse() {
        myAssignCourses.click();
    }

    public void ifDisplayedCourse() {
        displayedCourse.isDisplayed();
    }

    public void fillCourseNameField(CharSequence param) {
        waitForElementToVisibilityOfElement(driver, fillCourseName, 10);
        fillCourseName.sendKeys(param);
    }

    public void ChooseUserCategory() {
        userCategory.click();
    }

    public void ClickSearchButton() {
        searchButton.click();
    }

    public void ClickCourseField() {
        courseField.click();

    }

    public void ClickSelfEnrollmentCourses() {
        selfEnrollmentCourses.click();
    }


    public MyAssignedSelfEnrollmentTab my_Assigned_Courses_Search_By_Course_Name() {
        ClickOnMyAssignedCourse();
        fillCourseNameField("AutoCourse");
        ClickCourseField();
        ChooseUserCategory();
        ClickSearchButton();
        return this;
    }


    public MyAssignedSelfEnrollmentTab add_Self_Enrollment_courses() {
        ClickSelfEnrollmentCourses();
        return this;

    }


}
