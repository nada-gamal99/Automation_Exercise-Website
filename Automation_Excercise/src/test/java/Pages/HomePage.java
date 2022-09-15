package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By signup_login = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    private By logoutBtn = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");


    public void clickOnSignupLoginBtn(){
        base_page_driver.findElement(signup_login).click();
    }

    public void clickOnLogout(){
        base_page_driver.findElement(logoutBtn).click();
    }


}
