package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProfilPage;
import Pages.RegisterPage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp() throws InterruptedException {


        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        profilPage = new ProfilPage(driver);
        Thread.sleep(5000);



    }

    @Test (priority = 3)
    public void validCredentialRegisterTest(){
        registerPage.enterValidUsername();
        registerPage.enterValidPassword();
        registerPage.enterValidConfirmPassword();
        registerPage.clickRegisterBtn();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSuccessfullyRegisterMsg()));
        Assert.assertTrue(loginPage.getSuccessfullyRegisterMsg().isDisplayed());
        Assert.assertTrue(loginPage.getUsernameTxtBox().isDisplayed());
        Assert.assertTrue(loginPage.getPasswordTxtBox().isDisplayed());
        Assert.assertTrue(loginPage.getLoginBtn().isDisplayed());
        Assert.assertEquals(loginPage.getUsernameTxtBox().getText(), "");
        Assert.assertEquals(loginPage.getPasswordTxtBox().getText(), "");
    }

    @Test (priority = 6)
    public void validCredentialsLoginTest(){
        //validCredentialRegisterTest();
        loginPage.enterValidUsername();
        loginPage.enterValidPassword();
        loginPage.clickLoginBtn();
        wait.until(ExpectedConditions.visibilityOf(profilPage.getHelloMsg()));
        Assert.assertTrue(profilPage.getHelloMsg().isDisplayed());
        Assert.assertTrue(profilPage.getLogoutBtn().isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), profilPage.getUrl());
    }

    @Test (priority = 1)
    public void invalidUsernameRegisterTest(){
        registerPage.enterInvalidUsername();
        registerPage.enterValidPassword();
        registerPage.enterInvalidConfirmPassword();
        registerPage.clickRegisterBtn();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInvalidUsernameErrorMsg()));
        Assert.assertTrue(registerPage.getUserNameErrorMsg().isDisplayed());
        Assert.assertTrue(registerPage.getUserNameErrorMsg().getText().contains("Username"));
    }

    @Test (priority = 2)
    public void invalidPasswordRegisterTest(){
        registerPage.enterValidUsername();
        registerPage.enterInvalidPassword();
        registerPage.enterInvalidConfirmPassword();
        registerPage.clickRegisterBtn();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInvalidPasswordErrorMsg()));
        Assert.assertTrue(registerPage.getUserNameErrorMsg().isDisplayed());
        Assert.assertTrue(registerPage.getUserNameErrorMsg().getText().contains("Password"));
    }

    @Test (priority = 4)
    public void invalidUsernameLoginTest(){
        //validCredentialRegisterTest();
        loginPage.enterInvalidUsername();
        loginPage.enterValidPassword();
        loginPage.clickLoginBtn();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInvalidUsernameErrorMsg()));
        Assert.assertTrue(loginPage.getInvalidUsernameErrorMsg().isDisplayed());
        Assert.assertTrue(loginPage.getInvalidUsernameErrorMsg().getText().contains("username"));
    }

    @Test (priority = 5)
    public void invalidPasswordLoginTest(){
        //validCredentialRegisterTest();
        loginPage.enterValidUsername();
        loginPage.enterInvalidPassword();
        loginPage.clickLoginBtn();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInvalidPasswordErrorMsg()));
        Assert.assertTrue(loginPage.getInvalidPasswordErrorMsg().isDisplayed());
        Assert.assertTrue(loginPage.getInvalidPasswordErrorMsg().getText().contains("password"));
    }


    @AfterMethod
    public void tearDown(){
    //driver.quit();
    }


}
