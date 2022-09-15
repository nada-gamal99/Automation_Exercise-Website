package TestCases;

import Pages.AddToCart_Checkout_Page;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E2E_Scenario extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;
    AddToCart_Checkout_Page addToCart_checkout_page;

    @Test
    public void E2E_01(){
        homePage = new HomePage(base_test_driver);
        homePage.clickOnSignupLoginBtn();
        loginPage = new LoginPage(base_test_driver);
        loginPage.insertEmailLogin("nada@gmail.com");
        loginPage.insertPasswordLogin("12345");
        loginPage.clickOnLoginBtn();
        addToCart_checkout_page = new AddToCart_Checkout_Page(base_test_driver);
        addToCart_checkout_page.clickOnProducts();
        addToCart_checkout_page.clickOnProduct1();
        addToCart_checkout_page.clickOnAddToCart();
        addToCart_checkout_page.clickOnProducts();
        addToCart_checkout_page.clickOnProduct2();
        addToCart_checkout_page.clickOnAddToCart();
        addToCart_checkout_page.clickOnProducts();


        addToCart_checkout_page.clickOnCart();
        addToCart_checkout_page.clickOnProceedToCheckOut();
        addToCart_checkout_page.clickOnPlaceOrder();
        addToCart_checkout_page.insertCardName("Nada Kandil");
        addToCart_checkout_page.insertCardNo("202");
        addToCart_checkout_page.insertCardCVC("311");
        addToCart_checkout_page.insertCardExp1("03");
        addToCart_checkout_page.insertCardExp2("2023");
        addToCart_checkout_page.clickOnConfirmOrder();
        addToCart_checkout_page.clickOnDownloadInvoice();
        addToCart_checkout_page.clickOnContinueFinal();
        homePage.clickOnLogout();
        String check_logout = base_test_driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/h2")).getText();
        Assert.assertEquals(check_logout,"Login to your account");

    }


}
