package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.*;
import java.io.FileWriter;
import java.util.List;

public class PrintCareerPage

{

    //Variables
    private static final By POSITION_PAGE_ROOT_SELECTOR = By.className("Jobs");
    private static final By JOB_CONTENT_TITLE_SELETOR
            = By.xpath(".//div[@class = 'content-title']/h2");
    private static final By APPLY_BUTTON_SELECTOR
            = By.xpath(".//input[@value ='Apply']");
    private WebElement jobPositionPageRootWebElement;
    String[] jobMainSections = {"General description",
            "Requirements", "Responsibilities",
            "What we offer"};
    private WebDriver driver;
    private FileWriter writer;


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

    public void TestCase4()

    {
        (new ElementActions(driver)
        )
                .keyPress(Careers_Button(), Keys.ENTER)
                .keyPress(CheckOurOpenPositions_Button(), Keys.ENTER)
                .select(FilterByLocation_Button(), "Sofia");
        PrintInConsole();

    }
    public void PrintInConsole(){
        List<WebElement> jobTitles=driver.findElements(By.xpath("//div[@class='front']/h2"));
        List<WebElement> moreInfoLink=driver.findElements(By.xpath("//div[@class='card-container']/a"));
        System.out.println("Sofia");
        for(int i=0;i<jobTitles.size();i++){
        System.out.println("Position : "+jobTitles.get(i).getText().toString());
        System.out.println("More Info : "+moreInfoLink.get(i).getAttribute("href")+"\n\n");

        }
    }

    //Constructor
    public PrintCareerPage(WebDriver driver) {
        this.driver = driver;
    }

}