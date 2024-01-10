package day05;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Soru_CrossBrowser extends BaseDriverParameter {



    @Test(dataProvider = "UserData")

    public void searchText(String aaranacakText) {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.clear();
        searchInput.sendKeys(aaranacakText + Keys.ENTER);

        List<WebElement> captions = driver.findElements
                (By.cssSelector("[class='caption'] > h4"));

        for (WebElement e : captions) {
            //System.out.println("e.getText() = " + e.getText());
            Assert.assertTrue(e.getText().toLowerCase().contains(aaranacakText), "aranan kelime bulunamadı");


        }
    }

    @DataProvider
    public Object[] UserData() {
        Object[] aranacaklar = {"mac","htc","ipod"};

        return aranacaklar;

    }
}

