package com.Eleap.Algorithms.com.Admin.page;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


public class DropDownMenuTab extends BaseTab {
    public DropDownMenuTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='AutoCourse']")
    private WebElement clickAutoCurse;

    @FindBy(xpath = "//div[@class='ui-dropdown-toggle']//i[@class='fal fa-angle-down']")
    private WebElement dropdownToggle;

    @FindBy(xpath = "//a[text()='Glossary']")
    private WebElement glossarySection;

    @FindBy(xpath = "//a[@class=\"mb btn btn-primary\"]")
    private WebElement glossaryClick;

    @FindBy(xpath = "//input[@placeholder=\"Word *\"]")
    private WebElement fillGlossary;

    @FindBy(xpath = "//textarea[@placeholder=\"Definition *\"]")
    private WebElement textareaGlossary;

    @FindBy(xpath = "//div[text()='The term has been added']")
    private WebElement termAdded;

    @FindBy(xpath = "//div[text()='The term has been saved']")
    private WebElement termSaved;

    @FindBy(xpath = "//a[text()='edit']")
    private WebElement editFunction;

    @FindBy(xpath = "//a[text()='delete']")
    private WebElement globalDelete;

    @FindBy(xpath = " //input[@placeholder='Term'] ")
    private WebElement sendKeysTerm;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[text()='The term has been deleted']")
    private WebElement displayedTermDelete;

    @FindBy(xpath = " //strong[text()='NewGlossary']")
    private WebElement displayedGlossary;

    @FindBy(xpath = "//a[text()='FAQ']")
    private WebElement faqSection;

    @FindBy(xpath = "//textarea[@placeholder=\"Question *\"]")
    private WebElement faqQuestion;

    @FindBy(xpath = "//textarea[@placeholder=\"Answer *\"]")
    private WebElement faqAnswer;

    @FindBy(xpath = "//div[text()='The FAQ has been added']")
    private WebElement faqAdded;

    @FindBy(xpath = "//div[text()='The FAQ has been saved']")
    private WebElement faqSaved;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveQuestion;

    @FindBy(xpath = "//div[text()='The FAQ has been deleted']")
    private WebElement displayedFaqDelete;

    @FindBy(xpath = "//a[text()='Resources']")
    private WebElement resourceSection;

    @FindBy(xpath = "//input[@placeholder='Title *']")
    private WebElement titleResource;

    @FindBy(xpath = "//input[@placeholder=\"URL * \"]")
    private WebElement urlResource;

    @FindBy(xpath = "//div[text()='The resource has been added']")
    private WebElement displayedResourceAdded;

    @FindBy(xpath = "//a[text()='Notes']")
    private WebElement notesSection;

    @FindBy(xpath = "//a[@class='link_back link_add text-uppercase']")
    private WebElement uploadFile;

    @FindBy(xpath = "//input[@id='upload_file_for']")
    private WebElement uploadNotes;

    @FindBy(xpath = "//*[@id=\"upload_form\"]/div/p[2]/button")
    private WebElement saveFileNote;

    @FindBy(xpath = "//div[text()='The note has been added']")
    private WebElement displayedNoteAdded;

    @FindBy(xpath = "//div[text()='The field has been added']")
    private WebElement displayedFieldAdded;

    @FindBy(xpath = "//span[@class='mceIcon mce_numlist']")
    private WebElement contentNumber;

    @FindBy(xpath = "//a[text()='Feedback']")
    private WebElement feedbackSection;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement formControl;

    @FindBy(xpath = "//select[@name=\"type\"]")
    private WebElement formClick;

    @FindBy(xpath = "//option[text()='Text']")
    private WebElement formOption;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkboxChoose;

    @FindBy(xpath = "//a[@class='mb btn btn-primary']")
    private WebElement addNewTopic;

    @FindBy(xpath = "//a[text()='Discuss']")
    private WebElement discussSection;

    @FindBy(xpath = "//input[@placeholder='Enter Topic']")
    private WebElement enterTopic;

    @FindBy(xpath = "//textarea[@class='form-control']")
    private WebElement discussFormControl;

    @FindBy(xpath = "//div[text()='The topic has been added']")
    private WebElement displayedTopicAdded;

    @FindBy(xpath = "//div[text()='The course has been duplicated (']")
    private WebElement displayedDuplicated;

    @FindBy(css = ".ui-dropdown-toggle>ul>li:nth-of-type(9)")
    private WebElement duplicateSection;

    @FindBy(xpath = "//div[@class='success']")
    private WebElement uploadFinish;

    public void ClickAutoCurse() {
        clickAutoCurse.click();
    }

    public void clickDropDownToggle() {
        dropdownToggle.click();
    }

    public void clickGlossarySection() {
        waitForElementToBeClickable(driver, glossarySection, 10);
        glossarySection.click();
    }

    public void clickGlossaryClick() {
        glossaryClick.click();
    }

    public DropDownMenuTab fillGlossary(CharSequence param) {
        waitForElementToBeClickable(driver, fillGlossary, 10);
        fillGlossary.sendKeys(param);
        return this;
    }

    public DropDownMenuTab fillTextareaGlossary(CharSequence param) {
        waitForElementToBeClickable(driver, textareaGlossary, 10);
        textareaGlossary.sendKeys(param);
        return this;
    }


    public void isDisplayedTermAdded() {
        termAdded.isDisplayed();
    }

    public void isDisplayedTermSaved() {
        termSaved.isDisplayed();
    }

    public void deleteFunction() {
        globalDelete.click();
    }

    public void isDisplayedTermDelete() {
        displayedTermDelete.isDisplayed();
    }

    public void editFunction() {
        editFunction.click();
    }

    public DropDownMenuTab fillKeysTerm(CharSequence param) {

        sendKeysTerm.sendKeys(param);
        return this;
    }

    public void clickSearchButton() {
        searchButton.click();

    }

    public void isDisplayedGlossary() {
        displayedGlossary.isDisplayed();

    }


    public void clickFaqSection() {
        faqSection.click();

    }

    public void clickSaveQuestion() {
        waitForElementToBeClickable(driver, saveQuestion, 10);
        saveQuestion.click();

    }

    public void filFaqQuestion(CharSequence param) {
        faqQuestion.sendKeys(param);

    }

    public void filFaqAnswer(CharSequence param) {
        faqAnswer.sendKeys(param);

    }


    public void ifFaqAdded() {
        faqAdded.isDisplayed();

    }

    public void ifFaqSaved() {
        faqAdded.isDisplayed();

    }

    public void ifDisplayedFaqDelete() {
        displayedFaqDelete.isDisplayed();

    }

    public void clickResourceSection() {
        resourceSection.click();

    }

    public void fillTitleResource(CharSequence param) {
        titleResource.sendKeys(param);

    }

    public void fillUrlResource(CharSequence param) {
        urlResource.sendKeys(param);

    }

    public void ifDisplayedResourceAdded() {
        displayedResourceAdded.isDisplayed();

    }

    public void clickUploadFile() {
        uploadFile.click();

    }

    public void clickNotesSection() {
        notesSection.click();

    }

    public void UploadFileNote() {
        saveFileNote.click();
        waitForElementToVisibilityOfElement(driver, uploadFinish, 10);


    }

    public void uploadFileForNot() throws InterruptedException {
        uploadNotes.sendKeys("C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\infof.png");


    }

    public void clickContentNumber() {
        contentNumber.click();
        waitForElementToBeClickable(driver, contentNumber, 10);

    }

    public void ifDisplayedNoteAdded() {
        displayedNoteAdded.isDisplayed();
    }


    public void clickFeedbackSection() {
        feedbackSection.click();
    }

    public void fillFormControl(CharSequence param) {
        waitForElementToBeClickable(driver, formControl, 10);
        formControl.sendKeys(param);

    }

    public void clickForm() {
        formClick.click();
    }

    public void clickFormOption() {
        formOption.click();
    }

    public void chooseForm() {
        checkboxChoose.click();
    }

    public void isDisplayedFieldAdded() {
        displayedFieldAdded.isDisplayed();

    }

    public void isDisplayedTopicAdded() {
        displayedTopicAdded.isDisplayed();

    }

    public void clickDiscussSection() {
        discussSection.click();
    }

    public void fillEnterTopic(CharSequence param) {
        enterTopic.sendKeys(param);


    }

    public void fillDiscussFormControl(CharSequence param) {
        discussFormControl.sendKeys(param);

    }

    public void clickAddNewTopic() throws InterruptedException {
        addNewTopic.click();
        Thread.sleep(1000);


    }

    public void isDisplayedDuplicated() {
        displayedDuplicated.isDisplayed();

    }

    public void clickDuplicateSection() {
        duplicateSection.click();
    }


    public DropDownMenuTab glossary() throws InterruptedException {
        ClickAutoCurse();
        clickDropDownToggle();
        clickGlossarySection();
//        clickGlossaryClick();
        scrollDown(driver);
        fillGlossary("NewGlossary");
        fillTextareaGlossary("NewGlossary");
        clickSaveQuestion();
        return this;

    }

    public DropDownMenuTab delete_Glossary() throws InterruptedException {
        glossary();
        deleteFunction();
        alertMethod(driver);
        return this;
    }


    public DropDownMenuTab edit_Glossary() throws InterruptedException {
        glossary();
        editFunction();
        fillGlossary("Changed");
        fillTextareaGlossary("Changed");
        scrollDown(driver);
        clickSaveQuestion();
        return this;
    }

    public DropDownMenuTab term_Glossary() throws InterruptedException {
        glossary();
        fillKeysTerm("NewGlossary");
        clickSearchButton();
        return this;
    }

    public DropDownMenuTab fAQ() throws InterruptedException {

        ClickAutoCurse();
        clickDropDownToggle();
        clickFaqSection();
        scrollDown(driver);
        filFaqQuestion("TextText");
        filFaqAnswer("Text");
        clickSaveQuestion();
        return this;

    }

    public DropDownMenuTab edit_FAQ() throws InterruptedException {
        fAQ();
        editFunction.isDisplayed();
        fAQ();

        return this;
    }

    public DropDownMenuTab delete_FAQ() throws InterruptedException {
        fAQ();
        deleteFunction();
        alertMethod(driver);
        return this;
    }

    public DropDownMenuTab addResource() throws InterruptedException {
        ClickAutoCurse();
        clickDropDownToggle();
        clickResourceSection();
        scrollDown(driver);
        fillTitleResource("new");
        fillUrlResource("https://largeaccounttest.2leap.com");
        clickSaveQuestion();
        return this;
    }

    public DropDownMenuTab Notes() throws InterruptedException {
        ClickAutoCurse();
        clickDropDownToggle();
        clickNotesSection();
        scrollDown(driver);
        clickUploadFile();
        uploadFileForNot();
        UploadFileNote();
        clickContentNumber();
        clickContentNumber(); //ToDo
        clickContentNumber();
        clickSaveQuestion();
        return this;
    }

    public DropDownMenuTab feedback() throws InterruptedException {
        ClickAutoCurse();
        clickDropDownToggle();
        clickFeedbackSection();
        scrollDown(driver);
        fillFormControl("NewFeedback");
        clickForm();
        clickFormOption();
        chooseForm();
        clickSaveQuestion();
        return this;
    }

    public DropDownMenuTab discuss() throws InterruptedException {
        ClickAutoCurse();
        clickDropDownToggle();
        clickDiscussSection();
        clickAddNewTopic();
        fillEnterTopic("NewLessone");
        fillDiscussFormControl("xfrxdfxfdxfgxcfgxgfxcgfxgf");
        clickSaveQuestion();
        return this;
    }

    public DropDownMenuTab duplicate() throws InterruptedException {
        ClickAutoCurse();
        clickDropDownToggle();
        scrollDown(driver);
        clickDuplicateSection();
        alertMethod(driver);
        return this;
    }


}
