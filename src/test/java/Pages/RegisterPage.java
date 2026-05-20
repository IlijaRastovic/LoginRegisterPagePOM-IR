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


}
