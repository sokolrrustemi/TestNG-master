package day06;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_PlaceOrder_Elementleri {

    public _04_PlaceOrder_Elementleri() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement addToCart;

    @FindBy(xpath = "//*[text()='shopping cart']")
    public WebElement shoppingToCart;

    @FindBy(css = "div[class='pull-right']>a")
    public WebElement checkOut;

    @FindBy(css = "[id='button-payment-address']")
    public WebElement  adress;

    @FindBy(css = "[id='button-shipping-address']")
    public WebElement  adress2;

    @FindBy(css = "[id='button-shipping-method']")
    public WebElement  deliverMethod;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(css = "[id='button-payment-method']")
    public WebElement paymentMethod;

    @FindBy(css = "[id='button-confirm']")
    public WebElement confirmOrder;

    @FindBy(css = "div[id='content']> h1")
    public WebElement msg;
}
