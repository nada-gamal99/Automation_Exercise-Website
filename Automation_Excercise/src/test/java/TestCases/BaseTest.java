package TestCases;

import Pages.HomePage;
import Pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected ChromeDriver base_test_driver;
    private final String URL = "http://automationexercise.com/";
    protected HomePage homePage;
    protected SignUpPage signUpPage;

    @BeforeClass
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        base_test_driver = new ChromeDriver();
        new ChromeOptions();
        base_test_driver.manage().window().maximize();
        base_test_driver.get(URL);
        homePage = new HomePage(base_test_driver);
        signUpPage = new SignUpPage(base_test_driver);
    }

    @AfterClass
    public void teardown() throws Exception{
        base_test_driver.quit();
    }
}
