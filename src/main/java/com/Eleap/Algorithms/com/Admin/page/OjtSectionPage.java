package com.Eleap.Algorithms.com.Admin.page;

import com.Eleap.Algorithms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OjtSectionPage extends BasePage {
    public OjtSectionPage(WebDriver driver) {
        super(driver);
    }

    String SITE_URL = ("https://largeaccounttest.eleapdev.com/ojt/");

    @FindBy(css = ".profile_content_main_sect.d-flex.flex-row-reverse #user")
    private WebElement dropdownProfileSettings;

    @FindBy(xpath = "//a[text()='Company Profile']")
    private WebElement companyProfilePage;

    @FindBy(css = ".submenu> li:nth-child(5)")
    private WebElement profileOjt;

    @FindBy(css = ".float-right.pt-2  [type='checkbox']")
    private WebElement activateOjt;

    @FindBy(css = "[title='OJT']")
    private boolean displayedOjtSection;

    @FindBy(css = "[placeholder='Enter the name for a new OJT field']")
    private WebElement newOJTField;

    @FindBy(xpath = "//button[text()='add new field']")
    private WebElement addNewField;

    @FindBy(xpath = "//div[1]/div[3]/div[3]/div[9]/div/div[2]/div/label/span")
    private WebElement activateOjtField;

    @FindBy(css = ".alert.alert-success")
    private WebElement successOK;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[6]/div/div[1]/div[1]/a")
    private WebElement hoverOjt;

    @FindBy(xpath = "//div[6]/div/div[1]/div[1]/ul/li[1]/a")
    private WebElement addDropDownOption;

    @FindBy(css = "#add_option_form [placeholder='Enter the value for the field option']")
    private WebElement fillOjtField;

    @FindBy(css = "#add_option_to_field")
    private WebElement saveOjtField;

    @FindBy(css = "[data-target='#manual_record']")
    private WebElement manualAdd;

    @FindBy(css = "#select2-users_ojt_select-container")
    private WebElement userField;

    @FindBy(css = ".select2-search__field")
    private WebElement userName;

    @FindBy(xpath = "//li[text()='Test, Test Trainee']")
    private WebElement displayUser;

    @FindBy(css = "#add_manual_record [placeholder='Add Skill']")
    private WebElement skill;

    @FindBy(css = "#add_manual_record [placeholder='Add Hours']")
    private WebElement hourOjt;

    @FindBy(css = "#add_manual_record [placeholder='Add Ojt']")
    private WebElement addOjt;

    @FindBy(css = "#add_manual_record #save_btn")
    private WebElement saveRecord;

    @FindBy(css = ".far.fa-trash-alt")
    private WebElement deleteOjt;

    @FindBy(css = ".btn.add-user-btn.btn-primary.mr.ml-2")
    private WebElement bulkImportButton;

    @FindBy(css = ".form-control.custom-ojt-file-input.input_file_uploader")
    private WebElement bulkFile;

    @FindBy(css = ".text-uppercase.btn.add-user-btn.btn-primary.float-left")
    private WebElement startImport;

    @FindBy(css = "a.text-nowrap")
    private WebElement displayOjt;

    @FindBy(css = ".edit_btn")
    private WebElement editButton;

    @FindBy(css = "#edit_record_form [placeholder='Add Skill']")
    private WebElement editSkill;

    @FindBy(xpath = "//*[@id='edit_record_form']/div[2]/button")
    private WebElement editSkillSave;

    @FindBy(css = "[title='Test, Test Trainee']")
    private WebElement ojtUser;


    private void hoverDropdownProfileSettings() {

        hoverEffect(driver, dropdownProfileSettings);

    }


    private void clickCompanyProfilePage() {
        waitForElementToBeClickable(driver, companyProfilePage, 10);
        companyProfilePage.click();

    }

    private void clickProfileOjt() {
        profileOjt.click();

    }

    private void fillNewOJTField(CharSequence param) throws InterruptedException {
        scrollDown(driver);
        newOJTField.sendKeys(param);


    }

    private void clickAddNewField() {
        addNewField.click();

    }

    private void clickActivateOjtField() throws InterruptedException {
        waitForElementInVisibilityOf(driver, successOK, 10);
        scrollElementDisplayed(driver, addNewField);
        activateOjtField.click();
    }

    public void goToOjtSection() {
        driver.get(SITE_URL);
    }

    private void addOption() throws InterruptedException {
        scrollDown(driver);
        hoverOjt.click();
        addDropDownOption.click();
    }

    private void SendKeysOjtField(CharSequence param) {
        waitForElementToVisibilityOfElement(driver, fillOjtField, 10);
        fillOjtField.sendKeys(param);
    }

    private void saveOjtField() {
        saveOjtField.click();
    }

    private void clickManualAdd() {
        manualAdd.click();
    }

    private void clickEditSkillSave() {
        editSkillSave.click();
    }

    private void addUser() {
        waitForElementToBeClickable(driver, userField, 10);
        userField.click();
        userName.sendKeys("Test, Test Trainee");
        waitForElementToBeClickable(driver, displayUser, 10);
        displayUser.click();
    }

    private void addSkill(CharSequence param) throws InterruptedException {
        scrollDown(driver);
        waitForElementToBeClickable(driver, skill, 15);
        skill.sendKeys(param);
    }

    private void editSkillSection(CharSequence param) {
        waitForElementToBeClickable(driver, editSkill, 15);
        editSkill.clear();
        editSkill.sendKeys(param);
    }

    private void sendHourOjt(CharSequence param) throws InterruptedException {
        hourOjt.sendKeys(param);
    }

    private void sendAddOjt(CharSequence param) throws InterruptedException {
        addOjt.sendKeys(param);
    }

    private void clickSaveRecord() {
        saveRecord.click();
    }

    private void clickStartImport() {
        startImport.click();
        waitForElementToVisibilityOfElement(driver, displayOjt, 10);
    }

    private void uploadBulk() {
        bulkFile.sendKeys("C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\Bulk.xls");

    }

    private void clickBulkImportButton() {
        waitForElementToBeClickable(driver, bulkImportButton, 15);
        bulkImportButton.click();
    }

    private void clickEditButton() throws InterruptedException {
        scrollHorizontal(driver);
        editButton.click();
    }

    private void clickDeleteButton() {
        try {
            deleteOjt.click();
            alertMethod(driver);

        } catch (Exception e) {
        }
    }

    private void clickOjtUser() throws InterruptedException {
        scrollDown(driver);
        ojtUser.click();
    }


    public OjtSectionPage createOjtField() throws InterruptedException {

        hoverDropdownProfileSettings();
        clickCompanyProfilePage();
        clickProfileOjt();
        addOption();
        SendKeysOjtField("NewTusk");
        saveOjtField();
        fillNewOJTField("NewOjtField");
        clickAddNewField();
        clickActivateOjtField();
        goToOjtSection();

        return this;

    }

    public OjtSectionPage addOjtTraining() throws InterruptedException {
        clickManualAdd();
        addUser();
        addSkill("ManualQA");
        sendHourOjt("12");
        sendAddOjt("abc");
        clickSaveRecord();
        return this;
    }

    public OjtSectionPage leaveEmptyAllField() throws InterruptedException {
        clickManualAdd();
        scrollDown(driver);
        clickSaveRecord();
        return this;
    }

    public OjtSectionPage deleteOjt() {
        goToOjtSection();
        clickDeleteButton();
        return this;
    }

    public OjtSectionPage addBulk() {
        clickBulkImportButton();
        uploadBulk();
        clickStartImport();

        return this;
    }

    public OjtSectionPage editOjt() throws InterruptedException {
        clickEditButton();
        editSkillSection("QA");
        clickEditSkillSave();
        return this;
    }

    public OjtSectionPage chooseUserOjt() throws InterruptedException {
        clickOjtUser();
        return this;

    }


}
