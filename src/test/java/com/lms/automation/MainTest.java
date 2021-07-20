package com.lms.automation;

import com.Eleap.Algorithms.com.Admin.page.*;
import com.Eleap.Algorithms.user.page.UserDashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MainTest {
    public WebDriver driver;



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

    public  static  UserSectionPage userSectionPage;




    @BeforeEach
    public void start() throws MalformedURLException {

      //System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\chromeDriver\\chromedriver.exe");

      //  driver = new ChromeDriver();
//
//     DesiredCapabilities cap = DesiredCapabilities.chrome();
//     //  URL u = new URL("http://localhost:4444/wd/hub");
//           URL u = new URL("http://172.18.0.14:4444/wd/hub");
//    RemoteWebDriver driver = new RemoteWebDriver(u,cap);


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("https://selenium.ci.telania.net/wd/hub"), chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10008, TimeUnit.SECONDS);
        System.out.println("All is good");


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

    }


//    @AfterEach
//    public void finish() {
//        driver.close();
//
//        }
    }




