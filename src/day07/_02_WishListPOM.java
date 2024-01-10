package day07;

import day06._04_PlaceOrder_Elementleri;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_WishListPOM extends BaseDriver {


    @Test
    @Parameters("searchText")



    public void addToWishList(String aranacakKelime){

        _04_PlaceOrder_Elementleri poe=new _04_PlaceOrder_Elementleri();
        _03_WishListElements wle=new _03_WishListElements();

        poe.searchBox.sendKeys(aranacakKelime + Keys.ENTER);


        int randomSecim= MyFunc.randomGenerator(wle.productList.size());//random secilen ürünün indexi ( sayisi) alindi
        System.out.println("randomSecim = " + randomSecim); //kontrol icin yazildi
        String wishItemText=wle.productList.get(randomSecim).getText(); //randomdaki ürünün adi alindi
        System.out.println("wishItemText = " + wishItemText); //kontrol icin yazildi

        wle.wishButtons.get(randomSecim).click(); //ilgili random ürünün wishbutonuna tiklandi
        wle.wishListLink.click();


        //aradigimiz ürün listede yokmu?
        boolean bulundu=MyFunc.listContainsString(wle.wishList, wishItemText);

        Assert.assertTrue(bulundu, "Wish Listte atanan ürün bulunamadi");

    }}
