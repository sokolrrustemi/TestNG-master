package day06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrder extends BaseDriver {

    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

    @Test

    void test1(){

        WebElement searchBox= driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod"+ Keys.ENTER);

        WebElement addToCart= driver.findElement(By.xpath("(//button[@type='button'])[10]"));
        addToCart.click();

        WebElement shoppingToCart= driver.findElement(By.xpath("//*[text()='shopping cart']"));
        shoppingToCart.click();

        WebElement checkOut= driver.findElement(By.cssSelector("div[class='pull-right']>a"));
        checkOut.click();

        WebElement adress= driver.findElement(By.cssSelector("[id='button-payment-address']"));
        adress.click();


        WebElement adress2= driver.findElement(By.cssSelector("[id='button-shipping-address']"));
        adress2.click();

        WebElement deliverMethod= driver.findElement(By.cssSelector("[id='button-shipping-method']"));
        deliverMethod.click();

        WebElement agree= driver.findElement(By.name("agree"));
        agree.click();

        WebElement paymentMethod= driver.findElement(By.cssSelector("[id='button-payment-method']"));
        paymentMethod.click();

        WebElement confirmOrder= driver.findElement(By.cssSelector("[id='button-confirm']"));
        confirmOrder.click();

        WebElement msg= driver.findElement(By.cssSelector("div[id='content']> h1"));

        Assert.assertTrue(msg.isDisplayed());


    }
}
