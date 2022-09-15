package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart_Checkout_Page extends BasePage{
    public AddToCart_Checkout_Page(WebDriver driver) {
        super(driver);
    }
    private By productsIcon = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a");
    private By product1 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    private By product2 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a");
   // private By product3 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[4]/div/div[1]/div[2]/div/a");
   // private By product4 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[1]/div[2]/div/a");
   // private By product5 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[6]/div/div[1]/div[2]/div/a");
   // private By product6 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[7]/div/div[1]/div[2]/div/a");
    private By addToCart = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    //private By continueShopping = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[1]/div/div/div[3]/button");
    private By cart = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a");
    private By proceedToCheckout = By.xpath("/html/body/section/div/section/div[1]/div/div/a");
    private By placeOrder = By.xpath("/html/body/section/div/div[7]/a");
    private By cardName = By.name("name_on_card");
    private By cardNo = By.name("card_number");
    private By cardCVC = By.name("cvc");
    private By cardExp1 = By.name("expiry_month");
    private By cardExp2 = By.name("expiry_year");
    private By confirmOrder = By.id("submit");
    private By downloadInvoice = By.xpath("/html/body/section/div/div/div/a");
    private By continueFinal = By.xpath("/html/body/section/div/div/div/div/a");


    public void clickOnProducts(){
        base_page_driver.findElement(productsIcon).click();
    }
    public void clickOnProduct1(){
        base_page_driver.findElement(product1).click();
    }
    public void clickOnProduct2(){
        base_page_driver.findElement(product2).click();
    }
    /*
    public void clickOnProduct3(){
        base_page_driver.findElement(product3).click();
    }
    public void clickOnProduct4(){
        base_page_driver.findElement(product4).click();
    }
    public void clickOnProduct5(){
        base_page_driver.findElement(product5).click();
    }
    public void clickOnProduct6(){
        base_page_driver.findElement(product6).click();
    }

     */
    public void clickOnAddToCart(){
        base_page_driver.findElement(addToCart).click();
    }
    /*
    public void clickOnContinueShopping(){
        base_page_driver.findElement(continueShopping).click();
    }

     */
    public void clickOnCart(){
        base_page_driver.findElement(cart).click();
    }
    public void clickOnProceedToCheckOut(){
        base_page_driver.findElement(proceedToCheckout).click();
    }
    public void clickOnPlaceOrder(){
        base_page_driver.findElement(placeOrder).click();
    }
    public void insertCardName( String CName){
        base_page_driver.findElement(cardName).sendKeys(CName);
    }
    public void insertCardNo( String CNo){
        base_page_driver.findElement(cardNo).sendKeys(CNo);
    }
    public void insertCardCVC( String cvc){
        base_page_driver.findElement(cardCVC).sendKeys(cvc);
    }
    public void insertCardExp1( String exp1){
        base_page_driver.findElement(cardExp1).sendKeys(exp1);
    }
    public void insertCardExp2( String exp2){
        base_page_driver.findElement(cardExp2).sendKeys(exp2);
    }
    public void clickOnConfirmOrder(){
        base_page_driver.findElement(confirmOrder).click();
    }
    public void clickOnDownloadInvoice(){
        base_page_driver.findElement(downloadInvoice).click();
    }
    public void clickOnContinueFinal(){
        base_page_driver.findElement(continueFinal).click();
    }

}
