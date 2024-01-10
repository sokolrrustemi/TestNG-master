package day05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "datalarim")

    public void searchTest(String aranacakText){

        System.out.println("aranacakText = " + aranacakText);
    }

    @DataProvider
    Object[] datalarim(){

        Object[] aranacaklar={"mac","Samsung","Laptop"};

        return aranacaklar;
    }

    /**************************************************/

    @Test(dataProvider = "datalar") //dataProvidera verilen isimler de cagirabiliriz
    public void test2(int veri){
        System.out.println("veri = " + veri);

    }

    @DataProvider(name = "datalar") //kendin istersen birisim verebilirisin
    Object[] getData(){
        Object[] data={1,2,3,4,5,6};

        return data;


    }
}
