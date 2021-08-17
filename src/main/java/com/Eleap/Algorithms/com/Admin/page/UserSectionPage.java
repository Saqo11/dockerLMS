package com.Eleap.Algorithms.com.Admin.page;

import com.Eleap.Algorithms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSectionPage extends BasePage {
    public UserSectionPage(WebDriver driver) {
        super(driver);
    }

    String SITE_URL = ("https://largeaccounttest.2leap.com/users/");

    @FindBy(xpath = "//button[text()='Add new user']")
    private WebElement addNewUserButton;

    @FindBy(xpath = "//div/div[2]/form/div[1]/div[1]/select")
    private WebElement title;

    @FindBy(css = "[name='first_name']")
    private WebElement nameField;

    @FindBy(css = "[name='middle_name']")
    private WebElement middleName;

    @FindBy(css = "[name='last_name']")
    private WebElement lastName;

    @FindBy(css = "[name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[text()='Add User']")
    private WebElement addUserButton;

    @FindBy(css = "[placeholder='Search by Name or Email']")
    private WebElement searchByEmail;

    @FindBy(css = ".d-flex .text-nowrap.clip-text-35")
    private WebElement displayedUser;

    @FindBy(css = "[name='id[]']")
    private WebElement checkUser;

    @FindBy(css = ".btn.btn-default")
    private WebElement applyFilters;

    @FindBy(css = ".select_items_button")
    private WebElement deleteButton;

    @FindBy(css = ".alert.alert-success")
    private WebElement success;

    @FindBy(css = "[onclick='showCustomFilterSection(this)']")
    private WebElement customFieldButton;

    @FindBy(xpath = "//a[text()='ADD FILTER']")
    private WebElement addFilterButton;

    @FindBy(css = "[title='Deactivate']")
    private WebElement deactivateButton;

    @FindBy(css = ".text-nowrap.clip-text-35")
    private WebElement userButton;

    @FindBy(css = "[placeholder='Search by Course Name']")
    private WebElement serByCourseName;

    @FindBy(xpath = "//a[text()='AutoCourse']")
    private WebElement displayCourse;

    @FindBy(css = "#wizard-steps> li:nth-child(1)")
    private WebElement userProfile;

    @FindBy(css = ".ui-dropdown-toggle")
    private WebElement dropdownPhoto;

    @FindBy(css = ".allign-to-input.text-uppercase")
    private WebElement uploadPicture;

    @FindBy(css = "#upload-form-profile  .input_file_uploader")
    private WebElement inputFile;

    @FindBy(css = "#upload-form-profile .btn.btn-default")
    private WebElement uploadFile;

    @FindBy(css = ".btn.btn-link.pl-0.pr-0")
    private WebElement editUserButton;

    @FindBy(css = ".btn.btn-primary")
    private WebElement saveChanges;

    @FindBy(css = ".right_part_pr .text-uppercase")
    private WebElement chooseFileButton;

    @FindBy(css = ".right_part_pr #upload_file_for")
    private WebElement uploadFileForUser;

    @FindBy(css = ".btn-link.btn-grey-link")
    private WebElement changePass;

    @FindBy(css = "[name='new_password']")
    private WebElement newPass;

    @FindBy(css = "[name='confirm_password']")
    private WebElement confirmPass;

    @FindBy(css = ".btn.btn-primary.mt-3")
    private WebElement setPass;

    @FindBy(css = ".btn.btn-primary.see-instructions-btn")
    private WebElement specialInstruction;

    @FindBy(css = ".btn.btn-primary.mt-3.d-flex.align-items-center")
    private WebElement goToDashboard;

    @FindBy(css = ".enjoyhint_skip_btn.mySkip")
    private WebElement skipTour;

    @FindBy(css = ".resp-submenu ul> li:nth-child(4)")
    private WebElement UserGroupSection;

    @FindBy(css = ".btn.btn-primary.mr")
    private WebElement addUserGroupButton;

    @FindBy(css = "[placeholder='Name *']")
    private WebElement groupNameField;

    @FindBy(css = ".btn.m-0.btn-primary")
    private WebElement addGroup;

    @FindBy(xpath = "//a[text()='AutoRobot']")
    private WebElement autoRobotGroup;

    @FindBy(css = "tbody > tr:nth-child(2) .ml.destructive")
    private WebElement deleteUserGroup;


    public UserSectionPage goUserSection() {
        driver.get(SITE_URL);
        return this;
    }

    private void clickAddNewUserButton() {
        addNewUserButton.click();
    }

    private void chooseTitle() {
        waitForElementToVisibilityOfElement(driver, title, 15);
        selectMethod(title, 1);
    }

    private void fillNameField(CharSequence param) {
        nameField.sendKeys(param);
    }

    private void fillMiddleName(CharSequence param) {
        middleName.sendKeys(param);
    }

    private void fillLastName(CharSequence param) {
        lastName.sendKeys(param);
    }

    private void fillEmailField(CharSequence param) throws InterruptedException {
        scrollElementDisplayed(driver, lastName);
        emailField.sendKeys(param);
    }

    private void clickAddUser() throws InterruptedException {
        scrollDown(driver);
        addUserButton.click();
    }

    private void fillSearchByEmailField(CharSequence param) {
        searchByEmail.sendKeys(param);
    }

    private void clickApplyFilters() {
        applyFilters.click();
    }

    private void clickToggle() {
        waitForElementToBeClickable(driver, deactivateButton, 10);
        deactivateButton.click();
    }

    private void clickCustomFieldButton() {
        customFieldButton.click();
    }

    private void clickAddFilterButton() {
        waitForElementToBeClickable(driver, addFilterButton, 10);
        addFilterButton.click();
    }

    private void clickUserButton() {
        userButton.click();
    }

    private void fillSerByCourseName(CharSequence param) {
        serByCourseName.sendKeys(param);
    }


    private void clickDeleteButton() {
        checkUser.click();
        waitForElementToBeClickable(driver, deleteButton, 10);
        deleteButton.click();
        alertMethod(driver);
    }

    private void deleteTheUser() {
        try {
            clickDeleteButton();

            boolean UserWasDeleted = success.isDisplayed();
            assertEquals(true, UserWasDeleted);

        } catch (Exception e) {


        }
    }

    private void clickUserProfile() {
        userProfile.click();
    }

    private void clickDropdownPhoto() {
        dropdownPhoto.click();
    }

    private void clickUploadPicture() {
        waitForElementToBeClickable(driver, uploadPicture, 15);
        uploadPicture.click();
    }

    private void clickInputFile() {
        inputFile.sendKeys("C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\dfdfdf.png");
    }

    private void clickUploadFileButton() {
        uploadFile.click();

    }

    private void clickEditUserButton() {
        editUserButton.click();

    }

    private void clickSaveChanges() throws InterruptedException {
        scrollDown(driver);
        saveChanges.click();

    }

    private void clickChooseFileButton() throws InterruptedException {
        chooseFileButton.click();
    }


    private void addFileFOrUSer() {
        uploadFileForUser.sendKeys("C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\dfdfdf.png");
    }

    private void clickChangePass() {
        changePass.click();
    }

    private void clickSetPass() {
        setPass.click();
    }

    private void addNewPass(CharSequence param) {
        waitForElementToBeClickable(driver, newPass, 10);
        newPass.sendKeys(param);
    }

    private void confirmPassField(CharSequence param) {
        waitForElementToBeClickable(driver, newPass, 10);
        confirmPass.sendKeys(param);
    }

    private void clickSpecialButton() {
        specialInstruction.click();
    }

    private void clickGoToDashboard() {
        waitForElementToBeClickable(driver, goToDashboard, 10);
        goToDashboard.click();
    }

    private void clickSkipTour() {
        waitForElementToBeClickable(driver, skipTour, 10);
        skipTour.click();
    }

    private void clickUserGroupSection() {
        UserGroupSection.click();
    }

    private void clickAddUserGroupButton() {
        addUserGroupButton.click();
    }

    private void clickAddGroupButton() {
        addGroup.click();
    }

    private void fillGroupNameField(CharSequence param) {
        waitForElementToBeClickable(driver, groupNameField, 10);
        groupNameField.sendKeys(param);
    }

    private void deleteGroup() throws InterruptedException {

        try {
            autoRobotGroup.isDisplayed();
            waitForElementToBeClickable(driver, deleteUserGroup, 10);
            deleteUserGroup.click();
            alertMethod(driver);
            boolean UserWasDeleted = success.isDisplayed();
            assertEquals(true, UserWasDeleted);
        } catch (Exception e) {

        }
    }


    public UserSectionPage createNewUser() throws InterruptedException {
        clickAddNewUserButton();
        chooseTitle();
        fillNameField("Robot");
        fillMiddleName("Auto");
        fillLastName("User");
        fillEmailField("rorborbfrf@gcv.ua");
        clickAddUser();

        return this;

    }

    public UserSectionPage deleteUser() {
        fillSearchByEmailField("rorborbfrf@gcv.ua");
        clickApplyFilters();
        deleteTheUser();
        return this;

    }

    public UserSectionPage deleteUserGroup() throws InterruptedException {
        clickUserGroupSection();
        deleteGroup();
        return this;

    }

    public UserSectionPage leaveAllFieldEmpty() throws InterruptedException {
        clickAddNewUserButton();
        clickAddUser();
        return this;
    }

    public UserSectionPage chooseCustomField() {
        clickCustomFieldButton();
        clickAddFilterButton();
        return this;

    }

    public UserSectionPage deactivateUser() {
        fillSearchByEmailField("rorborbfrf@gcv.ua");
        clickApplyFilters();
        clickToggle();
        return this;

    }

    public UserSectionPage getCourseAssignedUser() throws InterruptedException {
        goUserSection();
        fillSearchByEmailField("rorborbfrf@gcv.ua");
        clickApplyFilters();
        clickUserButton();
        fillSerByCourseName("AutoCourse");
        clickApplyFilters();
        scrollElementDisplayed(driver, displayCourse);
        return this;

    }

    public UserSectionPage uploadPhotoForUser() {
        clickDropdownPhoto();
        clickUploadPicture();
        clickInputFile();
        clickUploadFileButton();

        return this;
    }

    public UserSectionPage editUser() throws InterruptedException {
        clickEditUserButton();
        fillNameField("manual");
        clickSaveChanges();
        return this;

    }

    public UserSectionPage getUserProfile() throws InterruptedException {
        fillSearchByEmailField("rorborbfrf@gcv.ua");
        clickApplyFilters();
        clickUserButton();
        clickUserProfile();

        return this;

    }

    public UserSectionPage uploadFileUser() throws InterruptedException {
        clickChooseFileButton();
        addFileFOrUSer();
        return this;

    }

    public UserSectionPage changePassword() throws InterruptedException {
        clickChangePass();
        addNewPass("sdsddsdsds123");
        confirmPassField("sdsddsdsds123");
        clickSetPass();

        return this;

    }

    public UserSectionPage newPageUserSettings() throws InterruptedException {
        clickSpecialButton();
        clickGoToDashboard();
        clickSkipTour();

        return this;
    }

    public UserSectionPage addUserGroup() {
        clickUserGroupSection();
        clickAddUserGroupButton();
        fillGroupNameField("AutoRobot");
        clickAddGroupButton();


        return this;
    }
}
