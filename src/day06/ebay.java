package day06;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ebay {


    @Test

    public void brandsValidation() {

        WebDriver driver;

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.ebay.com/n/all-brands");


                List<WebElement> harfler = driver.findElements(By.cssSelector("div[class='data']>div"));


        for (int i = 0; i < harfler.size(); i++) {
            System.out.println(harfler.get(i).getAttribute("id"));
            List<WebElement> markalar = harfler.get(i).findElements(By.cssSelector("ul[class='itemcols'] li"));

            for (WebElement marka : markalar) {
                System.out.println(marka.getText());
            }
        }


        MyFunc.Bekle(30);
        driver.quit();
    } }