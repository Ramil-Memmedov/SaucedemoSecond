package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void enterUsername(String username) {
        sendKeys(usernameInput, username);
    }

    public void enterPassword(String password) {
        sendKeys(passwordInput, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}