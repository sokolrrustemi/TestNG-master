package day07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */


public class _01_WishList extends BaseDriver {

    @Test
    @Parameters("searchText")


    public void addToWhishList(String aranacakKelime){
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(aranacakKelime + Keys.ENTER);

        List<WebElement> wishButtons=driver.findElements(   //ürünlerin wish butonlari
                By.cssSelector("[class='button-group']>:nth-child(2)"));

        List<WebElement> productList=driver.findElements(  //ürünlerin basliklari
                By.cssSelector("[class='caption']>:nth-child(1)"));

        int randomSecim= MyFunc.randomGenerator(productList.size());//random secilen ürünün indexi ( sayisi) alindi
        System.out.println("randomSecim = " + randomSecim); //kontrol icin yazildi
        String wishItemText=productList.get(randomSecim).getText(); //randomdaki ürünün adi alindi
        System.out.println("wishItemText = " + wishItemText); //kontrol icin yazildi

        wishButtons.get(randomSecim).click(); //ilgili random ürünün wishbutonuna tiklandi

        WebElement wishListLink= driver.findElement(By.cssSelector("[class='fa fa-check-circle']+a+a"));
        wishListLink.click();

        //WishListe gidildi
        List<WebElement> wishList=driver.findElements(By.cssSelector("td[class='text-left']>:nth-child(1)"));

        //aradigimiz ürün listede yokmu?
        boolean bulundu=MyFunc.listContainsString(wishList, wishItemText);

        Assert.assertTrue(bulundu, "Wish Listte atanan ürün bulunamadi");






    }
}
