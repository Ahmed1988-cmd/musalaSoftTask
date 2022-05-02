package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CompanyPage

{

    //Variables
    private WebDriver driver;



    //Locators
    public static By Company_Button()

    {
        return By.xpath("//ul[@id='menu-main-nav-1']//a[@class='main-link'][normalize-space()='Company']");

    }


    public void TestCase2 ()

    {
        (new ElementActions(driver))
                .keyPress(Company_Button(), Keys.ENTER);
    }


    //Constructor
    public CompanyPage (WebDriver driver)
    {
        this.driver=driver;
    }




}
