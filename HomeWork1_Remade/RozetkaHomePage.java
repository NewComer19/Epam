package HomeWork1_Remade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RozetkaHomePage {

    private WebDriver driver;

    @FindBy(className = "btn-link btn-link-blue main-popup-user-auth-btn")
    private WebElement welcomeTextOnHomePAge;


    RozetkaHomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public boolean HomePageIsDisplayed() {

        return welcomeTextOnHomePAge.isDisplayed();

    }


}