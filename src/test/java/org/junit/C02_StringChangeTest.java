package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class C02_StringChangeTest {

        C02_StringChange stringChange; //class static olmadigindan strchance obj create edildi

    @BeforeEach
    void setUp(){
        stringChange=new C02_StringChange();
        System.out.println("Test verisi girildi");
        System.out.println("***********");

    }

    @AfterEach
    void tearDown(){
        stringChange=null;

        System.out.println("Test verisi silindi");
        System.out.println("***********");
    }

    @ParameterizedTest
    @CsvSource(value={"BC, ABC", "'', A", "'',AA", "B, B", "BCDE, BCDE"})
    void ilkIkiSil(String sonuc, String girdi) {
        assertEquals(sonuc, stringChange.ilkIkiSil(girdi));

    }
}