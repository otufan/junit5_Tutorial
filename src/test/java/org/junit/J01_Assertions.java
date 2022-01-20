package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {

    @Test
    @DisplayName("ToAssert Testing")
    void testToAssert(){
     int actual="zekeriya".length();
     int beklenen=8;

     //assertEquals(8,actual);// inLine style : her zaman kullanilmaz tavsiye edilmez
     //assertEquals(beklenen,actual); //
     //assertEquals(actual,beklenen);//expected ve actual deger yer degistirebilir
     //assertEquals(actual,beklenen, "beklenen ve actual deger esit degil");
     assertEquals(actual,beklenen, "beklenen ve actual deger esit degil"); //message hata durumunda(test failded) int edilir...
    //assertEquals(4,"aynur".length(), "inline style tavsiye edilmez!!!!");

    //1 assertEquals --> pozitif test: expected ve actual durumlarinin esit olmasini test eder ve ESIT OLMASI halinde PASSED
        // 4,"aynur".length(), "inline style tavsiye edilmez!!!!");


    // 2 assertNoEquals-->negatif test: expected ve actual durumlarinin ESIT OLMAMASINI test eder ve ESIT OLMAMASI durumda PASSED
        assertNotEquals(9, actual);

    //3 assertTrue--> pozitif test: olusturulan sart TRUE olmasi durumda (boolean durum) PASSED
        assertTrue(beklenen==actual);// passed
        beklenen=7;
        //assertTrue(beklenen==actual);// failed


    //4 assertFalse -->negatif test: olusturulan sart FALSE olmasi durumda (boolean durum) PASSED
        assertFalse(beklenen==actual);

    }
    @Test
    @DisplayName("ToAssert Testi")
    void testConvertToUpper(){
        String beklenen="ABDULLAH";
        String olusan="abdullah".toUpperCase();

        assertEquals(beklenen,olusan);//PASSED--> test datalari esit oldugu icin

        assertTrue(beklenen.equals(olusan));//PASSED
        beklenen="ABDULLAh";
        //assertTrue(beklenen.equals(olusan));//Failed cunku bir harfi kucuk

        assertFalse(beklenen.equals(olusan));//PASSED cunku burada hata olacagini soyluyoruz

        olusan=null;
        assertNull(olusan, "olusan deger null degildir");//PASSED cunku icerigin null oldugunu kontrol ettik ve olusani null olarak oncesinde UPDATE etmistik

        //assertNotNull(olusan);//FAILED cunku degerin null olup olmadigini kontrol ediyor ve deger null degilse birakiyor
        olusan="ahmet";
        assertNotNull(olusan);//PASSES cunku yukarida olusan isimli viable a biz deger atadik ve artik degeri null degil

        //integer da null degeri olmadigi icin (default deger 0) bu testi kullanamayiz

    }

    @Test
    @DisplayName("toContains test")
    void testToContains(){

        boolean olusan="mustafa".contains("hi"); //FALSE degerini verir

        boolean beklenen=false;

        assertEquals(olusan,beklenen, "String degeri barindirmaz");//PASSED

    }

    @Test
    @DisplayName("Arrays test")
    void testArray(){
        String str="Javacanlara selam olsun ayaginiza tas degmesin";

        String olusan[]=str.split(" ");
        String beklenen[]={"Javacanlara", "sela", "olsun", "ayaginiza" ,"tas", "degmesin"};

       // assertArrayEquals(beklenen,olusan,"Arrayler farklidir");//PASSED cunku arrayler esittir

        assertArrayEquals(beklenen,olusan,"Arrayler farklidir");//FAILED cunku ilk sorgudan sonra selam-->sela yaptik
                                                                        //Arrayler farklidir ==> array contents differ at index [1], expected: <sela> but was: <selam>


    }
}
