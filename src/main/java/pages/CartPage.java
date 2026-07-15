package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By cartButton = By.className("shopping_cart_link");
    private final By cartTitle = By.className("title");
    private final By cartItem = By.className("cart_item");

    public CartPage(WebDriver driver) {
        super(driver);
    }


    public void clickCartButton() {
        click(cartButton);
    }


    public String getCartTitle() {
        return getText(cartTitle);
    }


    public boolean isProductAdded() {
        return driver.findElements(cartItem).size() > 0;
    }
}