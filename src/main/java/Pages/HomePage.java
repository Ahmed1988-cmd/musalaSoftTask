package Pages;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //Variables
    private WebDriver driver;
    private final String URL = System.getProperty("MusalaWebsite");

    //Locators
    public static By ContactUs_Button() {
        return By.xpath("//button[@class='contact-label btn btn-1b']");

    }

    public static By Name1_Text() {
        return By.xpath("//input[@id='cf-1']");
    }

    public static By Email_Text() {
        return By.xpath("//input[@id='cf-2']");
    }

    public static By Mobile_Text() {
        return By.xpath("//input[@id='cf-3']");
    }

    public static By Subject_Text() {
        return By.xpath("//input[@id='cf-4']");
    }

    public static By YourMessage_Text() {
        return By.xpath("//textarea[@id='cf-5']");
    }

    public static By Send_Button() {
        return By.xpath("//input[@value='Send']");
    }


    public void CheckInvalidEmail(String name, String email, String mobile, String subject, String message) {
        (new ElementActions(driver))
                .keyPress(ContactUs_Button(), Keys.ENTER)
                .type(Name1_Text(), name)
                .type(Email_Text(), email)
                .type(Mobile_Text(), mobile)
                .type(Subject_Text(), subject)
                .type(YourMessage_Text(), message)
                .keyPress(Send_Button(), Keys.ENTER);


    }


    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Keywords
    public HomePage navigate() {
        BrowserActions.navigateToURL(driver, URL);
        return this;
    }

}
