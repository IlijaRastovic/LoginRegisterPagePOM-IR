package Base;

import Pages.LoginPage;
import Pages.ProfilPage;
import Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {


    public WebDriver driver;
    public WebDriverWait wait;
    public RegisterPage registerPage;
    public LoginPage loginPage;
    public ProfilPage profilPage;





    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.expandtesting.com/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
