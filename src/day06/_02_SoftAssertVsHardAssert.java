package day06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _02_SoftAssertVsHardAssert {

    @Test

    public void Hardassert(){
        String s1="Merhaba";

        System.out.println("Assert öncesi");
        Assert.assertEquals("Merhaba123", s1, "Olusanla beklenen ayni degil");
        System.out.println("Assert sonrasi");



    }

    @Test

    public void SoftAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAcoount="www.facebook.com/editaoccuntpage";

        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage ); //pass
        System.out.println("Assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage ); //fail
        System.out.println("Assert 2");

        _softAssert.assertEquals("www.facebook.com/settings", strEditAcoount ); //fail
        System.out.println("Assert 3");

        _softAssert.assertAll(); //bütün assert sonuclarini islme koyuyor

        System.out.println("soft assertAll(): aktiflik sonrasi");

        //bu bölüm assertAll dan sonra oldugu ve öncesinde aktiflik öncesinde hata olustugu icin ekrana cikmayacak






    }
}
