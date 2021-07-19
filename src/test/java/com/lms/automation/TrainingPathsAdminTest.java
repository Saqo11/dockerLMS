//package com.lms.automation;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class TrainingPathsAdminTest extends MainTest {
//
//
//    @BeforeEach
//    public void singIn() throws InterruptedException {
//        loginAdminPage
//                .goTo()
//                .fillEmailField("saqo21harutyunyan+19@gmail.com")
//                .fillPassField("7rujd12f")
//                .clickLoginButton()
//                .ifDisplayedText();
//    }
//
//    @Test
//    public void addTrainingPathTypePreSetNavigation() throws InterruptedException {
//        trainingPathsAdminPage
//                .createTrainingPath();
//
//        WebElement success = driver.findElement(By.cssSelector(".alert.alert-success"));
//        boolean trainingPathAdded = success.isDisplayed();
//        assertEquals(true, trainingPathAdded);
//
//    }
//
//    @Test
//    public void createNegativeTrainingPath() throws InterruptedException {
//        trainingPathsAdminPage
//                .crateTrainingPathNegativeTest();
//
//        boolean errorTraining = driver.findElement(By.xpath("//div[1]/div[3]/div[3]/div[2]")).isDisplayed();
//        assertTrue(errorTraining);
//
//    }
//
//    @Test
//    public void deactivateTrainingPath() throws InterruptedException {
//        trainingPathsAdminPage
//                .createTrainingPath()
//                .deactivateTrainingPath();
//
//        String activeToggle = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
//        String deactivatedToggle = "Training Path has been deactivated";
//        assertEquals(deactivatedToggle, activeToggle);
//    }
//
//    @Test
//    public void assignNewUserTrainingPath() throws InterruptedException {
//        trainingPathsAdminPage
//                .createTrainingPath()
//                .clickTrainingPath();
//        coursesSectionAdminPage
//                .assignUserForTrainingPaths("Test Trainee")
//                .clickLogOutButton();
//        loginAdminPage
//                .fillEmailField("saqoharutyunyan19+1919@gmail.com")
//                .fillPassField("123asdfgh")
//                .clickLoginButton();
//        userDashboardPage
//                .hoverMyAssignedTraining();
//
//        boolean displayedTrainingPath = driver.findElement(By.cssSelector(".item-name")).isDisplayed();
//        assertTrue(displayedTrainingPath);
//
//        userDashboardPage
//                .hoverTiVisitableTop();
//        coursesSectionAdminPage
//                .clickLogOutButton();
//        loginAdminPage
//                .fillEmailField("saqo21harutyunyan+19@gmail.com")
//                .fillPassField("7rujd12f")
//                .clickLoginButton();
//    }
//
//    @Test
//    public void addNewCoursesOnATrainingPath() throws InterruptedException {
//        coursesSectionAdminPage
//                .goToCourses()
//                .addNewCourse();
//        trainingPathsAdminPage
//                .createTrainingPath()
//                .clickTrainingPath()
//                .addCourseOnTrainingPath();
//
//        boolean displayedCourse = driver.findElement(By.xpath("//a[text()='AutoCourse']")).isDisplayed();
//        assertTrue(displayedCourse);
//
//        coursesSectionAdminPage
//                .goToCourses()
//                .search_By_Course_Name()
//                .remove_The_Courses("DELETE")
//                .ifDisplayedCourseHasBeenDeleted();
//    }
//
//    @Test
//    public void finishTrainingPath() throws InterruptedException {
//
//        coursesSectionAdminPage
//                .goToCourses()
//                .addNewCourse()
//                .Activate_The_Lesson_Field()
//                .activateCourseForTrainingPath();
//        quizResultTabs
//                .createQuizQuestion();
//        coursesSectionAdminPage
//                .add_A_Quiz_To_The_Lesson()
//                .ifDisplayedMultipleChoice();
//        trainingPathsAdminPage
//                .createTrainingPath()
//                .clickTrainingPath();
//        coursesSectionAdminPage
//                .assignUserForTrainingPaths("Test Trainee");
//        trainingPathsAdminPage
//                .addCourSingedUserTrainingPath();
//        coursesSectionAdminPage
//                .clickLogOutButton();
//        loginAdminPage
//                .fillEmailField("saqoharutyunyan19+1919@gmail.com")
//                .fillPassField("123asdfgh")
//                .clickLoginButton();
//        userDashboardPage
//                .hoverMyAssignedTraining()
//                .finishCourse();
//        coursesSectionAdminPage
//                .clickLogOutButton();
//        loginAdminPage
//                .fillEmailField("saqo21harutyunyan+19@gmail.com")
//                .fillPassField("7rujd12f")
//                .clickLoginButton();
//        trainingPathsAdminPage
//                .checkCompletedTrainingPath();
//
//        boolean displayPercentage = driver.findElement(By.xpath("//div[@class='percentage' and text()='100%']")).isDisplayed();
//        assertTrue(displayPercentage);
//
//        coursesSectionAdminPage
//                .goToCourses()
//                .search_By_Course_Name()
//                .remove_The_Courses("DELETE")
//                .ifDisplayedCourseHasBeenDeleted();
//
//    }
//
//
//    @AfterEach
//    public void removeTrainingPath() throws InterruptedException {
//        trainingPathsAdminPage
//                .goToTrainingPathsSection();
//        trainingPathsAdminPage
//                .clickDeleteButton();
//
//        String deleteTrainingPath = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
//        String equalsDeactivatedToggle = "The Training Path has been deleted";
//        assertEquals(equalsDeactivatedToggle, deleteTrainingPath);
//    }
//}
