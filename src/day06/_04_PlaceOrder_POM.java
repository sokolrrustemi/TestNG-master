package day06;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrder_POM extends BaseDriver {

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

    public void ProceedToCheckout() {


        _04_PlaceOrder_Elementleri elements = new _04_PlaceOrder_Elementleri();


        elements.searchBox.sendKeys("ipod" + Keys.ENTER);
        elements.addToCart.click();
        elements.shoppingToCart.click();
        elements.checkOut.click();


        wait.until(ExpectedConditions.elementToBeClickable(elements.adress)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.adress2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.deliverMethod)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements. paymentMethod)).click();

        elements.confirmOrder.click();

        wait.until(ExpectedConditions.urlContains("success"));

        Assert.assertTrue(elements.msg.getText().equals("Your order has been placed!"));


    }
}
