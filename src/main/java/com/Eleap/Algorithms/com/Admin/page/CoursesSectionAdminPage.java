package com.Eleap.Algorithms.com.Admin.page;

import com.Eleap.Algorithms.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CoursesSectionAdminPage extends BasePage {

    String SITE_URl = ("https://largeaccounttest.2leap.com/courses/");

    public CoursesSectionAdminPage(WebDriver driver) {
        super(driver);

    }


    public CoursesSectionAdminPage goToCourses() {
        driver.get(SITE_URl);
        return this;

    }

    public WebElement q;

    @FindBy(xpath = "//a[@class='mb btn btn-primary']")
    private WebElement addNewCourse;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"add-new-course-form\"]/div/div[1]/div/div[2]/span/span[1]/span/span[2]")
    private WebElement presentationButton;

    @FindBy(xpath = "//li[text()='Users']")
    private WebElement category;

    @FindBy(id = "advanced-settings")
    private WebElement advancedSettings;

    @FindBy(xpath = "//input[@placeholder='Addresses']")
    private WebElement addresses;

    @FindBy(id = "add-new-course-btn")
    private WebElement saveNewCourse;

    @FindBy(xpath = "//a[@title='Courses']")
    private WebElement titleCourses;

    @FindBy(xpath = "//label[@class='toggle_checkbox']")
    private List<WebElement> toggle;

    @FindBy(xpath = "//label[@class='toggle_checkbox']")
    private List<WebElement> togglee;

    @FindBy(xpath = "//input[@class='form-control min-width-td-250']")
    private WebElement searchByName;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='form-group search-able-select selectDiv']")
    private WebElement courseCategory;

    @FindBy(xpath = "//option[text()='Users']")
    private WebElement userOption;

    @FindBy(xpath = "//div[@class='form-group selectDiv']")
    private WebElement courseType;

    @FindBy(xpath = "//option[text()='Standard']")
    private WebElement standardOption;

    @FindBy(xpath = "//a[@title='AutoCourse']")
    private WebElement AutoCurseSection;

    @FindBy(css = "button.btn.btn-link.mr-2.like_link_btn")
    private WebElement addChapter;

    @FindBy(xpath = "//*[@id=\"add-new-chapter-form\"]/div[1]/div[1]/input")
    private WebElement fillChapter;

    @FindBy(id = "add-new-chapter-btn")
    private WebElement addChapterBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary mr']")
    private WebElement addLesson;

    @FindBy(xpath = "//*[@id=\"add-new-lesson-form\"]/div[1]/div[1]/input")
    private WebElement lessonTitle;

    @FindBy(xpath = "//button[@id='add-new-lesson-btn']")
    private WebElement lessonButton;

    @FindBy(xpath = "//a[@class='max-width-td-600 outline-none']")
    private WebElement ChooseLesson;

    @FindBy(xpath = "//a[text()='Click here to add content.']")
    private WebElement contentLessonButton;

    @FindBy(xpath = "//label[@for='lesson_activity_toggle_switch']")
    private WebElement activeToggle;

    @FindBy(css = ".info_content.ml-auto.mr-auto [type='submit']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[@class='mceIcon mce_numlist']")
    private WebElement contentNumber;

    @FindBy(xpath = "//input[@id=\"addModalScorm-input\"]")
    private WebElement addScormLesson;

    @FindBy(xpath = "//a[text()='edit']")
    private WebElement editLesson;

    @FindBy(xpath = "//a[@class=\"toggle-status toggle-disabled\"]")
    private WebElement scormToggle;

    @FindBy(xpath = "//span[text()='3']")
    private WebElement assignedUserSection;

    @FindBy(xpath = "//span[text()='2']")
    private WebElement assignedUserSection2;

    @FindBy(css = "#wizard-steps li")
    private List<WebElement> menuLi;

    @FindBy(xpath = "//a[text()='click here']")
    private WebElement clickHere;

    @FindBy(css = ".alert.ml-4 a ")
    private WebElement assignUser;

    @FindBy(xpath = "//input[@placeholder='User or Email']")
    private WebElement userOrEmail;

    @FindBy(xpath = "//h1[text()='AutoCourse']")
    private WebElement autoCourseDisplayed;

    @FindBy(xpath = "//input[@class='assign_checkbox']")
    private WebElement userCheckBox;

    @FindBy(xpath = "//button[@class='select_items_button btn btn-default btn-xs']")
    private WebElement selectedUser;

    @FindBy(xpath = "//div[text()='The Users have been assigned to this Course']")
    private WebElement displayedUserAssignCourse;

    @FindBy(xpath = "//div[1]/div[3]/div[2]/ul/li[2]")
    private WebElement myAssignCourse;

    @FindBy(xpath = "//a[text()='AutoCourse']")
    private WebElement chooseAutoCourse;

    @FindBy(xpath = "//a[@class='btn-link edit_btn btn-link-big' and text()='Start Course']")
    private WebElement startCourse;

    @FindBy(xpath = "//div[@class='ui-dropdown-toggle']//i[@class='fal fa-angle-down']")
    private WebElement dropdownToggle;

    @FindBy(xpath = "//ul[@style='display: block;']//li[10]")
    private WebElement deleteCourse;

    @FindBy(xpath = "//ul[@style='display: block;']//li[4]")
    private WebElement deleteCourse2;

    @FindBy(xpath = "//ul[@style='display: block;']//li")
    private List<WebElement> menuLength;

    @FindBy(xpath = "//input[@class='form-control delete_verify_field']")
    private WebElement sendDelete;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement buttonDelete;

    @FindBy(xpath = "//div[text()='The question has been added']")
    private WebElement questionAdded;

    @FindBy(xpath = "//span[text()='2']")
    private WebElement lessonSection;

    @FindBy(xpath = "//h2[text()='Lessons / Chapters']")
    private WebElement lessonChaptersDisplayed;

    @FindBy(xpath = "//a[text()='add quiz question']")
    private WebElement addQuizQuestion;

    @FindBy(xpath = "//th[text()='Question']")
    private WebElement questionDisplayed;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkboxChoose;

    @FindBy(id = "trigger-delete")
    private WebElement triggerDelete;

    @FindBy(css = ".text-center.mid.border-left-0 a")
    private WebElement deleteQuiz;

    @FindBy(xpath = "//div[text()='MULTIPLE CHOICE']")
    private WebElement multipleChoice;

    @FindBy(linkText = "assign new user groups")
    private WebElement assignNewUserGroup;

    @FindBy(xpath = "//table/tbody/tr[2]/td[2]/input")
    private WebElement userGroupCheckbox;

    @FindBy(css = ".far.fa-trash-alt")
    private WebElement deleteForLesson;

    @FindBy(xpath = "//button[text()='Filter']")
    private WebElement filterButton;

    @FindBy(xpath = "//select[@name='id_acl_role']")
    private WebElement selectLevel;

    @FindBy(xpath = "//option[text()='Administrator']")
    private WebElement optionInstructor;

    @FindBy(xpath = "//span[@id='select2-id_user_group-container']")
    private WebElement selectUserGroups;

    @FindBy(xpath = "//li[text()='TestAuto']")
    private WebElement groupTestAuto;

    @FindBy(xpath = "//span[text()='4']")
    private WebElement assignedUserGroups;

    @FindBy(xpath = "//div[text()='These user groups have been assigned to this course']")
    private WebElement userGroupAdded;

    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    private WebElement searchUserGroup;

    @FindBy(xpath = "//button[@class=\"btn btn-default\"]")
    private WebElement searchButton1;

    @FindBy(xpath = "//span[text()='5']")
    private WebElement assignedTrainingPaths;

    @FindBy(xpath = "//a[text()='assign to new training path']")
    private WebElement assignNetTraining;

    @FindBy(xpath = "//tbody//th//input")
    private WebElement trainingCheckbox;

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    private WebElement glossaryDiscussSubmit;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement nameDescription;

    @FindBy(xpath = "//a[text()='assign new users']")
    private WebElement assignNewUser;

    @FindBy(xpath = "//div[3]/div[2]/ul/li[6]")
    private WebElement clickResults;

    @FindBy(xpath = "//div[1]/div[3]/div[2]/ul/li[3]")
    private WebElement clickResult1;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private WebElement deleteScorm;

    @FindBy(xpath = "//button[@class=\"select_items_button btn btn_default_danger btn-xs\"]")
    private WebElement deleteScormResult;

    @FindBy(xpath = "//button[@class=\"text-nowrap add-lesson-new-version-btn\"]")
    private WebElement addLessonNewVersion;

    @FindBy(xpath = "//input[@name=\"change_log\"]")
    private WebElement changeLog;

    @FindBy(xpath = "//button[text()=\"Save changes\"]")
    private WebElement saveChanges;

    @FindBy(css = "td .fas.fa-chevron-down.rev-drop-icon")
    private WebElement popup;

    @FindBy(css = ".lesson_tr.revision .far.fa-trash-alt")
    private WebElement deleteRevision;

    @FindBy(xpath = "//a[text()='preview']")
    private WebElement preview;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement visitableDanger;

    @FindBy(xpath = "//div[text()='The chapter has been added']")
    private WebElement isDisplayedChapterAdd;

    @FindBy(xpath = "//div[text()='The lesson has been saved']")
    private WebElement displayedLessonSave;

    @FindBy(xpath = "//label[text()=' Assignment Notifications']")
    private WebElement displayedNotification;

    @FindBy(xpath = "//label[text()=' Deadline']")
    private WebElement displayedDeadline;

    @FindBy(css = ".title.tm.mt-5")
    private WebElement displayedSettings;

    @FindBy(xpath = "//div[text()='The lesson has been activated']")
    private WebElement displayedLessonActivated;

    @FindBy(xpath = "//div[text()='The lesson has been added']")
    private WebElement displayedLessonAdded;

    @FindBy(xpath = "//input[@name='minimum_read_time']")
    private WebElement addMinimumTime;

    @FindBy(xpath = "//input[@class='form-control float-right text-center ml-2']")
    private WebElement displayedFormControl;

    @FindBy(xpath = "//div[text()='The course has been deleted']")
    private WebElement displayedCourseHasBeenDeleted;

    @FindBy(css = ".alert.alert-success")
    private WebElement displayedQuickQuizDeleted;

    @FindBy(xpath = "//div[text()='The lesson has been deleted']")
    private WebElement displayedLessonDeleted;

    @FindBy(xpath = "//div[text()='The users have been unassigned from this course']")
    private WebElement displayedUnassigned;

    @FindBy(xpath = "//td[text()='Test, Instructorauto Test']")
    private WebElement displayedInstructorauto;

    @FindBy(xpath = "//div[text()='These user groups have been removed from this course']")
    private WebElement displayedGroupsHaveBeenRemoved;

    @FindBy(xpath = "//div[text()='The file has been uploaded']")
    private WebElement displayedLessonUploaded;

    @FindBy(xpath = "//strong[text()='1.']")
    private WebElement displayedOne;

    @FindBy(xpath = "//input[@id='lesson-files-input']")
    private WebElement uploadLesson;

    @FindBy(xpath = "//button[@class='text-nowrap add-lesson-new-version-btn']")
    private WebElement hoverButton;

    @FindBy(xpath = "//div[text()='The course is in PREVIEW MODE ']")
    private WebElement displayedPreviewMode;

    @FindBy(css = ".submenu > li:nth-child(2)")
    private WebElement trainingPathsUser;

    @FindBy(css = ".btn.btn-primary")
    private WebElement newUserButton;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logOutButton;

    @FindBy(css = ".profile_content_main_sect.d-flex.flex-row-reverse #user")
    private WebElement hoverUser;



    public void fillName(CharSequence param) {
        name.sendKeys(param);
    }

    public void fillAddresses(CharSequence param) {
        waitForElementToBeClickable(driver, addresses, 10);
        addresses.sendKeys(param);
    }

    public void ifDisplayedMultipleChoice() {
        multipleChoice.isDisplayed();
    }

    public void clickPresentationButton() {
        presentationButton.click();
    }

    public void chooseCategory() {
        waitForElementToBeClickable(driver, category, 10);
        category.click();
    }

    public void clickAdvancedSettings() {
        advancedSettings.click();
    }

    public void clickSaveNewCourseButton() {
        waitForElementToBeClickable(driver, saveNewCourse, 10);
        saveNewCourse.click();

    }

    public void clickTitleCoursesButton() {
        waitForElementToBeClickable(driver, titleCourses, 10);
        titleCourses.click();

    }

    public void clickAddNewCourse() {
        addNewCourse.click();
    }

    public void loopForToggle() {
        for (int i = 1; i < 6; i++) {
            try {

                q = toggle.get(i);
                q.click();
                if (i == 6) {
                    continue;

                }
            } catch (Exception e) {

            }
        }

    }

    public void loopForToggle2() throws InterruptedException {
        scrollElementDisplayed(driver, advancedSettings);
        clickAdvancedSettings();
        for (int i = 7; i <= 10; i++) {
            q = toggle.get(i);
            q.click();
            if (i == 9) {
                fillAddresses("saqoharutyunyan19+99@gmail.com");

            }
        }
    }

    public void fillNameSearchField(CharSequence param) {
        searchByName.sendKeys(param);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void ifDisplayedAutoCurse() {
        AutoCurseSection.isDisplayed();
    }

    public void ifDisplayedYouDidNotFillName() {
        waitForElementToVisibilityOfElement(driver, visitableDanger, 10);
        visitableDanger.isDisplayed();
    }

    public void ifDisplayedChapterAdd() {
        isDisplayedChapterAdd.isDisplayed();
    }

    public void clickCourseCategory() {
        waitForElementToBeClickable(driver, courseCategory, 10);
        courseCategory.click();
    }

    public void clickUserOption() {
        waitForElementToBeClickable(driver, userOption, 10);
        userOption.click();
    }

    public void clickStandardOption() {
        waitForElementToBeClickable(driver, standardOption, 10);
        standardOption.click();
    }

    public void clickCourseType() {
        courseType.click();
    }

    public void clickAddChapterButton() {
        addChapterBtn.click();
    }

    public void clickAddChapter() {
        waitForElementToBeClickable(driver, addChapter, 10);
        addChapter.click();
    }


    public void fillChapterName(CharSequence param) {
        waitForElementToBeClickable(driver, fillChapter, 10);
        fillChapter.sendKeys(param);
    }

    public void clickAutoCurse() {
        AutoCurseSection.click();
    }

    public void clickAddLessonButton() {
        waitForElementToBeClickable(driver, addLesson, 10);
        addLesson.click();
    }

    public void fillLessonTitle(CharSequence param) {
        waitForElementToBeClickable(driver, lessonTitle, 10);
        lessonTitle.sendKeys(param);
    }

    public void addLesson() {
        lessonButton.click();
    }

    public void clickChooseLesson() {
        ChooseLesson.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void ifDisplayedLessonSave() {
        displayedLessonSave.isDisplayed();
    }

    public void clickContentLessonButton() {
        waitForElementToBeClickable(driver, contentLessonButton, 10);
        contentLessonButton.click();
    }

    public void clickActiveToggle() {
        waitForElementToBeClickable(driver, activeToggle, 10);
        activeToggle.click();
    }


    public void fillContent() {
        contentNumber.click();
        waitForElementToBeClickable(driver, contentNumber, 10);
        contentNumber.click();                                                                //ToDo;
        waitForElementToBeClickable(driver, contentNumber, 10);
        contentNumber.click();
    }

    public void clickAssignedUserSection() {
        int length = menuLi.size();

        if (length == 6) {
            waitForElementToBeClickable(driver, assignedUserSection, 10);
            assignedUserSection.click();
        } else if (length == 4) {
            waitForElementToBeClickable(driver, assignedUserSection2, 10);
            assignedUserSection2.click();

        }
    }

    public void clickHereButton() {
        waitForElementToBeClickable(driver, clickHere, 10);
        clickHere.click();
    }

    public void clickAssignUser() {
        waitForElementToBeClickable(driver, assignUser, 10);
        assignUser.click();
    }

    public void fillUserOrEmailField(String param) {
        waitForElementToBeClickable(driver, userOrEmail, 10);
        userOrEmail.sendKeys(param);
    }

    public void clickFilterButton() {
        waitForElementToBeClickable(driver, filterButton, 10);
        filterButton.click();
    }

    public void clickUserCheckBox() {
        waitForElementToBeClickable(driver, userCheckBox, 10);
        userCheckBox.click();
    }

    public void clickSelectedUserButton() {
        waitForElementToBeClickable(driver, selectedUser, 10);
        selectedUser.click();
    }

    public void ifDisplayedUserAssignCourse() {
        displayedUserAssignCourse.isDisplayed();
    }

    public void downloadScormLesson() {
        addScormLesson.sendKeys("C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\Spelling Smart.zip");
        waitForElementToVisibilityOfElement(driver, displayedLessonAdded, 30);
    }

    public void clickScormToggle() {
        scormToggle.click();
    }

    public void fillMinimumTime(CharSequence param) {
        addMinimumTime.sendKeys(param);
    }

    public void ifDisplayedLessonActivated() {
        displayedLessonActivated.isDisplayed();
    }

    public void clickMyAssignCourses() {
        myAssignCourse.click();

    }

    public void clickChooseAutoCourse() {
        chooseAutoCourse.click();

    }

    public void clickStartCourse() {
        startCourse.click();
    }

    public void ifDisplayedFormControl() {
        displayedFormControl.isDisplayed();
    }

    public void clickDropdownToggle() {
        waitForElementToBeClickable(driver, dropdownToggle, 10);
        dropdownToggle.click();
    }

    public void clickDeleteDeleteCourse() throws InterruptedException {
        int length = menuLength.size();
        System.out.println(length);
        if (length == 10) {
            scrollDown(driver);
            deleteCourse.click();
        } else if (length == 4) {
            waitForElementToBeClickable(driver, deleteCourse2, 10);
            deleteCourse2.click();

        }

    }


    public void fillDelete() {
        waitForElementToBeClickable(driver, sendDelete, 10);
        sendDelete.sendKeys("DELETE");
    }

    public void clickButtonDelete() {
        buttonDelete.click();
    }

    public void ifDisplayedCourseHasBeenDeleted() {
        displayedCourseHasBeenDeleted.isDisplayed();
    }

    public void clickLessonSection() {
        lessonSection.click();
    }

    public void clickAddQuizQuestionButton() {
        addQuizQuestion.click();
    }

    public void clickCheckboxChoose() {
        checkboxChoose.click();
    }

    public void clickTriggerDelete() {
        waitForElementToBeClickable(driver, triggerDelete, 10);
        triggerDelete.click();
    }

    public void clickDeleteQuizButton() {
        deleteQuiz.click();
    }

    public void clickEditLesson() {
        editLesson.click();
    }

    public void ifDisplayedQuickQuizDeleted() throws InterruptedException {
        scrollDown(driver);
        displayedQuickQuizDeleted.isDisplayed();
    }

    public void ifDisplayedLessonDeleted() throws InterruptedException {
        displayedLessonDeleted.isDisplayed();
    }


    public void deleteLesson() {
        deleteForLesson.click();
    }

    public void ifDisplayedUnassigned() {
        displayedUnassigned.isDisplayed();
    }

    public void chooseSelectLevel() {
        selectLevel.click();
    }

    public void chooseOptionInstructor() {
        waitForElementToBeClickable(driver, optionInstructor, 10);
        optionInstructor.click();
    }

    public void chooseSelectUserGroups() {
        waitForElementToBeClickable(driver, selectUserGroups, 10);
        selectUserGroups.click();
    }

    public void chooseGroupTestAuto() {
        waitForElementToBeClickable(driver, groupTestAuto, 10);
        groupTestAuto.click();
    }

    public void ifDisplayedInstructorauto() throws InterruptedException {
        displayedInstructorauto.isDisplayed();
    }

    public void clickAssignedUserGroupsSection() {
        assignedUserGroups.click();
    }

    public void clickAssignNewUserGroup() throws InterruptedException {
        scrollElementDisplayed(driver, assignNewUserGroup);
        assignNewUserGroup.click();
    }

    public void clickUserGroupCheckbox() {
        userGroupCheckbox.click();
    }

    public void ifDisplayedUserGroupAdded() {
        userGroupAdded.isDisplayed();
    }

    public void ifDisplayedGroupsHaveBeenRemoved() {
        displayedGroupsHaveBeenRemoved.isDisplayed();
    }

    public void ifDisplayedOne() {
        displayedOne.isDisplayed();
    }

    public void clickAssignedTrainingPaths() {
        assignedTrainingPaths.click();
    }

    public void clickAssignNetTraining() {
        assignNetTraining.click();

    }

    public void clickTrainingCheckbox() {
        trainingCheckbox.click();

    }

    public void uploadLessons() {
        uploadLesson.sendKeys("C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\infof.png");
        waitForElementToVisibilityOfElement(driver, displayedLessonUploaded, 10);

    }

    public void clickAddLessonNewVersion() {
        addLessonNewVersion.click();

    }

    public void fillChangeLog(CharSequence param) {
        waitForElementToBeClickable(driver, changeLog, 10);
        changeLog.sendKeys(param);

    }

    public void hoverRevision() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverButton).build().perform();

    }

    public void clickSaveChangesButton() {
        saveChanges.click();
    }

    public void clickPopup() {
        popup.click();
    }

    public void clickPreview() {
        waitForElementToBeClickable(driver, preview, 10);
        preview.click();
    }

    public void ifDisplayedPreviewMode() {
        displayedPreviewMode.isDisplayed();
    }

    public void clickAssignUserTraining() {
        trainingPathsUser.click();
    }

    public void clickNewUserButton() {
        waitForElementToBeClickable(driver, newUserButton, 15);
        newUserButton.click();
    }


    public void clickLogOutButton() {
        hoverEffect(driver,hoverUser);
        waitForElementToBeClickable(driver,logOutButton,10);
        logOutButton.click();

    }

    public CoursesSectionAdminPage addNewCourse() throws InterruptedException {
        clickAddNewCourse();
        fillName("AutoCourse");
        scrollElementDisplayed(driver, displayedNotification);
        clickPresentationButton();
        chooseCategory();
        loopForToggle();
        loopForToggle2();
        clickSaveNewCourseButton();
        clickTitleCoursesButton();
        return this;
    }

    public CoursesSectionAdminPage search_By_Course_Name() {
        fillNameSearchField("AutoCourse");
        clickSearchButton();
        return this;
    }

    public CoursesSectionAdminPage search_By_Course_Category_And_Course_Type() throws InterruptedException {
        clickCourseCategory();
        clickUserOption();
        clickCourseType();
        clickStandardOption();
        clickSearchButton();
        return this;
    }

    public CoursesSectionAdminPage Leave_All_Field_Empty_On_Course_Definition_Section() throws InterruptedException {
        clickAddNewCourse();
        scrollDown(driver);
        clickSaveNewCourseButton();
        return this;

    }

    public CoursesSectionAdminPage Lesson_Section_ADDCHAPTER() throws InterruptedException {
        clickAutoCurse();
        clickAddChapter();
        fillChapterName("NewChapter");
        clickAddChapterButton();
        return this;
    }


    public CoursesSectionAdminPage add_Lesson() throws InterruptedException {
        clickAutoCurse();
        clickAddLessonButton();
        fillLessonTitle("NewLesson");
        addLesson();
        scrollDown(driver);
        clickChooseLesson();
        clickContentLessonButton();
        scrollElementDisplayed(driver, displayedSettings);
        clickActiveToggle();
        scrollDown(driver);
        clickSaveButton();
        return this;
    }

    public CoursesSectionAdminPage Activate_The_Lesson_Field() throws InterruptedException {
        clickAutoCurse();
        clickAddLessonButton();
        fillLessonTitle("NewLesson");
        addLesson();
        scrollDown(driver);
        clickChooseLesson();
        clickContentLessonButton();
        scrollElementDisplayed(driver, displayedSettings);
        fillContent();
        clickActiveToggle();
        scrollDown(driver);
        clickSaveButton();
        return this;

    }

    public CoursesSectionAdminPage assignUser(String param) throws InterruptedException {

        clickAssignedUserSection();
        clickHereButton();
        scrollDown(driver);
        clickAssignUser();
        fillUserOrEmailField(param);
        clickFilterButton();
        clickUserCheckBox();
        clickSelectedUserButton();
        alertMethod(driver);
        ifDisplayedUserAssignCourse();
        return this;
    }

    public CoursesSectionAdminPage assignUserForTrainingPaths(String param) {

        clickAssignUserTraining();
        clickNewUserButton();
        fillUserOrEmailField(param);
        clickFilterButton();
        clickUserCheckBox();
        clickSelectedUserButton();
        alertMethod(driver);
        return this;
    }

    public CoursesSectionAdminPage leave_Empty_Content_field() throws InterruptedException {
        clickAutoCurse();
        scrollDown(driver);
        clickChooseLesson();
        clickContentLessonButton();
        scrollElementDisplayed(driver, displayedSettings);
        clickActiveToggle();
        scrollDown(driver);
        clickSaveButton();
        return this;
    }

    public CoursesSectionAdminPage add_Scorm_Lesson() throws InterruptedException {
        clickAutoCurse();
        downloadScormLesson();
        scrollDown(driver);
        clickScormToggle();
        return this;
    }

    public CoursesSectionAdminPage choose_Limited_completion_time() throws InterruptedException {
        clickAutoCurse();
        clickAddLessonButton();
        fillLessonTitle("NewLesson");
        addLesson();
        scrollDown(driver);
        clickChooseLesson();
        clickContentLessonButton();
        scrollElementDisplayed(driver, displayedSettings);
        fillContent();
        clickActiveToggle();
        fillMinimumTime("002020");
        scrollDown(driver);
        clickSaveButton();
        assignUser("Instructorauto");
        clickMyAssignCourses();
        clickChooseAutoCourse();
        scrollDown(driver);
        clickStartCourse();
        return this;
    }

    public CoursesSectionAdminPage remove_The_Courses(String delete) throws InterruptedException {
        clickAutoCurse();
        clickDropdownToggle();
        clickDeleteDeleteCourse();
        fillDelete();
        clickButtonDelete();
        return this;


    }

    public CoursesSectionAdminPage add_A_Quiz_To_The_Lesson() throws InterruptedException {
        clickLessonSection();
        scrollDown(driver);
        clickChooseLesson();
        scrollDown(driver);
        clickAddQuizQuestionButton();
        clickCheckboxChoose();
        clickTriggerDelete();
        scrollDown(driver);
        return this;
    }

    public CoursesSectionAdminPage delete_Quiz() throws InterruptedException {
        clickLessonSection();
        scrollDown(driver);
        clickChooseLesson();
        scrollDown(driver);
        clickAddQuizQuestionButton();
        clickCheckboxChoose();
        clickTriggerDelete();
        scrollDown(driver);
        ifDisplayedMultipleChoice();
        clickDeleteQuizButton();
        alertMethod(driver);
        return this;
    }

    public CoursesSectionAdminPage edit_The_Lesson() throws InterruptedException {
        clickLessonSection();
        scrollDown(driver);
        clickEditLesson();
        scrollElementDisplayed(driver, displayedSettings);
        clickActiveToggle();
        scrollDown(driver);
        clickSaveButton();
        return this;
    }

    public CoursesSectionAdminPage delete_The_Lesson() throws InterruptedException {
        clickLessonSection();
        scrollDown(driver);
        deleteLesson();
        alertMethod(driver);
        return this;
    }

    public CoursesSectionAdminPage the_Unassigned_Users() throws InterruptedException {
        clickAssignedUserSection();
        clickHereButton();
        scrollDown(driver);
        clickAssignUser();
        fillUserOrEmailField("Instructorauto");
        clickFilterButton();
        scrollDown(driver);
        clickUserCheckBox();
        clickSelectedUserButton();
        alertMethod(driver);
        scrollDown(driver);
        clickUserCheckBox();
        clickTriggerDelete();
        alertMethod(driver);
        return this;

    }

    public CoursesSectionAdminPage select_The_Level_Group_Filters() throws InterruptedException {
        clickAssignedUserSection();
        clickHereButton();
        scrollDown(driver);
        clickAssignUser();
        chooseSelectLevel();
        chooseOptionInstructor();
        chooseSelectUserGroups();
        chooseGroupTestAuto();
        clickFilterButton();
        return this;
    }

    public CoursesSectionAdminPage activateCourse() throws InterruptedException {
        clickAutoCurse();
        clickAddLessonButton();
        fillLessonTitle("NewLesson");
        addLesson();
        scrollDown(driver);
        clickChooseLesson();
        clickContentLessonButton();
        scrollElementDisplayed(driver, displayedSettings);
        clickActiveToggle();
        fillContent();
        scrollDown(driver);
        clickSaveButton();
        return this;
    }

    public CoursesSectionAdminPage assign_New_User_Group() throws InterruptedException {
        clickAssignedUserGroupsSection();
        clickHereButton();
        clickAssignNewUserGroup();
        clickUserGroupCheckbox();
        clickTriggerDelete();
        alertMethod(driver);
        return this;
    }

    public CoursesSectionAdminPage unassigned_Selected_User_Groups() throws InterruptedException {
        assign_New_User_Group();
        scrollDown(driver);
        clickUserGroupCheckbox();
        clickTriggerDelete();
        alertMethod(driver);
        return this;
    }

    public CoursesSectionAdminPage assign_New_Training_Path() throws InterruptedException {
        clickAssignedTrainingPaths();
        clickHereButton();
        clickAssignNetTraining();
        clickTrainingCheckbox();
        Thread.sleep(2000);
        clickTriggerDelete();
        alertMethod(driver);
        return this;
    }

    public CoursesSectionAdminPage unassigned_Selected_Training_Path() throws InterruptedException {
        assign_New_Training_Path();
        clickTrainingCheckbox();
        clickTriggerDelete();
        alertMethod(driver);
        return this;


    }

    public CoursesSectionAdminPage choose_The_Lesson_Section_File() throws InterruptedException {
        clickAutoCurse();
        clickAddLessonButton();
        fillLessonTitle("NewLesson");
        addLesson();
        scrollDown(driver);
        clickChooseLesson();
        clickContentLessonButton();
        uploadLessons();
        scrollDown(driver);
        clickSaveButton();
        return this;
    }


    public CoursesSectionAdminPage add_New_Revision() throws InterruptedException {
        clickAutoCurse();
        clickAddLessonButton();
        fillLessonTitle("NewLesson");
        addLesson();
        scrollDown(driver);
        hoverRevision();
        clickAddLessonNewVersion();
        fillChangeLog("okoko");
        scrollDown(driver);
        clickSaveChangesButton();
        scrollDown(driver);
        clickPopup();
        clickPreview();
        return this;
    }

    public  CoursesSectionAdminPage activateCourseForTrainingPath () {
        clickAssignedUserSection();
        clickHereButton();
        return this;

    }


}
