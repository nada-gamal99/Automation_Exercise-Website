package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    private By userName = By.name("name");
    private By email = By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]");
    private By signUpButton = By.xpath("/html/body/section/div/div/div[3]/div/form/button");
    private By gender = By.id("id_gender2");
    private By password = By.id("password");
    private By day = By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[4]");
    private By month = By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[4]");
    private By year = By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[24]");
    private By newSletter_check = By.id("newsletter");
    private By sendOffers_check = By.id("optin");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address = By.id("address1");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipCode = By.id("zipcode");
    private By phoneNumber = By.id("mobile_number");
    private By submitFormBtn = By.xpath("/html/body/section/div/div/div/div[1]/form/button");
    private By continueBtn = By.xpath("/html/body/section/div/div/div/div/a");

    public void insertName(String name){
        base_page_driver.findElement(userName).sendKeys(name);
    }
    public void insertEmail(String mail){
        base_page_driver.findElement(email).sendKeys(mail);
    }
    public void clickOnSignup(){
        base_page_driver.findElement(signUpButton).click();
    }
    public void clickOnGender(){
        base_page_driver.findElement(gender).click();
    }
    public void insertPassword(String pass){
        base_page_driver.findElement(password).sendKeys(pass);
    }
    public void insertDay(){
        base_page_driver.findElement(day).click();
    }
    public void insertMonth(){
        base_page_driver.findElement(month).click();
    }
    public void insertYear(){
        base_page_driver.findElement(year).click();
    }
    public void clickOnNewSletter(){
        base_page_driver.findElement(newSletter_check).click();
    }
    public void clickOnSendOffers(){
        base_page_driver.findElement(sendOffers_check).click();
    }
    public void insertFName(String fName){
        base_page_driver.findElement(firstName).sendKeys(fName);
    }
    public void insertLName(String lName){
        base_page_driver.findElement(lastName).sendKeys(lName);
    }
    public void insertCompany(String com){
        base_page_driver.findElement(company).sendKeys(com);
    }
    public void insertAddress(String adr){
        base_page_driver.findElement(address).sendKeys(adr);
    }
    public void insertCountry(String contry){
        base_page_driver.findElement(country).sendKeys(contry);
    }
    public void insertState(String sta){
        base_page_driver.findElement(state).sendKeys(sta);
    }
    public void insertCity(String cit){
        base_page_driver.findElement(city).sendKeys(cit);
    }
    public void insertZipCode(String code){
        base_page_driver.findElement(zipCode).sendKeys(code);
    }
    public void insertPhoneNo(String phone){
        base_page_driver.findElement(phoneNumber).sendKeys(phone);
    }
    public void clickOnSubmit(){
        base_page_driver.findElement(submitFormBtn).click();
    }
    public void clickOnContinue(){
        base_page_driver.findElement(continueBtn).click();
    }
}
