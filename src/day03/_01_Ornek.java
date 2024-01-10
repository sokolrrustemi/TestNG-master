package day03;

/*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasına ulaşınız.
  3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_Ornek extends BaseDriver {

    @Test
    public void editAccount(){
        WebElement edit=driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement txtFirstName=driver.findElement(By.id("input-firstname"));
        txtFirstName.clear();
        txtFirstName.sendKeys("ismet 2");

        WebElement txtLastName=driver.findElement(By.id("input-lastname"));
        txtLastName.clear();
        txtLastName.sendKeys("temur 2");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        MyFunc.successMessageValidation();
    }

}
