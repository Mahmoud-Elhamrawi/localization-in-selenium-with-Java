package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver ;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
    }







    @AfterMethod
    public void cleanUp()
    {
        driver.quit();
    }
}
