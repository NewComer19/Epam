package HomeWork1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork1 extends PageFactory {
    private WebDriver driver;
    private WebElement googleLogo;
    private WebElement searchElement;
    private WebElement searchItem;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://rozetka.com.ua/");

    }
    @After
    public void tearDown(){
      driver.close();
    }

    @Test
    public void verifyPage(){
        driver.navigate().to("https://rozetka.com.ua/office-school-books/c4625734/");
        driver.navigate().to("https://rozetka.com.ua/school_accessoies/c2460422/");
        driver.navigate().to("https://rozetka.com.ua/school_bags/c163943/");
        searchElement = driver.findElement(By.id("catalog_title_block"));
        Assert.assertTrue(searchElement.isDisplayed());
    }
    @Test
    public void buyItem(){

        driver.navigate().to("https://rozetka.com.ua/magtaller_20311_23/p37187992/");
        driver.findElement(By.name("topurchases")).click();
        driver.findElement(By.className("xhr")).click();
        driver.findElement(By.id("popup-checkout")).click();


    }
    @Test
    public void enterRozetka(){
        driver.findElement(By.name("signin")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).sendKeys("galey16@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("ForEpam2018");
        driver.findElement(By.name("auth_submit")).click();

    }

}
