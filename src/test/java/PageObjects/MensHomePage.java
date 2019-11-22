package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MensHomePage extends PageObject {

    private final String mensHomepageUrl = "https://uk.gymshark.com/pages/shop-men";
    private WebDriverWait webDriverWait;

    @FindBy(xpath = "//*[@id='shopify-section-men-landing-blocks']/div[1]/a/div/div[1]")
    private WebElementFacade mensImage;


    public MensHomePage(WebDriver driver) {
        super(driver);
        webDriverWait = new WebDriverWait(driver,5);
    }

    public void waitForPageToLoad(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(mensImage));
    }

    public void assertOnMensPage(){
        assert getDriver().getCurrentUrl().equals(mensHomepageUrl);
    }




}
