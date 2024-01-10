package day06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/*
  Senaryo;
  1- Brands menusune gidiniz.
  2- Burada her bir markanın üstünde yer alan harf ile başladığını doğrulayınız
*/
public class _01_GenelSoru extends BaseDriver {

    @Test

    public  void brandsValidation() {

        WebElement brandsLink = driver.findElement(By.linkText("Brands"));
        brandsLink.click();



        List<WebElement> harfler = driver.findElements(By.cssSelector("[id='content'] > h2")); //harfler
        List<WebElement> markalarSatirlari = driver.findElements(By.cssSelector("[id='content'] > div")); //markalar satirlari

        for (int i = 0; i < harfler.size(); i++) {
            System.out.println(harfler.get(i).getText());
            List<WebElement> markalar = markalarSatirlari.get(i).findElements(By.tagName("div")); //markalar bunun icinde

            for (WebElement marka : markalar) {
                System.out.println(harfler.get(i).getText() + " " + marka.getText().charAt(0) + " " + marka.getText());
                Assert.assertEquals(harfler.get(i).getText().charAt(0), marka.getText().charAt(0));

                //TODO: https://www.ebay.com/n/all-brands ayni soru burdanda yapilabilir

            }


        }
    }}

