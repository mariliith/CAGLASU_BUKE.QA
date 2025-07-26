package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.InsiderPage;
import utilities.ConfigurationReader;
import utilities.Driver;


import static org.testng.Assert.assertTrue;


public class InsiderPageTest {


    InsiderPage insiderPage = new InsiderPage();

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(insiderPage.Company).perform();

        insiderPage.Career.click();

        String careerUrl = Driver.getDriver().getCurrentUrl();

        assertTrue(careerUrl.contains("career"));

        actions.scrollToElement(insiderPage.Teams).perform();
        assertTrue(insiderPage.Teams.isDisplayed());

        actions.scrollToElement(insiderPage.Locations).perform();
        assertTrue(insiderPage.Locations.isDisplayed());

        actions.scrollToElement(insiderPage.LifeAtInsider).perform();
        assertTrue(insiderPage.LifeAtInsider.isDisplayed());


        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url2"));

        actions.click(insiderPage.Cookie).perform();

        insiderPage.QaJobs.click();

        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(5000);

        actions.click(insiderPage.FilterTab).perform();

        Thread.sleep(3000);

        actions.click(insiderPage.Istanbul).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);

        actions.moveToElement(insiderPage.OpenPositions).perform();
        insiderPage.ViewRole.click();

        //assertTrue(insiderPage.ApplyButton.isDisplayed());
        //Thread.sleep(5000);

        Driver.closeDriver();

    }

}
