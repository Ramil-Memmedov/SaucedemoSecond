package tests;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;
import pages.LoginPage;


public class CartTest {

    WebDriver driver;
    LoginPage loginPage;
    CartPage cartPage;


    @Given("User is logged in")
    public void userIsLoggedIn() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);

        loginPage.openLoginPage();

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        cartPage = new CartPage(driver);
    }


    @When("User opens Cart page")
    public void userOpensCartPage() {

        cartPage.clickCartButton();
    }


    @Then("Cart page should be displayed")
    public void cartPageShouldBeDisplayed() {

        Assert.assertEquals(
                "Your Cart",
                cartPage.getCartTitle()
        );
    }


    @Then("Cart should contain product")
    public void cartShouldContainProduct() {

        Assert.assertTrue(
                cartPage.isProductAdded()
        );
    }
}