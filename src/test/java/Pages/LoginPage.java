package Pages;

import Data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    WebElement succsefullyRegisterMsg;
    WebElement usernameTxtBox;
    WebElement passwordTxtBox;
    WebElement loginBtn;
    WebElement invalidUsernameErrorMsg;
    WebElement invalidPasswordErrorMsg;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSuccessfullyRegisterMsg() {
        return driver.findElement(By.id("flash"));
    }

    public WebElement getUsernameTxtBox() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordTxtBox() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.id("submit-login")) ;
    }

    public WebElement getInvalidUsernameErrorMsg() {
        return driver.findElement(By.id("flash"));
    }

    public WebElement getInvalidPasswordErrorMsg() {
        return driver.findElement(By.id("flash"));
    }
    //-----------------------------------------------------

    public void enterValidUsername(){
        getUsernameTxtBox().clear();
        getUsernameTxtBox().sendKeys(TestData.validUserName);
    }

    public void enterValidPassword  (){
        getPasswordTxtBox().clear();
        getPasswordTxtBox().sendKeys(TestData.validPassword);
    }

    public void clickLoginBtn (){
        getLoginBtn().sendKeys(Keys.ENTER);
    }

    public void enterInvalidUsername(){
        getUsernameTxtBox().clear();
        getUsernameTxtBox().sendKeys(TestData.invalidUserNameShort);
    }

    public void enterInvalidPassword(){
        getPasswordTxtBox().clear();
        getPasswordTxtBox().sendKeys(TestData.invalidPassword);

    }

}
