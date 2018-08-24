package HomeWork1_Remade;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class HomeWork1 {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.rozetka.ua");
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public void testHomePage() {
        RozetkaHomePage home = new RozetkaHomePage(driver);
        Assert.assertTrue(home.HomePageIsDisplayed());

    }
    @Test
    public void testItemPage()
    {
        RozetkaItemPageCheck item = new RozetkaItemPageCheck(driver);
        Assert.assertTrue(item.pageOfItemVerify());
    }
    @Test
    public void testPurchasingItem()
    {
        RozetkaItemPageCheck item = new RozetkaItemPageCheck(driver);
        item.clickOnBuyButton();
        Assert.assertTrue(item.isDisplayedPurchaseButton());
    }
    @Test
    public void loginInRozetka()
    {
        RozetkaLogin auth = new RozetkaLogin(driver);
        auth.signInButtoClick();
        auth.loginFieldFill("galey16@gmail.com");
        auth.passwordFieldFill("ForEpam2018");
        auth.authSubmitButtonClick();
    }

}
