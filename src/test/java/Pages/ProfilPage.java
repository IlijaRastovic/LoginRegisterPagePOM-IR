package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilPage {

    WebDriver driver;
    WebElement helloMsg;
    WebElement logoutBtn;
    String url;

    public ProfilPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHelloMsg() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getLogoutBtn() {
        return driver.findElement(By.linkText("Logout"));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    //----------------------------------------



}
