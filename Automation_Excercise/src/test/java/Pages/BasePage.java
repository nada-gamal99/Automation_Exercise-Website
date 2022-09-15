package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver base_page_driver;

    BasePage(WebDriver driver){
        base_page_driver=driver;
    }
    public void scroll_down(WebDriver driver){
        JavascriptExecutor java=(JavascriptExecutor) driver;
        java.executeScript("scroll(0,250)");
    }
}
