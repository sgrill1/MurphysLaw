package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends PageObject {

    private final String homepageUrl = "https://uk.gymshark.com/";
    private final WebDriverWait webDriverWait;

    @FindBy(xpath = "//*[@id='shopify-section-header']/div/header/nav/ul/li[1]/a/span")
    private WebElementFacade menNavButton;

    public HomePage(WebDriver webDriver){
        super(webDriver);
        webDriverWait = new WebDriverWait(webDriver,5);
    }

    public void goToHomepage(){
        getDriver().get(homepageUrl);
    }

    public void clickOnMensTab(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(menNavButton));
        clickOn(menNavButton);
    }


}
