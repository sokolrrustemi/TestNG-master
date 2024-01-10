package day07;

import day06._04_PlaceOrder_Elementleri;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Soru extends BaseDriver {


    @Test




    public void addToCart(){

        _04_PlaceOrder_Elementleri poe=new _04_PlaceOrder_Elementleri();
        _03_WishListElements wle=new _03_WishListElements();

        poe.searchBox.sendKeys("ipod" + Keys.ENTER);


        int randomSecim= MyFunc.randomGenerator(wle.productList.size());//random secilen ürünün indexi ( sayisi) alindi
        System.out.println("randomSecim = " + randomSecim); //kontrol icin yazildi
        String cartItemText=wle.productList.get(randomSecim).getText(); //randomdaki ürünün adi alindi
        System.out.println("cartItemText = " + cartItemText); //kontrol icin yazildi

        wle.addToChart.get(randomSecim).click(); //ilgili random ürünün wishbutonuna tiklandi
        wle.shoppingCart.click();


        //aradigimiz ürün listede yokmu?
        boolean bulundu=MyFunc.listContainsString(wle.wishList, cartItemText);

        Assert.assertTrue(bulundu, "Wish Listte atanan ürün bulunamadi");

    }}



