package org.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J04_TestingParameterized{

    @Test
    //Asla tavsiye edilmez --> failed olan testten sonra kalan verilere gore test gerceklesmeyecegi icin defect olur
    void uzunlukSifirdanByk(){
        assertTrue("star".length()>0);
        assertTrue("omer".length()>2);
        assertTrue("kursat".length()>3);
        assertTrue("suleyman".length()>6);

    }

    //TEKIL SART
    /*
    lenght() ile asagidaki sartlar icin 0' dan buyuk deger return ettigini test ediniz
    Sartlar: yildiz, suleyman, omer, kursat ---> bu datalar testi nasil gecer
     */

    @ParameterizedTest
    @ValueSource(strings = {"yildiz", "suleyman", "x", "omer", "kursat"}) //Bu test sadece bu
    void uzunlukSifirdanBykPrmtrl(String str){ //@ValueSource parametre elemanlari methoda parametre olarak donguye girerek test olur
        assertTrue(str.length()>2);
    }

    //COKLU SART--> Her parametre elemani KEY VALUE ikili ile test method' unda run edilir

    @ParameterizedTest
    @CsvSource(value={"yildiz,YILDIZ", "suleyman, SULEYMAN", "omer,OMER", "kursat, KURSAT"})
    //CSV: comma-separated values--> virgulle ayrilmis degerler
    void testBuyukHarfCevir(String isim, String beklenenBykHarf){
        //assertEquals(isim.toUpperCase(), beklenenBykHarf);

    }

    @ParameterizedTest(name="Expected(BUYUKHARF):{0},actual(cevirilecek):{1}")//CSVFileSource syntax
    @CsvFileSource(resources="/data.csv", numLinesToSkip = 1)//dosyamizdaki ilk satiri almasini engelemek icin numLinesToSkip = 1 methodunu kullandik
                                                            //numLinesToSkip = a a: start line dan itibaren kalan satirlara parametre olarak method da run edilir
    //CSV: comma-separated values--> virgulle ayrilmis degerler
    // @CsvFileSource belirli bir dosyada datalari cekerek test icin parametre olarak kullanir.
    // @CsvFileSource-->src/test/resource klasoru altina  konumlanmis dosyaya direkt ulasir
    void testBykHarfCvrFiles(String isim, String beklenenBykHarf){

        assertEquals(isim.toUpperCase(), beklenenBykHarf);

    }

}
