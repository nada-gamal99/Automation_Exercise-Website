package TestCases;

import Pages.HomePage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createNewAccount extends BaseTest {

HomePage homePage;
SignUpPage signUpPage;
@Test
public void CreateAccount_test01() throws InterruptedException {
    homePage = new HomePage(base_test_driver);
    homePage.clickOnSignupLoginBtn();
    Thread.sleep(1000);
    signUpPage= new SignUpPage(base_test_driver);
    signUpPage.insertName("Nada Kandil");
    signUpPage.insertEmail("nada399@gmail.com");
    signUpPage.clickOnSignup();
    signUpPage.clickOnGender();
    signUpPage.insertPassword("123456");
    signUpPage.insertDay();
    signUpPage.insertMonth();
    signUpPage.insertYear();
    signUpPage.clickOnNewSletter();
    signUpPage.clickOnSendOffers();
    signUpPage.insertFName("Nada");
    signUpPage.insertLName("Kandil");
    signUpPage.insertCompany("company");
    signUpPage.insertAddress("Street no.5");
    signUpPage.insertCountry("United States");
    signUpPage.insertState("0000");
    signUpPage.insertCity("Cairo");
    signUpPage.insertZipCode("00000");
    signUpPage.insertPhoneNo("+201000000000");
    signUpPage.clickOnSubmit();
    Thread.sleep(2000);
    signUpPage.clickOnContinue();
    String Check_SignUp = base_test_driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a")).getText();
    Assert.assertEquals(Check_SignUp, "Logged in as Nada Kandil");


}
}
