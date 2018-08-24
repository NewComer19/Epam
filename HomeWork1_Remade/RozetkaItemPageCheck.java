package HomeWork1_Remade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RozetkaItemPageCheck {
    private WebDriver driver;

    @FindBy(id = "catalog_title_block")
    private WebElement idOfItemPage;

    @FindBy(name = "topurchases")
    private WebElement buyButton;

    @FindBy(id = "popup-checkout")
    private WebElement purchaseButton;

    RozetkaItemPageCheck(WebDriver driver)
    {
        this.driver = driver;
        driver.get("https://rozetka.com.ua/school_bags/c163943/");

        PageFactory.initElements(driver,this);
    }
    public boolean pageOfItemVerify()
    {
        return idOfItemPage.isDisplayed();
    }
    public void clickOnBuyButton()
    {
        buyButton.click();
    }
    public boolean isDisplayedPurchaseButton()
    {
       return purchaseButton.isDisplayed();
    }

}
