package HomeWork1_Remade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RozetkaLogin {
    private WebDriver driver;

    @FindBy(name = "signin")
    private WebElement signInButton;

    @FindBy(name = "login")
    private WebElement loginField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "auth_submit")
    private WebElement authSubmitButton;


    RozetkaLogin(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void signInButtoClick()
    {
        signInButton.click();
    }
    public void loginFieldFill(String login)
    {
        loginField.sendKeys(login);
    }
    public void passwordFieldFill(String password)
    {
        passwordField.sendKeys(password);
    }
    public void authSubmitButtonClick()
    {
        authSubmitButton.click();
    }
}
