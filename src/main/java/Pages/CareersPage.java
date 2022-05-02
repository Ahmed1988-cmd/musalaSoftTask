package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CareersPage

{

    //Variables
    private WebDriver driver;


    //Locators
    public static By Careers_Button() {
        return By.xpath("//ul[@id='menu-main-nav-1']//a[@class='main-link'][normalize-space()='Careers']");

    }

    public static By CheckOurOpenPositions_Button() {
        return By.xpath("//*[@id=\"content\"]/div[1]/div/div[1]/div/section/div/a/button");

    }


    public static By FilterByLocation_Button()

    {
        return By.id("get_location");

    }

    public static By AutomationQA_Button() {
        return By.partialLinkText("Automation QA Engineer");

    }

    public static By Apply_Button() {
        return By.xpath("//input[@value='Apply']");

    }
    public static By YourName_Text() {
        return By.xpath("//input[@name='your-name']");

    }
    public static By YourEmail_Text() {
        return By.xpath("//input[@name='your-email']");

    }
    public static By YourMobile_Text() {
        return By.xpath("//input[@name='mobile-number']");

    }
    public static By UploadCV_Text() {
        return By.xpath("//input[@id='uploadtextfield']");

    }

    public static By AgreeCheckbox() {
        return By.xpath("/html/body/div[8]/div/div[9]/div/div/div/form/div[3]/input");

    }

    public static By Send_Button() {
        return By.xpath("//*[@id=\"wpcf7-f880-o1\"]/form/div[4]/p/input");

    }
    public void TestCase3(String name,String email,String  mobile )

    {
        (new ElementActions(driver)
        )
                .keyPress(Careers_Button(), Keys.ENTER)
                .keyPress(CheckOurOpenPositions_Button(), Keys.ENTER)
                .select(FilterByLocation_Button(), "Anywhere")
                .keyPress(AutomationQA_Button(), Keys.ENTER)
              .keyPress(Apply_Button(), Keys.ENTER)
                .type(YourName_Text(),name)
               .type(YourEmail_Text(),email)
               .type(YourMobile_Text(),mobile)
                .typeFileLocationForUpload(UploadCV_Text(),"target/resources/UploadCV/Ahmed_Hafez-QC .pdf")
                .keyPress(AgreeCheckbox(),Keys.ENTER)
               .keyPress(Send_Button(),Keys.ENTER);




    }


    //Constructor
    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

}

