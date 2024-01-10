package day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _02_Annotations {


    @AfterClass // class ın içindekilerden sonra çalışır
    public void bitisIslemleri(){
        System.out.println("after class işlemleri çalıştı");
    }

    @Test // Annotation : metodun türünü ve çalışma özelliklerini belirtir
    public void test1(){  // Test1 : test metodunun adı
        System.out.println("test 1 çalıştı");
    }

    @Test // Annotation : metodun türünü ve çalışma özelliklerini belirtir
    public void test2(){  // Test1 : test metodunun adı
        System.out.println("test 2 çalıştı");
    }

    @BeforeClass  // class ın içindekilerden önce çalışır
    public void baslangicIslemleri(){
        System.out.println("before class işlemleri çalıştı");
    }



}
