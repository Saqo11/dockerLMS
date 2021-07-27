package com.lms.automation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CourseSectionAdminTest extends MainTest {


    @BeforeEach
     void singIn() throws InterruptedException {
        loginAdminPage
                .goTo()
                .fillEmailField("saqo21harutyunyan+19@gmail.com")
                .fillPassField("7rujd12f")
                .clickLoginButton()
                .ifDisplayedText();
        coursesSectionAdminPage
                .goToCourses()
                .addNewCourse();


    }


    @Test
    public void searchByCourseName() {
        coursesSectionAdminPage
                .search_By_Course_Name()
                .ifDisplayedAutoCurse();
    }

    @Test
    public void searchByCourseCategoryAndCourseType() throws InterruptedException {
        coursesSectionAdminPage
                .search_By_Course_Category_And_Course_Type()
                .ifDisplayedAutoCurse();

    }


    @Test
    public void LeaveAllFieldEmptyOnCourseDefinitionSection() throws InterruptedException {
        coursesSectionAdminPage
                .Leave_All_Field_Empty_On_Course_Definition_Section()
                .ifDisplayedYouDidNotFillName();

    }

    @Test
    public void LessonSectionAddChapter() throws InterruptedException {
        coursesSectionAdminPage
                .Lesson_Section_ADDCHAPTER()
                .ifDisplayedChapterAdd();

    }

    @Test
    public void addLesson() throws InterruptedException {
        coursesSectionAdminPage
                .add_Lesson()
                .ifDisplayedYouDidNotFillName();


    }

    @Test
    public void ActivateTheLessonField() throws InterruptedException {
        coursesSectionAdminPage
                .Activate_The_Lesson_Field()
                .ifDisplayedLessonSave();
    }

    @Test
    public void LeaveEmptyContentField() throws InterruptedException {
        coursesSectionAdminPage
                .add_Lesson()
                .leave_Empty_Content_field()
                .ifDisplayedYouDidNotFillName();


    }

    @Test
    public void addScormLesson() throws InterruptedException {
        coursesSectionAdminPage
                .add_Scorm_Lesson()
                .ifDisplayedLessonActivated();


    }

    @Test
    public void chooseLimitedCompletionTime() throws InterruptedException {
        coursesSectionAdminPage
                .choose_Limited_completion_time()
                .ifDisplayedFormControl();

    }

    @Test
    public void addAQuizToTheLesson() throws InterruptedException {
        coursesSectionAdminPage
                .add_Lesson();
        quizResultTabs
                .createQuizQuestion();
        coursesSectionAdminPage
                .add_A_Quiz_To_The_Lesson()
                .ifDisplayedMultipleChoice();


    }

    @Test
    public void deleteQuiz() throws InterruptedException {
        coursesSectionAdminPage
                .add_Lesson();
        quizResultTabs
                .createQuizQuestion();
        coursesSectionAdminPage
                .delete_Quiz()
                .ifDisplayedQuickQuizDeleted();


    }

    @Test
    public void editheLesson() throws InterruptedException {
        coursesSectionAdminPage
                .Activate_The_Lesson_Field()
                .edit_The_Lesson()
                .ifDisplayedYouDidNotFillName();


    }

    @Test
    public void deleteTheLesson() throws InterruptedException {
        coursesSectionAdminPage
                .add_Lesson()
                .delete_The_Lesson()
                .ifDisplayedLessonDeleted();
    }

    @Test
    public void the_Unassigned_Users() throws InterruptedException {
        coursesSectionAdminPage
                .activateCourse()
                .the_Unassigned_Users()
                .ifDisplayedUnassigned();
    }
//
//    @Test
//    public void selectTheLevelGroupFilters() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse()
//                .select_The_Level_Group_Filters()
//                .ifDisplayedInstructorauto();
//    }
//
//    @Test
//    public void assignNewUserGroup() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse()
//                .assign_New_User_Group()
//                .ifDisplayedUserGroupAdded();
//    }
//
//    @Test
//    public void unassignedSelectedUserGroups() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse()
//                .unassigned_Selected_User_Groups()
//                .ifDisplayedGroupsHaveBeenRemoved();
//    }
//
//
//    @Test
//    public void assignNewTrainingPath() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse()
//                .assign_New_Training_Path()
//                .ifDisplayedOne();
//    }
//
//    @Test
//    public void unassignedSelectedTrainingPath() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse()
//                .unassigned_Selected_Training_Path();
//    }
//
//    @Test
//    public void addQuizFromQuizBank() throws InterruptedException {
//        quizResultTabs
//                .addQuizFromQuizBank()
//                .ifDisplayedQuestionAdded();
//    }
//
//    @Test
//    public void quizFilters() throws InterruptedException {
//        quizResultTabs
//                .quizFilters()
//                .ifDisplayedQuestionCount();
//    }
//
//    @Test
//    public void quizSectionInactiveButton() throws InterruptedException {
//        quizResultTabs
//                .quizSectionInactiveQuestion()
//                .ifDisplayedQuestionDeactivated();
//    }
//
//    @Test
//    public void deleteQuizzes() throws InterruptedException {
//        quizResultTabs
//                .deleteQuiz()
//                .ifDisplayedDeletedQuestion();
//    }
//
//    @Test
//    public void quizSettings() throws InterruptedException {
//        coursesSectionAdminPage
//                .add_Lesson();
//        quizResultTabs
//                .createQuizQuestion()
//                .quizSettings()
//                .ifDisplayedSettingsSave();
//    }
//
//    @Test
//    public void glossary() throws InterruptedException {
//        dropDownMenuTab
//                .glossary()
//                .isDisplayedTermAdded();
//
//    }
//
//
//    @Test
//    public void deleteGlossary() throws InterruptedException {
//        dropDownMenuTab
//                .delete_Glossary()
//                .isDisplayedTermDelete();
//    }
//
//    @Test
//    public void editGlossary() throws InterruptedException {
//        dropDownMenuTab
//                .edit_Glossary()
//                .isDisplayedTermSaved();
//    }
//
//    @Test
//    public void termGlossary() throws InterruptedException {
//        dropDownMenuTab
//                .term_Glossary()
//                .isDisplayedGlossary();
//
//    }
//
//    @Test
//    public void FAQ() throws InterruptedException {
//        dropDownMenuTab
//                .fAQ()
//                .ifFaqAdded();
//    }
//
//    @Test
//    public void editFAQ() throws InterruptedException {
//        dropDownMenuTab
//                .edit_FAQ()
//                .ifFaqSaved();
//
//    }
//
//    @Test
//    public void deleteFAQ() throws InterruptedException {
//        dropDownMenuTab
//                .delete_FAQ()
//                .ifDisplayedFaqDelete();
//    }
//
//    @Test
//    public void resource() throws InterruptedException {
//        dropDownMenuTab
//                .addResource()
//                .ifDisplayedResourceAdded();
//    }
//
//    @Test
//    public void notes() throws InterruptedException {
//        dropDownMenuTab
//                .Notes()
//                .ifDisplayedNoteAdded();
//    }
//
//    @Test
//    public void duplicate() throws InterruptedException {
//        dropDownMenuTab
//                .duplicate()
//                .isDisplayedDuplicated();
//    }
//
//    @Test
//    public void feedback() throws InterruptedException {
//        dropDownMenuTab
//                .feedback()
//                .isDisplayedFieldAdded();
//    }
//
//    @Test
//    public void discuss() throws InterruptedException {
//
//        dropDownMenuTab
//                .discuss()
//                .isDisplayedTopicAdded();
//    }
//
//    @Test
//    public void myAssignedCoursesSearchByCourseName() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse()
//                .assignUser("Instructorauto");
//        myAssignedSelfEnrollmentTab
//                .my_Assigned_Courses_Search_By_Course_Name()
//                .ifDisplayedCourse();
//    }
//
//    @Test
//    public void addSelfEnrollmentCourses() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse()
//                .assignUser("Instructorauto");
//        myAssignedSelfEnrollmentTab
//                .add_Self_Enrollment_courses()
//                .ifDisplayedCourse();
//
//    }
//
//    @Test
//    public void manageEventsAddNewEventNameFilter() throws InterruptedException {
//        coursesSectionAdminPage
//                .activateCourse();
//        manageCategoriesManageEventsTab
//                .manage_Events_Add_New_Event_Name_Filter()
//                .ifDisplayedEventMessage();
//    }
//
//    @Test
//    public void quizResultsSection() throws InterruptedException {
//        coursesSectionAdminPage
//                .add_Lesson()
//                .Activate_The_Lesson_Field();
//        quizResultTabs
//                .createQuizQuestion()
//                .quizSettings();
//        coursesSectionAdminPage
//                .assignUser("Instructorauto");
//        quizResultTabs
//                .quizResultsSection()
//                .ifDisplayedChooseAutoCourse();
//
//    }
//
//
//    @Test
//    public void quizResultsAddFeedback() throws InterruptedException {
//        quizResultsSection();
//        quizResultTabs
//                .quizResultsAddFeedback()
//                .ifDisplayedChooseAutoCourse();
//
//
//    }
//
//    @Test
//
//    public void gradingCenter() throws InterruptedException {
//        coursesSectionAdminPage
//                .add_Lesson()
//                .Activate_The_Lesson_Field()
//                .assignUser("Instructorauto");
//        quizResultTabs
//                .grading_Center()
//                .ifDisplayedQuestionHasBeenGraded();
//    }
//
//    @Test
//
//    public void chooseTheLessonSectionFile() throws InterruptedException {
//        coursesSectionAdminPage
//                .choose_The_Lesson_Section_File()
//                .ifDisplayedLessonSave();
//    }
//
//
//    @Test
//
//    public void scormResultsSection() throws InterruptedException {
//        coursesSectionAdminPage
//                .add_Scorm_Lesson()
//                .assignUser("Instructorauto");
//        quizResultTabs
//                .scorm_Results_Section()
//                .ifDisplayedChooseAutoCourse();
//
//    }
//
//    @Test
//
//    public void addNewRevision() throws InterruptedException {
//        coursesSectionAdminPage
//                .add_New_Revision()
//                .ifDisplayedPreviewMode();
//
//
//    }
//
//
//    @Test
//    public void manageCategoriesAddNewCategoryButton() throws InterruptedException {
//        manageCategoriesManageEventsTab
//                .manageCategoriesAddNewCategoryButton();
//
//    }
//
//    @Test
//    public void retakeQuiz() throws InterruptedException {
//
//        coursesSectionAdminPage
//                .Activate_The_Lesson_Field();
//        quizResultTabs
//                .createQuizQuestion()
//                .quizSettings();
//        coursesSectionAdminPage
//                .assignUser("Test Trainee")
//                .clickLogOutButton();
//        loginAdminPage
//                .fillEmailField("saqoharutyunyan19+1919@gmail.com")
//                .fillPassField("123asdfgh")
//                .clickLoginButton();
//        userDashboardPage
//                .revertQuiz();
//
//        String activeToggle = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
//        String restartQuiz = "The quiz has been restarted";
//        assertEquals(restartQuiz, activeToggle);
//        userDashboardPage
//                .backToCourse();
//
//        boolean backToCourses = driver.findElement(By.cssSelector(".active a ")).isDisplayed();
//        assertTrue(backToCourses);
//
//        coursesSectionAdminPage
//                .clickLogOutButton();
//        loginAdminPage
//                .fillEmailField("saqo21harutyunyan+19@gmail.com")
//                .fillPassField("7rujd12f")
//                .clickLoginButton();
//
//
//    }


    @AfterEach
      void removeTheCourses() throws InterruptedException {
        coursesSectionAdminPage
                .goToCourses()
                .search_By_Course_Name()
                .remove_The_Courses("DELETE")
                .ifDisplayedCourseHasBeenDeleted();

    }

}


