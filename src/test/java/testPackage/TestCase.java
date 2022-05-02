package testPackage;

import Pages.*;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {

    private WebDriver driver;
    private JSONFileManager testData = new JSONFileManager("src/test/resources/testDataFiles/testData.json");

    @Description("Check First Invalid Email")
    @Test(priority = 1, alwaysRun = true)
    public void CheckFirstInvalidEmail() {
        new HomePage(driver).navigate().CheckInvalidEmail(testData.getTestData("Name"), testData.getTestData("Email1"), testData.getTestData("Mobile"), testData.getTestData("Subject"), testData.getTestData("YourMessage"));

        System.out.println(driver.getCurrentUrl());
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.musala.com/");

        Validations.assertThat()
                .element(driver, Results.Check_InvalidMessageEmail())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Email Cant Accepted inValid Email For First User ")
                .perform();

    }

    @Description("Check Second Invalid Email")
    @Test(priority = 2)
    public void CheckSecondInvalidEmail() {
        new HomePage(driver).navigate().CheckInvalidEmail(testData.getTestData("Name2"), testData.getTestData("Email2"), testData.getTestData("Mobile2"), testData.getTestData("Subject2"), testData.getTestData("YourMessage2"));

        Validations.assertThat()
                .element(driver, Results.Check_InvalidMessageEmail())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Email Cant Accepted inValid Email For Second User ")
                .perform();
    }

    @Description("Check Third Invalid Email")
    @Test(priority = 3)
    public void CheckThirdInvalidEmail() {
        new HomePage(driver).navigate().CheckInvalidEmail(testData.getTestData("Name3"), testData.getTestData("Email3"), testData.getTestData("Mobile3"), testData.getTestData("Subject3"), testData.getTestData("YourMessage3"));

        Validations.assertThat()
                .element(driver, Results.Check_InvalidMessageEmail())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Email Cant Accepted inValid Email For Third User ")
                .perform();
    }

    @Description("Check Fourth Invalid Email")
    @Test(priority = 4)
    public void CheckFourthInvalidEmail() {
        new HomePage(driver).navigate().CheckInvalidEmail(testData.getTestData("Name4"), testData.getTestData("Email4"), testData.getTestData("Mobile4"), testData.getTestData("Subject4"), testData.getTestData("YourMessage4"));

        Validations.assertThat()
                .element(driver, Results.Check_InvalidMessageEmail())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Email validation is >>>>  The e-mail address entered is invalid. ")
                .perform();
    }

    @Description("Check Fifth Invalid Email")
    @Test(priority = 5)
    public void CheckFifthInvalidEmail() {
        new HomePage(driver).navigate().CheckInvalidEmail(testData.getTestData("Name5"), testData.getTestData("Email5"), testData.getTestData("Mobile5"), testData.getTestData("Subject5"), testData.getTestData("YourMessage5"));

        Validations.assertThat()
                .element(driver, Results.Check_InvalidMessageEmail())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Email Cant Accepted  inValid Email For Fifth User ")
                .perform();

    }

    @Description("This Scenario for TestCase 2")
    @Test(priority = 6)
    public void TestCaseForCompany() {
        new HomePage(driver).navigate();
        new CompanyPage(driver).TestCase2();
        String URL = driver.getCurrentUrl();
        System.out.println("Verify Company URL:" + URL);
        Assert.assertEquals(URL, "https://www.musala.com/company/");
        Validations.assertThat()
                .element(driver, Results.Check_LeadershipDisplayed())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Leadership is Displayed ")
                .perform();

        driver.navigate().to("https://www.facebook.com/MusalaSoft?fref=ts");
        String FaceBookURL = driver.getCurrentUrl();
        System.out.println(">>>>>>Verify Company URL<<<<<<<<:" + FaceBookURL);
        Assert.assertEquals(FaceBookURL, "https://www.facebook.com/MusalaSoft?fref=ts");

        Validations.assertThat()
                .element(driver, Results.Check_PhotoMusalaSoft())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Photo is Displayed ")
                .perform();

    }

    @Description("This Scenario for TestCase 3")
    @Test(priority = 7)
    public void TestCaseForCareers() {
        new HomePage(driver).navigate();
        new CareersPage(driver).TestCase3(testData.getTestData("ApplyName1"), testData.getTestData("ApplyEmail1"), testData.getTestData("ApplyMobile1"));


        Validations.assertThat()
                .element(driver, Results.Check_GeneralDescriptionIsDisplayed())
                .matchesReferenceImage()
               .withCustomReportMessage(" Assert that General Description Img is Displayed ")
               .perform();
        Validations.assertThat()
                .element(driver, Results.Check_RequirementsIsDisplayed())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that Requirements Img is Displayed ")
                .perform();

        Validations.assertThat()
               .element(driver, Results.Check_ApplyButtonIsDisplayed())
               .matchesReferenceImage().
                withCustomReportMessage(" Assert that Apply Button Img is Displayed ")
                  .perform();
    }

    @Description("This Scenario for TestCase 3")
    @Test(priority = 8)
    public void TestCaseForCareersApply() {
        new HomePage(driver).navigate();
        new CareersPage(driver).TestCase3(testData.getTestData("ApplyName2"), testData.getTestData("ApplyEmail2"), testData.getTestData("ApplyMobile2"));



       Validations.assertThat()
                .element(driver, Results.Check_ApplyEmailValidation())
                .matchesReferenceImage()
                .withCustomReportMessage(" Assert that The Validation Of Email is invalid And Displayed ")
                .perform();

        Validations.assertThat()
                .element(driver, Results.Check_ApplyMobileValidation())
               .matchesReferenceImage().
                withCustomReportMessage(" Assert that The Validation Of telephone number is invalid And Displayed ")
                .perform();
    }

    @Description("This Scenario for TestCase 4")
    @Test(priority = 9)
    public void TestCaseForPrint() {
        new HomePage(driver).navigate();
        new PrintCareerPage(driver).TestCase4();

    }


    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();

    }

    @AfterMethod
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }


}
