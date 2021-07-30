package com.lms.automation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObservationTest extends MainTest {

    @BeforeEach
    public void createObservationCourse() throws InterruptedException {
        loginAdminPage.goTo()
                .fillEmailField("saqo21harutyunyan+19@gmail.com")
                .fillPassField("7rujd12f")
                .clickLoginButton()
                .ifDisplayedText();
        observationChecklistTab
                .goToCourses()
                .addObservationLesson()
                .ifDisplayedObservationChecklist();


    }
    @Test
    public void createObservation () throws InterruptedException {
        observationChecklistTab
                .createObservation();
        coursesSectionAdminPage
                .assignUser("Test Trainee");
        observationChecklistTab
                .estimateUser()
                .ifDisplayedCompleted();

    }
    @AfterEach
    public void removeTheCourses() throws InterruptedException {
        coursesSectionAdminPage
                .goToCourses()
                .search_By_Course_Name()
                .remove_The_Courses("DELETE")
                .ifDisplayedCourseHasBeenDeleted();

    }


}
