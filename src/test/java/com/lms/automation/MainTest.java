package com.lms.automation;

import com.Eleap.Algorithms.com.Admin.page.*;
import com.Eleap.Algorithms.user.page.UserDashboardPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MainTest {
    WebDriver driver;

    public LoginAdminPage loginAdminPage;

    public CoursesSectionAdminPage coursesSectionAdminPage;

    public DropDownMenuTab dropDownMenuTab;

    public MyAssignedSelfEnrollmentTab myAssignedSelfEnrollmentTab;

    public ManageCategoriesManageEventsTab manageCategoriesManageEventsTab;

    public QuizResultTabs quizResultTabs;

    public ObservationChecklistTab observationChecklistTab;

    public TrainingPathsAdminPage trainingPathsAdminPage;

    public UserDashboardPage userDashboardPage;

    public static OjtSectionPage ojtSectionPage;

    public static UserSectionPage userSectionPage;


    @BeforeEach
    public void start() throws MalformedURLException {

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        //URL u = new URL("http://localhost:4444/wd/hub");
         URL u = new URL("http://172.19.0.19:4444/wd/hub");
         driver = new RemoteWebDriver(u, cap);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-extensions");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.out.println("All is good");


        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginAdminPage = new LoginAdminPage(driver);

        coursesSectionAdminPage = new CoursesSectionAdminPage(driver);

        dropDownMenuTab = new DropDownMenuTab(driver);

        myAssignedSelfEnrollmentTab = new MyAssignedSelfEnrollmentTab(driver);

        manageCategoriesManageEventsTab = new ManageCategoriesManageEventsTab(driver);

        quizResultTabs = new QuizResultTabs(driver);

        observationChecklistTab = new ObservationChecklistTab(driver);

        trainingPathsAdminPage = new TrainingPathsAdminPage(driver);

        userDashboardPage = new UserDashboardPage(driver);

        ojtSectionPage = new OjtSectionPage(driver);

        userSectionPage = new UserSectionPage(driver);

        System.out.println("okokokokoko");

    }


    @AfterEach
    void finish() throws MalformedURLException {
        driver.quit();

    }


}




