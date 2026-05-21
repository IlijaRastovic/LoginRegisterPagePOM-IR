package Pages;

import Data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    WebDriver driver;
    WebElement userNameTxtBox;
    WebElement passwordTxtBox;
    WebElement confirmPasswordTxtBox;
    WebElement registerBtn;
    WebElement userNameErrorMsg;
    WebElement passwordErrorMsg;
    WebElement confirmPasswordErrorMsg;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserNameTxtBox() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordTxtBox() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getConfirmPasswordTxtBox() {
        return driver.findElement(By.id("confirmPassword"));
    }

    public WebElement getRegisterBtn() {
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }

    public WebElement getUserNameErrorMsg() {
        return driver.findElement(By.id("flash"));
    }

    public WebElement getPasswordErrorMsg() {
        return driver.findElement(By.id("flash"));
    }

    public WebElement getConfirmPasswordErrorMsg() {
        return driver.findElement(By.id("flash"));
    }

    //============================================================

    public void enterValidUsername() {
        getUserNameTxtBox().clear();
        getUserNameTxtBox().sendKeys(TestData.validUserName);
    }

    public void enterValidPassword(){
        getPasswordTxtBox().clear();
        getPasswordTxtBox().sendKeys(TestData.validPassword);
    }

    public void enterValidConfirmPassword(){
        getConfirmPasswordTxtBox().clear();
        getConfirmPasswordTxtBox().sendKeys(TestData.validPassword);
    }

    public void clickRegisterBtn(){
        getRegisterBtn().sendKeys(Keys.ENTER);
    }

    public void enterInvalidUsername(){
        getUserNameTxtBox().clear();
        getUserNameTxtBox().sendKeys(TestData.invalidUserNameShort);
    }

    public void enterInvalidPassword(){
        getPasswordTxtBox().clear();
        getPasswordTxtBox().sendKeys(TestData.invalidPassword);
    }

    public void enterInvalidConfirmPassword(){
        getConfirmPasswordTxtBox().clear();
        getConfirmPasswordTxtBox().sendKeys(TestData.invalidPassword);
    }


}
