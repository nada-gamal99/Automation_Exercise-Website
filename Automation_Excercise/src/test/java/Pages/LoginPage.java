package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By email_login = By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]");
    private By password_login = By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]");
    private By loginBtn = By.xpath("/html/body/section/div/div/div[1]/div/form/button");
    public void insertEmailLogin(String mail){
        base_page_driver.findElement(email_login).sendKeys(mail);
    }
    public void insertPasswordLogin(String password){
        base_page_driver.findElement(password_login).sendKeys(password);
    }
    public void clickOnLoginBtn(){
        base_page_driver.findElement(loginBtn).click();
    }
}
