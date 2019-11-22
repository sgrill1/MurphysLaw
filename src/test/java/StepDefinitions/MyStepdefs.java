package StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {

    private WebDriver webDriver ;

    public MyStepdefs() {
    }

    @Before
    public void launchBrowser(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Given("I open a website")
    public void iOpenAWebsite() {
        webDriver.get("https://uk.gymshark.com/");
    }

    @When("I click on a link")
    public void iClickOnALink() {
        webDriver.findElement(By.xpath("//*[@id='shopify-section-header']/div/header/nav/ul/li[1]/a/span")).click();
    }

    @Then("I am on a new webpage")
    public void iAmOnANewWebpage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://uk.gymshark.com/pages/shop-men");
    }
}
