package day07;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _03_WishListElements {

    public _03_WishListElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(css="[class='button-group']>:nth-child(2)")
    public List<WebElement> wishButtons;

    @FindBy(css="[class='caption']>:nth-child(1)")
    public List<WebElement> productList;

    @FindBy(css="[class='fa fa-check-circle']+a+a")
    public WebElement wishListLink;

    @FindBy(css="td[class='text-left']>:nth-child(1)")
    public List<WebElement> wishList;

    @FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md' and text()='Add to Cart']")
    public List<WebElement> addToChart;

    @FindBy(linkText="Shopping Cart")
    public WebElement shoppingCart;


}


