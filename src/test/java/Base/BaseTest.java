package Base;

import Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {


    public  WebDriver driver;
    public RegisterPage registerPage;



    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();


    }
}
