package Tests;

import Base.BaseTest;
import Pages.RegisterPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.expandtesting.com/register");
        registerPage = new RegisterPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void validCredentialRegisterTest(){
        registerPage.enterValidUsername();
        registerPage.enterValidPassword();
        registerPage.enterValidConfirmPassword();
        registerPage.clickRegisterBtn();
        //Dodati asertacije


    }


}
