package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.MensHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MyStepdefs {

    private WebDriver webDriver ;
    private HomePage homePage;
    private MensHomePage mensHomePage;

    public MyStepdefs() {
    }

    @Before
    public void launchBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        webDriver = new ChromeDriver(options);
        homePage = new HomePage(webDriver);
        mensHomePage = new MensHomePage(webDriver);
    }

    @Given("I open a website")
    public void iOpenAWebsite() {
        System.out.println("Go to the homepage");
        homePage.goToHomepage();
    }

    @When("I click on a link")
    public void iClickOnALink() {
        System.out.println("Click on the mens tab");
        homePage.clickOnMensTab();
    }

    @Then("I am on a new webpage")
    public void iAmOnANewWebpage() {
        System.out.println("I am on the mens page");
        mensHomePage.assertOnMensPage();
    }
}
