package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InsiderPage {

    public InsiderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink' and normalize-space(text())='Company']")
    public WebElement Company;

    @FindBy(xpath = "//a[text()='Careers']")
    public WebElement Career;

    @FindBy(xpath = "//h3[text()='Customer Success']")
    public WebElement Teams;

    @FindBy(xpath = "//p[text()='New York']")
    public WebElement Locations;

    @FindBy(xpath = "//h2[text()='Life at Insider']")
    public WebElement LifeAtInsider;

    @FindBy(xpath = "//a[text()='See all QA jobs']")
    public WebElement QaJobs;

    @FindBy(xpath = "//p[text()='The little']")
    public WebElement TheTitle;

    @FindBy(xpath = "//span[@title='Remove all items']")
    public WebElement RemoveAll;

    @FindBy(xpath = "//span[@data-select2-id='1']")
    public WebElement FilterTab;

    @FindBy(xpath = "//li[text()='Istanbul, Turkiye']")
    public WebElement Istanbul;

    @FindBy(xpath = "//span[@id='select2-filter-by-department-container']")
    public WebElement FilterDepartment;

    @FindBy(xpath = "//li[@id='select2-filter-by-department-result-ifsu-Quality Assurance']")
    public WebElement Qa;

    @FindBy(xpath = "//p[textd()='Account Director']")
    public WebElement AccountDirector;

    @FindBy(xpath = "//a[text()='Accept All']")
    public WebElement Cookie;

    @FindBy(xpath = "//p[text()='Software Quality Assurance Engineer']")
    public WebElement OpenPositions;

    @FindBy(xpath = "(//a[text()='View Role'])[2]")
    public WebElement ViewRole;

    //@FindBy(xpath = "((//a[@class='postings-btn template-btn-submit shamrock'])[1]")
    //public WebElement ApplyButton;


}
