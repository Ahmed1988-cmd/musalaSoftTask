package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Results {

    //Variables
    private WebDriver driver;


    // Validation Locators
    public static By Check_InvalidMessageEmail() {
        return By.xpath("//*[@id=\"wpcf7-f875-o1\"]/form/p[2]/span/span");

    }

    public static By Check_LeadershipDisplayed() {
        return By.xpath("//h2[normalize-space()='Leadership']");

    }

    public static By Check_PhotoMusalaSoft() {
        return By.xpath("//a[@aria-label='Musala Soft profile photo']//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]");

    }

    public static By Check_GeneralDescriptionIsDisplayed() {
        return By.xpath("/html//div[@id='content']/section/article/div[@class='entry-header']//h2[.='General description']");

    }

    public static By Check_RequirementsIsDisplayed() {
        return By.xpath("//h2[normalize-space()='Requirements']");

    }

    public static By Check_ApplyButtonIsDisplayed() {
        return By.cssSelector("input[value='Apply']");

   }


    public static By Check_ApplyEmailValidation() {
        return By.xpath("//*[@id=\"wpcf7-f880-o1\"]/form/p[3]/span/span");

    }


    public static By Check_ApplyMobileValidation() {
        return By.xpath("//*[@id=\"wpcf7-f880-o1\"]/form/p[4]/span/span");

    }

    //Constructor
    public Results(WebDriver driver) {
        this.driver = driver;
    }
}
