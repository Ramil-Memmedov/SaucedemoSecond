package tests;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on Login page")
    public void userIsOnLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
    }

    @When("User enters username {string}")
    public void userEntersUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("User clicks Login button")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to Inventory page")
    public void userShouldBeRedirectedToInventoryPage() {
        Assert.assertEquals(
                "https://www.saucedemo.com/inventory.html",
                loginPage.getCurrentUrl()
        );
    }

    @Then("User should see error message {string}")
    public void userShouldSeeErrorMessage(String expectedMessage) {
        Assert.assertEquals(
                expectedMessage,
                loginPage.getErrorMessage()
        );
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {

            File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            String screenshotName = scenario.getName()
                    .replace(" ", "_")
                    + "_" + System.currentTimeMillis()
                    + ".png";

            Path destination = Path.of("target/screenshots/" + screenshotName);

            Files.copy(
                    screenshot.toPath(),
                    destination
            );
        }

        if (driver != null) {
            driver.quit();
        }
    }}