package com.Eleap.Algorithms.com.Admin.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class QuizResultTabs extends BaseTab {
    public QuizResultTabs(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='AutoCourse']")
    private WebElement AutoCurse;

    @FindBy(xpath = "//div[text()='The question has been added']")
    private WebElement displayedQuestionAdded;

    @FindBy(xpath = "//span[text()='6']")
    private WebElement quizTab;

    @FindBy(xpath = "//a[text()='add new question']")
    private WebElement addNewQuestion;

    @FindBy(xpath = "//p[text()='Add New Quiz Question']")
    private WebElement displayedNewQuizQuestion;

    @FindBy(xpath = "//textarea[@placeholder='Be as succinct and clear as possible']")
    private WebElement quizQuestion;

    @FindBy(xpath = "//*[@id=\"qustion-table\"]/tr[1]/td[1]/textarea")
    private WebElement quizAnswerTrue;

    @FindBy(xpath = "//*[@id=\"qustion-table\"]/tr[1]/td[2]/div/label")
    private WebElement chooseTrue;

    @FindBy(xpath = "//*[@id=\"qustion-table\"]/tr[2]/td[1]/textarea")
    private WebElement quizAnswerFalse;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveQuestion;

    @FindBy(xpath = "//label[text()='Question']")
    private WebElement displayedQuestion;

    @FindBy(xpath = "//a[text()='add from quiz bank']")
    private WebElement addFromQuizBank;

    @FindBy(xpath = "//input[@placeholder='Question']")
    private WebElement quizQuestionFiled;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
    private WebElement courseField;

    @FindBy(xpath = "//div[2]/div[4]/form/div[3]/select")
    private WebElement quizType;

    @FindBy(xpath = "//option[@value='multiple-choice']")
    private WebElement multiChoiceType;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement filterButton;

    @FindBy(css = ".counter")
    private WebElement displayedQuestionCount;

    @FindBy(xpath = "//span[@class='rd']")
    private WebElement quizInactive;

    @FindBy(xpath = "//div[text()='The question has been deactivated']")
    private WebElement displayedQuestionDeactivated;

    @FindBy(xpath = "//p[@class='alert mr-4 ml-4 mr-md-0 ml-md-0 alert-info']")
    private WebElement displayedDeletedQuestion;

    @FindBy(xpath = "//a[text()='delete']")
    private WebElement globalDelete;

    @FindBy(xpath = "//a[text()='settings']")
    private WebElement quizSettings;

    @FindBy(name = "time_limit")
    private WebElement timeLimit;

    @FindBy(xpath = "//label[text()='No. of Questions']")
    private WebElement displayedNQuestion;

    @FindBy(name = "questions")
    private WebElement quantityQuestion;

    @FindBy(name = "passing_score")
    private WebElement quantityPassingScore;

    @FindBy(name = "retries")
    private WebElement quantityRetries;

    @FindBy(xpath = "//div/form/div[9]/div/select")
    private WebElement quizActiveField;

    @FindBy(xpath = "//div[9]/div/select/option[2]")
    private WebElement optionYes;

    @FindBy(xpath = "//div/form/div[10]/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "//div[text()='Quiz settings have been saved']")
    private WebElement displayedSettingsSave;

    @FindBy(xpath = "//div[text()='The question has been graded']")
    private WebElement displayedQuestionHasBeenGraded;

    @FindBy(xpath = "//div[1]/div[3]/div[2]/ul/li[2]")
    private WebElement myAssignCourse;

    @FindBy(xpath = "//a[text()='AutoCourse']")
    private WebElement chooseAutoCourse;

    @FindBy(xpath = "//a[text()='Start Course']")
    private WebElement startCourseLesson;

    @FindBy(xpath = "//a[@class='mt-5 btn btn-primary equal_btns']")
    private WebElement equalButton;

    @FindBy(xpath = "//a[text()='Start quiz']")
    private WebElement startQuiz;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkboxChoose;

    @FindBy(xpath = "//*[@id=\"finalize\"]")
    private WebElement finalize;

    @FindBy(xpath = "//button[@id='confirm-quiz']")
    private WebElement confirmQuiz;

    @FindBy(xpath = "//div[5]/div[2]/div[1]/div/div[2]/div/a[1]")
    private WebElement confirmLesson;

    @FindBy(xpath = "//*[@id=\"menu_list\"]/li[2]/a")
    private WebElement MenuList;

    @FindBy(xpath = "//div[1]/div[3]/div[2]/ul/li[6]")
    private WebElement menuConfirm;

    @FindBy(xpath = "//tr//td[3]//a")
    private WebElement addFeedback;

    @FindBy(xpath = "//textarea")
    private WebElement feedbackText;

    @FindBy(xpath = "//div[3]/div[2]/div[2]/form/button")
    private WebElement submitButton2;

    @FindBy(xpath = "//select[@id=\"type\"]")
    private WebElement questionType;

    @FindBy(xpath = "//input[@id=\"question-image-input\"]")
    private WebElement uploadQuestion;

    @FindBy(xpath = "//div[@class='sub text-center']//a")
    private WebElement displayedDeleteButton;

    @FindBy(xpath = "//*[@id='type']/option[3]")
    private WebElement chooseOptionQuestion;

    @FindBy(xpath = "//textarea[@placeholder=\"Be as succinct and clear as possible\"]")
    private WebElement addQuestion;

    @FindBy(xpath = "//*[@id=\"question-form\"]/textarea")
    private WebElement answerQuestion;

    @FindBy(xpath = "//textarea[@name=\"feedback\"]")
    private WebElement feedbackSend;

    @FindBy(xpath = "//button[text()='submit']")
    private WebElement submitButton3;

    @FindBy(xpath = "//a[@title='Courses']")
    private WebElement coursesSection;

    @FindBy(xpath = "//ul[@class='submenu']//li[2]")
    private WebElement gradingCenter;

    @FindBy(xpath = "//ul[@class='submenu']//li[3]")
    private WebElement scormResult;

    @FindBy(xpath = "//div[4]/table/tbody/tr[2]/td[2]/a")
    private WebElement chooseAnswer;

    @FindBy(xpath = "//*[@id=\"launch-course-button\"]")
    private WebElement launcherButton;


    private void reFreshPage() throws InterruptedException {
        Thread.sleep(6000);
        driver.get("https://largeaccounttest.eleapdev.com/lessons/assigned_view?id=430366");
        driver.navigate().refresh();
    }


    public void ifDisplayedQuestionHasBeenGraded() {
        displayedQuestionHasBeenGraded.isDisplayed();

    }

    private void clickScormResultTab() {
        scormResult.click();

    }

    private void clickGradingCenterSection() {
        gradingCenter.click();

    }

    private void clickLauncherButton() {
        launcherButton.click();

    }

    private void clickAnswer() {
        chooseAnswer.click();

    }

    private void uploadFile() {
        uploadQuestion.sendKeys("C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\asd.jpg");
        waitForElementToVisibilityOfElement(driver, displayedDeleteButton, 30);

    }

    private void fillAddQuestion(CharSequence param) {
        addQuestion.sendKeys(param);

    }

    private void fillFeedback(CharSequence param) {
        feedbackSend.sendKeys(param);

    }

    private void fillAnswerQuestion(CharSequence param) {
        answerQuestion.sendKeys(param);

    }

    private void clickSubmitButton3() {
        submitButton3.click();

    }

    private void clickCoursesSection() {
        coursesSection.click();

    }

    private void clickChooseOptionQuestion() {
        chooseOptionQuestion.click();

    }

    private void clickSubmitButton2() {
        submitButton2.click();

    }

    private void fillFeedbackText(CharSequence param) {
        feedbackText.sendKeys(param);
    }


    public void ifDisplayedChooseAutoCourse() {
        chooseAutoCourse.isDisplayed();

    }


    public void clickMenuList() {
        MenuList.click();
    }

    public void clickQuestionType() {
        questionType.click();
    }

    public void clickAddFeedback() {
        addFeedback.click();
    }

    public void ClickQuizResults() {
        menuConfirm.click();
    }

    public void clickConfirmLesson() {
        confirmLesson.click();
    }

    public void clickConfirmQuiz() {
        waitForElementToBeClickable(driver, confirmQuiz, 10);
        confirmQuiz.click();
    }

    public void clickFinalize() {
        finalize.click();
    }

    public void clickCheckboxChoose() {
        checkboxChoose.click();
    }

    public void clickStartQuiz() {
        startQuiz.click();

    }

    public void clickEqualButton() {
        equalButton.click();

    }

    public void clickMyAssignCourses() {
        myAssignCourse.click();

    }

    public void clickStartCourseLesson() {
        startCourseLesson.click();

    }

    public void clickChooseAutoCourse() {
        chooseAutoCourse.click();

    }

    public void ifDisplayedSettingsSave() {
        displayedSettingsSave.isDisplayed();

    }

    public void clickQuizActiveField() {
        quizActiveField.click();

    }

    public void clickSubmitButton() {
        submitButton.click();

    }

    public void clickOptionYes() {
        optionYes.click();

    }

    public void fillQuantityQuestion(CharSequence param) {
        quantityQuestion.sendKeys(param);

    }

    public void fillQuantityPassingScore(CharSequence param) {
        quantityPassingScore.sendKeys(param);

    }

    public void fillQuantityRetries(CharSequence param) {
        quantityRetries.sendKeys(param);

    }


    public void clearTimeLimit() {
        timeLimit.clear();

    }

    public void fillTimeLimit(CharSequence param) {
        timeLimit.sendKeys(param);

    }


    public void clickQuizSettings() {
        waitForElementToBeClickable(driver, quizSettings, 10);
        quizSettings.click();

    }

    public void clickQuizTab() {
        quizTab.click();

    }

    public void clickAddNewQuestion() {
        waitForElementToVisibilityOfElement(driver, addNewQuestion, 10);
        addNewQuestion.click();
    }

    public void ifDisplayedNewQuizQuestion() {
        waitForElementToVisibilityOfElement(driver, displayedNewQuizQuestion, 10);
        displayedNewQuizQuestion.isDisplayed();
    }

    public void fillQuizQuestion(CharSequence param) {
        quizQuestion.sendKeys(param);
    }

    public void fillRightAnswer(CharSequence param) {
        quizAnswerTrue.sendKeys(param);
    }

    public void clickRightAnswer() {
        chooseTrue.click();
    }

    public void fillWrongAnswer(CharSequence param) {
        quizAnswerFalse.sendKeys(param);
    }

    public void clickSaveQuestion() {
        waitForElementToBeClickable(driver, saveQuestion, 10);
        saveQuestion.click();
    }

    public void clickAutoCurse() {
        AutoCurse.click();
    }

    public void ifDisplayedQuestionAdded() {
        displayedQuestionAdded.isDisplayed();
    }

    public void clickAddFromQuizBank() {
        addFromQuizBank.click();
    }

    public void fillQuizQuestionFiled(CharSequence param) {
        quizQuestionFiled.sendKeys(param);
    }

    public void clickCourseField() {
        waitForElementToBeClickable(driver, courseField, 10);
        courseField.click();
    }

    public void clickQuizType() {
        waitForElementToBeClickable(driver, quizType, 10);
        quizType.click();
    }

    public void chooseMultiChoiceType() {
        waitForElementToBeClickable(driver, quizType, 10);
        multiChoiceType.click();
    }

    public void clickFilterButton() {
        filterButton.click();
    }

    public void clickQuizInactive() {
        quizInactive.click();
    }

    public void ifDisplayedQuestionCount() {
        displayedQuestionCount.isDisplayed();
    }

    public void ifDisplayedQuestionDeactivated() {
        displayedQuestionDeactivated.isDisplayed();
    }

    public void ifDisplayedDeletedQuestion() {
        displayedDeletedQuestion.isDisplayed();
    }

    public void deleteQuestion() {
        globalDelete.click();
    }


    public QuizResultTabs createQuizQuestion() throws InterruptedException {
        clickQuizTab();
        clickAddNewQuestion();
        ifDisplayedNewQuizQuestion();
        scrollElementDisplayed(driver, displayedQuestion);
        fillQuizQuestion(" QuizAuto");
        fillRightAnswer("True");
        clickRightAnswer();
        fillWrongAnswer("False");
        clickSaveQuestion();
        return this;
    }

    public QuizResultTabs addQuizFromQuizBank() throws InterruptedException {
        clickAutoCurse();
        createQuizQuestion();
        return this;

    }

    public QuizResultTabs quizFilters() throws InterruptedException {

        addQuizFromQuizBank();
        clickQuizTab();
        clickAddFromQuizBank();
        fillQuizQuestionFiled("QuizAuto");
        clickCourseField();
        clickQuizType();
        Thread.sleep(1000);
        chooseMultiChoiceType();
        clickFilterButton();
        return this;
    }

    public QuizResultTabs quizSectionInactiveQuestion() throws InterruptedException {
        addQuizFromQuizBank();
        clickQuizTab();
        scrollDown(driver);
        clickQuizInactive();
        scrollDown(driver);
        return this;
    }

    public QuizResultTabs deleteQuiz() throws InterruptedException {
        addQuizFromQuizBank();
        clickQuizTab();
        scrollDown(driver);
        deleteQuestion();
        alertMethod(driver);
        scrollDown(driver);
        return this;

    }

    public QuizResultTabs quizSettings() throws InterruptedException {

        clickQuizTab();
        clickQuizSettings();
        clearTimeLimit();
        fillTimeLimit("123");
        scrollElementDisplayed(driver, displayedNQuestion);
        fillQuantityQuestion("1");
        fillQuantityPassingScore("1");
        fillQuantityRetries("12");
        scrollDown(driver);
        clickQuizActiveField();
        clickOptionYes();
        clickSubmitButton();
        return this;
    }

    public QuizResultTabs quizResultsSection() throws InterruptedException {
        clickMyAssignCourses();
        clickChooseAutoCourse();
        clickStartCourseLesson();
        clickEqualButton();
        clickStartQuiz();
        clickCheckboxChoose();
        clickFinalize();
        clickConfirmQuiz();
        clickConfirmLesson();
        alertMethod(driver);
        clickMenuList();
        ClickQuizResults();
        return this;
    }

    public QuizResultTabs quizResultsAddFeedback() throws InterruptedException {
        clickChooseAutoCourse();
        clickAddFeedback();
        scrollDown(driver);
        fillFeedbackText("All is good");
        scrollDown(driver);
        clickSubmitButton2();
        return this;
    }

    public QuizResultTabs grading_Center() throws InterruptedException {
        clickQuizTab();
        clickAddNewQuestion();
        ifDisplayedNewQuizQuestion();
        clickQuestionType();
        clickChooseOptionQuestion();
        uploadFile();
        scrollDown(driver);
        fillAddQuestion("How are you?");
        clickSaveQuestion();
        clickQuizTab();
        quizSettings();
        clickCoursesSection();
        clickMyAssignCourses();
        clickChooseAutoCourse();
        clickStartCourseLesson();
        clickEqualButton();
        clickStartQuiz();
        scrollDown(driver);
        fillAnswerQuestion("all is good");
        clickFinalize();
        clickConfirmQuiz();
        clickConfirmLesson();
        alertMethod(driver);
        clickMenuList();
        ClickQuizResults();
        clickMyAssignCourses();
        clickCoursesSection();
        ClickQuizResults();
        clickGradingCenterSection();
        clickAnswer();
        scrollDown(driver);
        fillFeedback("OK");
        clickSubmitButton3();
        return this;
    }

    public QuizResultTabs scorm_Results_Section() throws InterruptedException {
        clickMyAssignCourses();
        clickChooseAutoCourse();
        clickStartCourseLesson();
        clickLauncherButton();
        reFreshPage();
        clickCoursesSection();
        ClickQuizResults();
        clickScormResultTab();
        return this;
    }

}
